package net.aepherastudios.createdefensive.fluid.fluid_types;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.fluid.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

public class KeroseneFluidType {
    public static final ResourceLocation STILL_RL = ResourceLocation.fromNamespaceAndPath("minecraft","block/water_still");
    public static final ResourceLocation FLOWING_RL = ResourceLocation.fromNamespaceAndPath("minecraft","block/water_flow");
    public static final ResourceLocation OVERLAY_RL = ResourceLocation.fromNamespaceAndPath("minecraft","block/water_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CreateDefensive.MOD_ID);

    public static final DeferredHolder<FluidType, FluidType> KEROSENE_FLUID_TYPE = register("kerosene_fluid",
            FluidType.Properties.create().density(15).viscosity(5));



    private static DeferredHolder<FluidType, FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(STILL_RL, FLOWING_RL, OVERLAY_RL,
                0xA19ffffb, new Vector3f(159f / 255f, 1.0f, 251f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
