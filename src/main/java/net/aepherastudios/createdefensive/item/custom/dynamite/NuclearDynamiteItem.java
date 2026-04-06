package net.aepherastudios.createdefensive.item.custom.dynamite;

import net.aepherastudios.createdefensive.entity.custom.dynamite.NuclearDynamiteEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.Level;

public class NuclearDynamiteItem extends Item implements ProjectileItem {
    public NuclearDynamiteItem(Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        level.playSound((Player)null, player.getX(), player.getY(), player.getZ(), SoundEvents.SNOWBALL_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        player.getCooldowns().addCooldown(this, 20);
        if (!level.isClientSide) {
            NuclearDynamiteEntity nuclearDynamiteEntity = new NuclearDynamiteEntity(level, player);
            nuclearDynamiteEntity.setItem(itemstack);
            nuclearDynamiteEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(nuclearDynamiteEntity);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        itemstack.consume(1, player);
        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
    }

    public Projectile asProjectile(Level level, Position pos, ItemStack stack, Direction direction) {
        NuclearDynamiteEntity nuclearDynamiteEntity = new NuclearDynamiteEntity(level, pos.x(), pos.y(), pos.z());
        nuclearDynamiteEntity.setItem(stack);
        return nuclearDynamiteEntity;
    }
}