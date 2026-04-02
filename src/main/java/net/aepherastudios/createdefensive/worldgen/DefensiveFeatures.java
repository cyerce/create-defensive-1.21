package net.aepherastudios.createdefensive.worldgen;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.worldgen.features.NaturalGasLakeFeature;
import net.aepherastudios.createdefensive.worldgen.features.OilLakeFeature;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DefensiveFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registries.FEATURE, CreateDefensive.MOD_ID);

    public static final Supplier<Feature<NoneFeatureConfiguration>> OIL_LAKE =
            FEATURES.register("oil_lake", () -> new OilLakeFeature(NoneFeatureConfiguration.CODEC));
    public static final Supplier<Feature<NoneFeatureConfiguration>> NATURAL_GAS_LAKE =
            FEATURES.register("natural_gas_lake", () -> new NaturalGasLakeFeature(NoneFeatureConfiguration.CODEC));


    public static final ResourceKey<ConfiguredFeature<?, ?>> OIL_LAKE_KEY = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "oil_lake")
    );

    public static final ResourceKey<ConfiguredFeature<?, ?>> NATURAL_GAS_LAKE_KEY = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "natural_gas_lake")
    );


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        context.register(OIL_LAKE_KEY, new ConfiguredFeature<>(
                OIL_LAKE.get(), NoneFeatureConfiguration.INSTANCE));
        context.register(NATURAL_GAS_LAKE_KEY, new ConfiguredFeature<>(
                NATURAL_GAS_LAKE.get(), NoneFeatureConfiguration.INSTANCE));

        context.register(OIL_LAKE_KEY, new ConfiguredFeature<>(
                OIL_LAKE.get(), NoneFeatureConfiguration.INSTANCE));
        context.register(NATURAL_GAS_LAKE_KEY, new ConfiguredFeature<>(
                NATURAL_GAS_LAKE.get(), NoneFeatureConfiguration.INSTANCE));
    }

}
