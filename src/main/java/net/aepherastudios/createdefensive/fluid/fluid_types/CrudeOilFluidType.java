package net.aepherastudios.createdefensive.fluid.fluid_types;

import com.simibubi.create.Create;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.fluid.BaseFluidType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.material.WaterFluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.joml.Vector3f;

public class CrudeOilFluidType {
    public static final ResourceLocation STILL_RL = ResourceLocation.fromNamespaceAndPath("minecraft","block/water_still");
    public static final ResourceLocation FLOWING_RL = ResourceLocation.fromNamespaceAndPath("minecraft","block/water_flow");
    public static final ResourceLocation OVERLAY_RL = ResourceLocation.fromNamespaceAndPath("minecraft","block/water_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CreateDefensive.MOD_ID);

    public static final DeferredHolder<FluidType, FluidType> CRUDE_OIL_FLUID_TYPE = register("crude_oil_fluid",
            FluidType.Properties.create().density(15).viscosity(5));



    private static DeferredHolder<FluidType, FluidType> register(String name, FluidType.Properties properties) {
        return FLUID_TYPES.register(name, () -> new BaseFluidType(STILL_RL, FLOWING_RL, OVERLAY_RL,
                0xA11A1A1A, new Vector3f(26f / 255f, 26f / 255f, 26f / 255f), properties));
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
