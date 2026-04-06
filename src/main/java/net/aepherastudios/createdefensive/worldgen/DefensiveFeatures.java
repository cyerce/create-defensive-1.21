package net.aepherastudios.createdefensive.worldgen;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.worldgen.features.NaturalGasReserveFeature;
import net.aepherastudios.createdefensive.worldgen.features.OilReserveFeature;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DefensiveFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registries.FEATURE, CreateDefensive.MOD_ID);

    public static final DeferredHolder<Feature<?>, OilReserveFeature> OIL_RESERVE =
            FEATURES.register("oil_reserve", OilReserveFeature::new);

    public static final DeferredHolder<Feature<?>, NaturalGasReserveFeature> NATURAL_GAS_RESERVE =
            FEATURES.register("natural_gas_reserve", NaturalGasReserveFeature::new);

    public static void register(IEventBus modEventBus){
        FEATURES.register(modEventBus);
    }
}
