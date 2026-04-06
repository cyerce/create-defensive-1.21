package net.aepherastudios.createdefensive.item.custom.gun;

import net.aepherastudios.createdefensive.item.custom.bullet.BulletItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.ItemAbility;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public abstract class GunItem extends Item {

    private static final String TAG_ROOT       = "GunData";
    private static final String TAG_AMMO       = "ammo";
    private static final String TAG_AMMO_COUNT = "ammoCount";
    private static final String TAG_AIMING     = "aiming";

    private final int magazineSize;
    private final Class<? extends BulletItem> acceptedBulletClass;
    private final SoundEvent shootSound;
    private final SoundEvent reloadSound;
    private final SoundEvent emptySound;

    protected GunItem(
            int magazineSize,
            Class<? extends BulletItem> acceptedBulletClass,
            SoundEvent shootSound,
            SoundEvent reloadSound,
            SoundEvent emptySound,
            Properties properties
    ) {
        super(properties.stacksTo(1));
        this.magazineSize = magazineSize;
        this.acceptedBulletClass = acceptedBulletClass;
        this.shootSound = shootSound;
        this.reloadSound = reloadSound;
        this.emptySound = emptySound;
    }

    protected abstract void shoot(ServerLevel level, Player player, ItemStack stack, BulletItem bullet);

    public boolean tryShoot(Player player, ItemStack stack) {
        if (player.level().isClientSide) {
            return true;
        }
        Level level = player.level();
        if (level.isClientSide) return false;

        if (getAmmoCount(stack) <= 0) {
            tryReload(player, stack);
            return true;
        }

        BulletItem bullet = popNextBullet(stack);
        if (bullet == null) {
            tryReload(player, stack);
            return true;
        }

        if (level instanceof ServerLevel serverLevel) {
            shoot(serverLevel, player, stack, bullet);
            serverLevel.playSound(null, player.blockPosition(), shootSound, SoundSource.PLAYERS, 1.0f, 1.0f);
        }

        return true;
    }

    @Override
    public boolean onEntitySwing(ItemStack stack, LivingEntity entity) {
        return true;
    }

    public boolean canAttackBlock(BlockState state, Level level, BlockPos pos, Player player) {
        return false;
    }

    public void tryReload(Player player, ItemStack stack) {
        if (player.level().isClientSide) return;

        int current = getAmmoCount(stack);
        int needed  = magazineSize - current;


        if (needed <= 0) return;

        for (int i = 0; i < player.getInventory().getContainerSize() && needed > 0; i++) {
            ItemStack invStack = player.getInventory().getItem(i);
            if (invStack.isEmpty()) continue;

            if (!acceptedBulletClass.isInstance(invStack.getItem())) continue;

            BulletItem bullet = (BulletItem) invStack.getItem();
            int take = Math.min(invStack.getCount(), needed);

            for (int j = 0; j < take; j++) {
                pushBullet(stack, bullet);
                player.getCooldowns().addCooldown(this, 40);
            }

            invStack.shrink(take);
            needed -= take;
        }

        if (getAmmoCount(stack) > current) {
            player.level().playSound(null, player.blockPosition(), reloadSound, SoundSource.PLAYERS, 1.0f, 1.0f);
        } else {
            player.level().playSound(null, player.blockPosition(), emptySound, SoundSource.PLAYERS, 1.0f, 1.0f);
        }
    }

    protected static HitResult raycast(ServerLevel level, Player player, double range) {
        Vec3 start = player.getEyePosition();
        Vec3 end   = start.add(player.getLookAngle().scale(range));

        HitResult blockHit = level.clip(new ClipContext(
                start, end,
                ClipContext.Block.COLLIDER,
                ClipContext.Fluid.NONE,
                player
        ));

        Vec3 traceEnd = blockHit.getType() != HitResult.Type.MISS
                ? blockHit.getLocation() : end;

        AABB searchBox = new AABB(start, traceEnd).inflate(1.0);
        for (LivingEntity target : level.getEntitiesOfClass(LivingEntity.class, searchBox)) {
            if (target == player) continue;
            var clip = target.getBoundingBox().inflate(0.1).clip(start, traceEnd);
            if (clip.isPresent()) return new EntityHitResult(target, clip.get());
        }

        return blockHit;
    }

    protected static List<HitResult> raycastCone(ServerLevel level, Player player, double range, int pellets, float spreadDegrees) {
        List<HitResult> hits = new ArrayList<>();
        Vec3 start = player.getEyePosition();
        Vec3 look  = player.getLookAngle();

        for (int i = 0; i < pellets; i++) {
            double spreadRad = Math.toRadians(spreadDegrees);
            double offsetX = (level.random.nextDouble() * 2 - 1) * spreadRad;
            double offsetY = (level.random.nextDouble() * 2 - 1) * spreadRad;

            Vec3 spread = look
                    .add(player.getUpVector(1.0f).scale(offsetY))
                    .add(look.cross(player.getUpVector(1.0f)).scale(offsetX))
                    .normalize();

            Vec3 end = start.add(spread.scale(range));

            HitResult blockHit = level.clip(new ClipContext(
                    start, end,
                    ClipContext.Block.COLLIDER,
                    ClipContext.Fluid.NONE,
                    player
            ));

            Vec3 traceEnd = blockHit.getType() != HitResult.Type.MISS
                    ? blockHit.getLocation() : end;

            AABB searchBox = new AABB(start, traceEnd).inflate(1.0);
            boolean hitEntity = false;
            for (LivingEntity target : level.getEntitiesOfClass(LivingEntity.class, searchBox)) {
                if (target == player) continue;
                var clip = target.getBoundingBox().inflate(0.1).clip(start, traceEnd);
                if (clip.isPresent()) {
                    hits.add(new EntityHitResult(target, clip.get()));
                    hitEntity = true;
                    break;
                }
            }
            if (!hitEntity) hits.add(blockHit);
        }

        return hits;
    }

    public static int getAmmoCount(ItemStack stack) {
        return readGunTag(stack).getInt(TAG_AMMO_COUNT);
    }

    public static boolean isAiming(ItemStack stack) {
        return readGunTag(stack).getByte(TAG_AIMING) == 1;
    }

    public static float getNextBulletDamage(ItemStack stack) {
        BulletItem next = peekNextBullet(stack);
        return next != null ? next.getDamage() : 0.0f;
    }

    public static void setAiming(ItemStack stack, boolean aiming) {
        mutateGunTag(stack, tag -> tag.putByte(TAG_AIMING, aiming ? (byte) 1 : (byte) 0));
    }

    public int getMagazineSize() {
        return magazineSize;
    }

    private static void pushBullet(ItemStack stack, BulletItem bullet) {
        mutateGunTag(stack, tag -> {
            ListTag list = tag.getList(TAG_AMMO, Tag.TAG_STRING);
            list.add(StringTag.valueOf(BuiltInRegistries.ITEM.getKey(bullet).toString()));
            tag.put(TAG_AMMO, list);
            tag.putInt(TAG_AMMO_COUNT, list.size());
        });
    }

    private static BulletItem popNextBullet(ItemStack stack) {
        CompoundTag gunTag = readGunTag(stack);
        ListTag list = gunTag.getList(TAG_AMMO, Tag.TAG_STRING);
        if (list.isEmpty()) return null;

        String id = list.getString(0);
        list.remove(0);
        gunTag.put(TAG_AMMO, list);
        gunTag.putInt(TAG_AMMO_COUNT, list.size());
        writeGunTag(stack, gunTag);

        Item item = BuiltInRegistries.ITEM.get(ResourceLocation.parse(id));
        return item instanceof BulletItem b ? b : null;
    }

    private static BulletItem peekNextBullet(ItemStack stack) {
        ListTag list = readGunTag(stack).getList(TAG_AMMO, Tag.TAG_STRING);
        if (list.isEmpty()) return null;
        Item item = BuiltInRegistries.ITEM.get(ResourceLocation.parse(list.getString(0)));
        return item instanceof BulletItem b ? b : null;
    }

    private static CompoundTag readGunTag(ItemStack stack) {
        CustomData customData = stack.get(DataComponents.CUSTOM_DATA);
        if (customData == null) return new CompoundTag();
        CompoundTag root = customData.copyTag();
        return root.contains(TAG_ROOT) ? root.getCompound(TAG_ROOT) : new CompoundTag();
    }

    private static void writeGunTag(ItemStack stack, CompoundTag gunTag) {
        CompoundTag root = stack.has(DataComponents.CUSTOM_DATA)
                ? stack.get(DataComponents.CUSTOM_DATA).copyTag()
                : new CompoundTag();
        root.put(TAG_ROOT, gunTag);
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(root));
    }

    private static void mutateGunTag(ItemStack stack, Consumer<CompoundTag> mutation) {
        CompoundTag root = stack.has(DataComponents.CUSTOM_DATA)
                ? stack.get(DataComponents.CUSTOM_DATA).copyTag()
                : new CompoundTag();
        CompoundTag gunTag = root.contains(TAG_ROOT)
                ? root.getCompound(TAG_ROOT)
                : new CompoundTag();
        mutation.accept(gunTag);
        root.put(TAG_ROOT, gunTag);
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(root));
    }
}
