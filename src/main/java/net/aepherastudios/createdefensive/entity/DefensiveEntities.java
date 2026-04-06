package net.aepherastudios.createdefensive.entity;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.custom.*;
import net.aepherastudios.createdefensive.entity.custom.dynamite.ChemicalDynamiteEntity;
import net.aepherastudios.createdefensive.entity.custom.dynamite.DynamiteEntity;
import net.aepherastudios.createdefensive.entity.custom.dynamite.IncendiaryDynamiteEntity;
import net.aepherastudios.createdefensive.entity.custom.dynamite.NuclearDynamiteEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DefensiveEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, CreateDefensive.MOD_ID);


    public static final Supplier<EntityType<PrimedHighPowerExplosive>> PRIMED_HIGH_POWER_EXPLOSIVE =
            ENTITY_TYPES.register("primed_high_power_explosive", () -> EntityType.Builder.<PrimedHighPowerExplosive>of(
                    PrimedHighPowerExplosive::new, MobCategory.MISC).sized(0.98f, 0.98f).build("primed_high_power_explosive"));

    public static final Supplier<EntityType<SpearEntity>> ALUMINUM_SPEAR =
            ENTITY_TYPES.register("aluminum_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("aluminum_spear"));

    public static final Supplier<EntityType<SpearEntity>> SILVER_SPEAR =
            ENTITY_TYPES.register("silver_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("silver_spear"));

    public static final Supplier<EntityType<SpearEntity>> PLATINUM_SPEAR =
            ENTITY_TYPES.register("platinum_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("platinum_spear"));

    public static final Supplier<EntityType<SpearEntity>> STEEL_SPEAR =
            ENTITY_TYPES.register("steel_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("steel_spear"));

    public static final Supplier<EntityType<SpearEntity>> COPPER_SPEAR =
            ENTITY_TYPES.register("copper_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("copper_spear"));

    public static final Supplier<EntityType<SpearEntity>> ZINC_SPEAR =
            ENTITY_TYPES.register("zinc_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("zinc_spear"));

    public static final Supplier<EntityType<SpearEntity>> BRASS_SPEAR =
            ENTITY_TYPES.register("brass_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("brass_spear"));

    public static final Supplier<EntityType<SpearEntity>> ROSE_QUARTZ_SPEAR =
            ENTITY_TYPES.register("rose_quartz_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rose_quartz_spear"));

    public static final Supplier<EntityType<SpearEntity>> ELECTRUM_SPEAR =
            ENTITY_TYPES.register("electrum_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("electrum_spear"));

    public static final Supplier<EntityType<SpearEntity>> STARDUST_SPEAR =
            ENTITY_TYPES.register("stardust_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stardust_spear"));

    public static final Supplier<EntityType<SpearEntity>> PYRAEN_SPEAR =
            ENTITY_TYPES.register("pyraen_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("pyraen_spear"));

    public static final Supplier<EntityType<SpearEntity>> WOODEN_SPEAR =
            ENTITY_TYPES.register("wooden_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("wooden_spear"));

    public static final Supplier<EntityType<SpearEntity>> STONE_SPEAR =
            ENTITY_TYPES.register("stone_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stone_spear"));

    public static final Supplier<EntityType<SpearEntity>> IRON_SPEAR =
            ENTITY_TYPES.register("iron_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("iron_spear"));

    public static final Supplier<EntityType<SpearEntity>> GOLDEN_SPEAR =
            ENTITY_TYPES.register("golden_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("golden_spear"));

    public static final Supplier<EntityType<SpearEntity>> DIAMOND_SPEAR =
            ENTITY_TYPES.register("diamond_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("diamond_spear"));

    public static final Supplier<EntityType<SpearEntity>> NETHERITE_SPEAR =
            ENTITY_TYPES.register("netherite_spear", () -> EntityType.Builder.<SpearEntity>of(
                    SpearEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("netherite_spear"));



    public static final Supplier<EntityType<ThrowingStarEntity>> ALUMINUM_THROWING_STAR =
            ENTITY_TYPES.register("aluminum_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("aluminum_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> SILVER_THROWING_STAR =
            ENTITY_TYPES.register("silver_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("silver_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> PLATINUM_THROWING_STAR =
            ENTITY_TYPES.register("platinum_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("platinum_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> STEEL_THROWING_STAR =
            ENTITY_TYPES.register("steel_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("steel_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> COPPER_THROWING_STAR =
            ENTITY_TYPES.register("copper_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("copper_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> ZINC_THROWING_STAR =
            ENTITY_TYPES.register("zinc_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("zinc_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> BRASS_THROWING_STAR =
            ENTITY_TYPES.register("brass_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("brass_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> ROSE_QUARTZ_THROWING_STAR =
            ENTITY_TYPES.register("rose_quartz_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rose_quartz_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> ELECTRUM_THROWING_STAR =
            ENTITY_TYPES.register("electrum_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("electrum_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> STARDUST_THROWING_STAR =
            ENTITY_TYPES.register("stardust_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stardust_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> PYRAEN_THROWING_STAR =
            ENTITY_TYPES.register("pyraen_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("pyraen_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> WOODEN_THROWING_STAR =
            ENTITY_TYPES.register("wooden_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("wooden_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> STONE_THROWING_STAR =
            ENTITY_TYPES.register("stone_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stone_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> IRON_THROWING_STAR =
            ENTITY_TYPES.register("iron_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("iron_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> GOLDEN_THROWING_STAR =
            ENTITY_TYPES.register("golden_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("golden_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> DIAMOND_THROWING_STAR =
            ENTITY_TYPES.register("diamond_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("diamond_throwing_star"));

    public static final Supplier<EntityType<ThrowingStarEntity>> NETHERITE_THROWING_STAR =
            ENTITY_TYPES.register("netherite_throwing_star", () -> EntityType.Builder.<ThrowingStarEntity>of(
                    ThrowingStarEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("netherite_throwing_star"));



    public static final Supplier<EntityType<ArrowEntity>> ALUMINUM_ARROW =
            ENTITY_TYPES.register("aluminum_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("aluminum_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> SILVER_ARROW =
            ENTITY_TYPES.register("silver_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("silver_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> PLATINUM_ARROW =
            ENTITY_TYPES.register("platinum_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("platinum_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> STEEL_ARROW =
            ENTITY_TYPES.register("steel_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("steel_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> COPPER_ARROW =
            ENTITY_TYPES.register("copper_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("copper_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> ZINC_ARROW =
            ENTITY_TYPES.register("zinc_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("zinc_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> BRASS_ARROW =
            ENTITY_TYPES.register("brass_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("brass_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> ROSE_QUARTZ_ARROW =
            ENTITY_TYPES.register("rose_quartz_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rose_quartz_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> ELECTRUM_ARROW =
            ENTITY_TYPES.register("electrum_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("electrum_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> STARDUST_ARROW =
            ENTITY_TYPES.register("stardust_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stardust_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> PYRAEN_ARROW =
            ENTITY_TYPES.register("pyraen_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("pyraen_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> WOODEN_ARROW =
            ENTITY_TYPES.register("wooden_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("wooden_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> STONE_ARROW =
            ENTITY_TYPES.register("stone_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("stone_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> IRON_ARROW =
            ENTITY_TYPES.register("iron_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("iron_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> GOLDEN_ARROW =
            ENTITY_TYPES.register("golden_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("golden_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> DIAMOND_ARROW =
            ENTITY_TYPES.register("diamond_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("diamond_arrow"));

    public static final Supplier<EntityType<ArrowEntity>> NETHERITE_ARROW =
            ENTITY_TYPES.register("netherite_arrow", () -> EntityType.Builder.<ArrowEntity>of(
                    ArrowEntity::new, MobCategory.MISC).sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("netherite_arrow"));



    public static final Supplier<EntityType<SuperheatedBlazeEntity>> SUPERHEATED_BLAZE =
            ENTITY_TYPES.register("superheated_blaze", () -> EntityType.Builder.of(SuperheatedBlazeEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1.8f).fireImmune().clientTrackingRange(8).build("superheated_blaze"));



    public static final Supplier<EntityType<PrimedChemicalExplosive>> PRIMED_CHEMICAL_EXPLOSIVE =
            ENTITY_TYPES.register("primed_chemical_explosive", () -> EntityType.Builder.of(PrimedChemicalExplosive::new, MobCategory.MISC)
                    .sized(1f, 1f).fireImmune().clientTrackingRange(8).build("primed_chemical_explosive"));

    public static final Supplier<EntityType<PrimedIncendiaryExplosive>> PRIMED_INCENDIARY_EXPLOSIVE =
            ENTITY_TYPES.register("primed_incendiary_explosive", () -> EntityType.Builder.of(PrimedIncendiaryExplosive::new, MobCategory.MISC)
                    .sized(1f, 1f).fireImmune().clientTrackingRange(8).build("primed_incendiary_explosive"));

    public static final Supplier<EntityType<DynamiteEntity>> DYNAMITE =
            ENTITY_TYPES.register("dynamite", () -> EntityType.Builder.<DynamiteEntity>of(DynamiteEntity::new, MobCategory.MISC)
                    .sized(0.25f, 0.25f).fireImmune().clientTrackingRange(4).build("dynamite"));

    public static final Supplier<EntityType<IncendiaryDynamiteEntity>> INCENDIARY_DYNAMITE =
            ENTITY_TYPES.register("incendiary_dynamite", () -> EntityType.Builder.<IncendiaryDynamiteEntity>of(IncendiaryDynamiteEntity::new, MobCategory.MISC)
                    .sized(0.25f, 0.25f).fireImmune().clientTrackingRange(4).build("incendiary_dynamite"));

    public static final Supplier<EntityType<ChemicalDynamiteEntity>> CHEMICAL_DYNAMITE =
            ENTITY_TYPES.register("chemical_dynamite", () -> EntityType.Builder.<ChemicalDynamiteEntity>of(ChemicalDynamiteEntity::new, MobCategory.MISC)
                    .sized(0.25f, 0.25f).fireImmune().clientTrackingRange(4).build("chemical_dynamite"));

    public static final Supplier<EntityType<NuclearDynamiteEntity>> NUCLEAR_DYNAMITE =
            ENTITY_TYPES.register("nuclear_dynamite", () -> EntityType.Builder.<NuclearDynamiteEntity>of(NuclearDynamiteEntity::new, MobCategory.MISC)
                    .sized(0.25f, 0.25f).fireImmune().clientTrackingRange(4).build("nuclear_dynamite"));



    public static final Supplier<EntityType<GasCloudEntity>> GAS_CLOUD =
            ENTITY_TYPES.register("gas_cloud", () -> EntityType.Builder.of(GasCloudEntity::new, MobCategory.MISC)
                    .sized(1f, 0.5f).fireImmune().clientTrackingRange(4).build("gas_cloud"));

    public static final Supplier<EntityType<RadiationCloudEntity>> RADIATION_CLOUD =
            ENTITY_TYPES.register("radiation_cloud", () -> EntityType.Builder.of(RadiationCloudEntity::new, MobCategory.MISC)
                    .sized(1f, 0.5f).fireImmune().clientTrackingRange(4).build("radiation_cloud"));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
