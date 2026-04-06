package net.aepherastudios.createdefensive.particle;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DefensiveParticles {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, CreateDefensive.MOD_ID);

    public static final Supplier<SimpleParticleType> RADIOACTIVE_CLOUD_PARTICLES =
            PARTICLE_TYPES.register("radioactive_cloud_particles", () -> new SimpleParticleType(false));

    public static final Supplier<SimpleParticleType> MUSTARD_GAS_PARTICLES =
            PARTICLE_TYPES.register("mustard_gas_particles", () -> new SimpleParticleType(false));


    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
