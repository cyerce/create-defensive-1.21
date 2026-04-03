package net.aepherastudios.createdefensive.event;

import com.simibubi.create.AllItems;
import dev.engine_room.flywheel.api.visual.BlockEntityVisual;
import dev.engine_room.flywheel.api.visualization.BlockEntityVisualizer;
import dev.engine_room.flywheel.api.visualization.VisualizationContext;
import dev.engine_room.flywheel.api.visualization.VisualizerRegistry;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.client.CentrifugeVisual;
import net.aepherastudios.createdefensive.block.entity.CentrifugeBlockEntity;
import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.SuperheatedBlazeEntity;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.item.custom.*;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

import java.util.HashSet;
import java.util.Set;


@EventBusSubscriber(modid = CreateDefensive.MOD_ID)
public class DefensiveEvents {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    // Done with the help of https://github.com/CoFH/CoFHCore/blob/1.19.x/src/main/java/cofh/core/event/AreaEffectEvents.java
    // Don't be a jerk, License

    //I hope I licensed correctly
    @SubscribeEvent
    public static void onHammerUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if(mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayer serverPlayer) {
            BlockPos initialBlockPos = event.getPos();
            if(HARVESTED_BLOCKS.contains(initialBlockPos)) {
                return;
            }

            for(BlockPos pos : HammerItem.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer)) {
                if(pos == initialBlockPos || !hammer.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }
    @SubscribeEvent
    public static void onExcavatorUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if(mainHandItem.getItem() instanceof ExcavatorItem excavator && player instanceof ServerPlayer serverPlayer) {
            BlockPos initialBlockPos = event.getPos();
            if(HARVESTED_BLOCKS.contains(initialBlockPos)) {
                return;
            }

            for(BlockPos pos : ExcavatorItem.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer)) {
                if(pos == initialBlockPos || !excavator.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

    @SubscribeEvent
    public static void onScytheUsage(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        ItemStack mainHandItem = player.getMainHandItem();

        if(mainHandItem.getItem() instanceof ScytheItem scythe && player instanceof ServerPlayer serverPlayer) {
            BlockPos initialBlockPos = event.getPos();
            if(HARVESTED_BLOCKS.contains(initialBlockPos)) {
                return;
            }

            for(BlockPos pos : ScytheItem.getBlocksToBeDestroyed(1, initialBlockPos, serverPlayer)) {
                if(pos == initialBlockPos || !scythe.isCorrectToolForDrops(mainHandItem, event.getLevel().getBlockState(pos))) {
                    continue;
                }

                HARVESTED_BLOCKS.add(pos);
                serverPlayer.gameMode.destroyBlock(pos);
                HARVESTED_BLOCKS.remove(pos);
            }
        }
    }

    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event.getEntity().hasEffect(DefensiveEffects.CRYSTALLIZED_EXPERIENCE)) {
            if (event.getEntity().getRandom().nextFloat() < 0.5F) {
                event.getEntity().spawnAtLocation(new ItemStack(DefensiveItems.EXPERIENCE_CRYSTAL.get()));
            }
            event.getEntity().spawnAtLocation(new ItemStack(AllItems.EXP_NUGGET.get()));
        } else if (event.getEntity().hasEffect(DefensiveEffects.CRYSTALLIZED_REDSTONE)) {
            if (event.getEntity().getRandom().nextFloat() < 0.5F) {
                event.getEntity().spawnAtLocation(new ItemStack(DefensiveItems.REDSTONE_CRYSTAL_CLUSTER.get()));
            }
            event.getEntity().spawnAtLocation(new ItemStack(DefensiveItems.REDSTONE_CRYSTAL.get()));
            event.getEntity().spawnAtLocation(new ItemStack(DefensiveItems.REDSTONE_CRYSTAL.get()));
        }

        LivingEntity victim = event.getEntity();
        Entity aggressor = event.getSource().getEntity();
        if (aggressor != null){
            ItemStack weapon = aggressor.getWeaponItem();
            if ((weapon.getItem() instanceof ScytheItem) && (aggressor instanceof LivingEntity)){
                ((LivingEntity) aggressor).heal(victim.getMaxHealth() / 5);
            }
        }
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingDamageEvent.Pre event) {

        LivingEntity victim = event.getEntity();
        Entity aggressor = event.getSource().getEntity();

        float adjustedDamage = event.getNewDamage();

        if (aggressor != null) {

            double dx = victim.getX() - aggressor.getX();
            double dz = victim.getZ() - aggressor.getZ();
            double distance = Math.sqrt(dx * dx + dz * dz);
            if (distance < 0.001) distance = 0.001;

            if (!(aggressor instanceof LivingEntity attacker)) return;

            ItemStack weapon = attacker.getItemInHand(InteractionHand.MAIN_HAND);

            if (weapon.getItem() instanceof GreatswordItem || weapon.getItem() instanceof HammerItem) {
                double strength = 2;
                victim.push(dx / distance * strength, 0.1, dz / distance * strength);
                victim.hurtMarked = true;
            }

            if (weapon.getItem() instanceof StaffItem) {
                attacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0));
                attacker.addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 1));
            }

            if (weapon.getItem() instanceof ZweihanderItem) {

                float originalDamage = event.getNewDamage();

                int armorValue = victim.getArmorValue();
                float armorReduction = armorValue * 0.04f;
                float ignored = armorReduction * 0.5f;

                adjustedDamage = originalDamage / (1 - (armorReduction - ignored));
            }
        }

        if (victim.hasEffect(DefensiveEffects.TARRED)) {

            DamageSource source = event.getSource();
            if (source.is(DamageTypes.IN_FIRE) || source.is(DamageTypes.ON_FIRE)) {
                adjustedDamage = event.getNewDamage() * 2.0f;
            }
        }

        event.setNewDamage(adjustedDamage);
    }

    @SubscribeEvent
    public static void onMobEffectRemove(MobEffectEvent.Remove event) {
        if (event.getEffectInstance() != null &&
                event.getEffectInstance().getEffect() == DefensiveEffects.LACERATION) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
                Capabilities.FluidHandler.BLOCK,
                DefensiveBlockEntities.COKING_OVEN_BE.get(),
                (blockEntity, side) -> blockEntity.getFluidHandler(side)
        );

        event.registerBlockEntity(
                Capabilities.ItemHandler.BLOCK,
                DefensiveBlockEntities.CENTRIFUGE_BE.get(),
                (be, side) -> be.inputInv
        );

        event.registerBlockEntity(
                Capabilities.FluidHandler.BLOCK,
                DefensiveBlockEntities.FRACTIONAL_STILL_BE.get(),
                (be, side) -> be.inputTank
        );

        event.registerBlockEntity(
                Capabilities.FluidHandler.BLOCK,
                DefensiveBlockEntities.FRACTIONAL_STILL_OUTPUT_BE.get(),
                (be, side) -> be.fluidTank
        );
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event){
        event.register(DefensiveEntities.SUPERHEATED_BLAZE.get(),
                SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                SuperheatedBlazeEntity::checkMobSpawnRules,
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }
}
