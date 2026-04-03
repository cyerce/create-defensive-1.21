package net.aepherastudios.createdefensive.block;

import dev.engine_room.flywheel.api.visualization.VisualizerRegistry;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.entity.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DefensiveBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, CreateDefensive.MOD_ID);

    public static final Supplier<BlockEntityType<CokingOvenBlockEntity>> COKING_OVEN_BE =
            BLOCK_ENTITIES.register("coking_oven_be", () -> BlockEntityType.Builder.of(
                    CokingOvenBlockEntity::new, DefensiveBlocks.COKING_OVEN.get()).build(null));

    public static final Supplier<BlockEntityType<CentrifugeBlockEntity>> CENTRIFUGE_BE =
            BLOCK_ENTITIES.register("centrifuge_be", () -> BlockEntityType.Builder.of(
                    CentrifugeBlockEntity::new, DefensiveBlocks.CENTRIFUGE.get()).build(null));

    public static final Supplier<BlockEntityType<ProximityMineBlockEntity>> PROXIMITY_MINE_BE =
            BLOCK_ENTITIES.register("proximity_mine_be", () -> BlockEntityType.Builder.of(
                    ProximityMineBlockEntity::new, DefensiveBlocks.PROXIMITY_MINE.get()).build(null));

    public static final Supplier<BlockEntityType<FireGrateBlockEntity>> FIRE_GRATE_BE =
            BLOCK_ENTITIES.register("fire_grate_be", () -> BlockEntityType.Builder.of(
                    FireGrateBlockEntity::new, DefensiveBlocks.FIRE_GRATE.get()).build(null));

    public static final Supplier<BlockEntityType<LightningTrapBlockEntity>> LIGHTNING_TRAP_BE =
            BLOCK_ENTITIES.register("lightning_trap_be", () -> BlockEntityType.Builder.of(
                    LightningTrapBlockEntity::new, DefensiveBlocks.LIGHTNING_TRAP.get()).build(null));

    public static final Supplier<BlockEntityType<AirTrapBlockEntity>> AIR_TRAP_BE =
            BLOCK_ENTITIES.register("air_trap_be", () -> BlockEntityType.Builder.of(
                    AirTrapBlockEntity::new, DefensiveBlocks.AIR_TRAP.get()).build(null));

    public static final Supplier<BlockEntityType<GasTrapBlockEntity>> GAS_TRAP_BE =
            BLOCK_ENTITIES.register("gas_trap_be", () -> BlockEntityType.Builder.of(
                    GasTrapBlockEntity::new, DefensiveBlocks.GAS_TRAP.get()).build(null));

    public static final Supplier<BlockEntityType<FractionalStillControllerBlockEntity>> FRACTIONAL_STILL_BE =
            BLOCK_ENTITIES.register("fractional_still_be", () -> BlockEntityType.Builder.of(
                    FractionalStillControllerBlockEntity::new, DefensiveBlocks.FRACTIONAL_STILL_CONTROLLER.get()).build(null));

    public static final Supplier<BlockEntityType<FractionalStillTank>> FRACTIONAL_STILL_OUTPUT_BE =
            BLOCK_ENTITIES.register("fractional_still_output_be", () -> BlockEntityType.Builder.of(
                    FractionalStillTank::new, DefensiveBlocks.FRACTIONAL_STILL_TANK.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
