package net.aepherastudios.createdefensive.fluid;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.fluid.fluid_types.*;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DefensiveFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(BuiltInRegistries.FLUID, CreateDefensive.MOD_ID);

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_CRUDE_OIL = FLUIDS.register("crude_oil",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.CRUDE_OIL_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_CRUDE_OIL = FLUIDS.register("flowing_crude_oil",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.CRUDE_OIL_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_DIRTY_RAW_CRUDE_OIL = FLUIDS.register("dirty_raw_crude_oil",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.DIRTY_RAW_CRUDE_OIL_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_DIRTY_RAW_CRUDE_OIL = FLUIDS.register("flowing_dirty_raw_crude_oil",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.DIRTY_RAW_CRUDE_OIL_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_RAW_CRUDE_OIL = FLUIDS.register("raw_crude_oil",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.RAW_CRUDE_OIL_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_RAW_CRUDE_OIL = FLUIDS.register("flowing_raw_crude_oil",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.RAW_CRUDE_OIL_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_NATURAL_GAS = FLUIDS.register("natural_gas",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.NATURAL_GAS_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_NATURAL_GAS = FLUIDS.register("flowing_natural_gas",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.NATURAL_GAS_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_RAW_NATURAL_GAS = FLUIDS.register("raw_natural_gas",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.RAW_NATURAL_GAS_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_RAW_NATURAL_GAS = FLUIDS.register("flowing_raw_natural_gas",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.RAW_NATURAL_GAS_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_GASOLINE = FLUIDS.register("gasoline",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.GASOLINE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GASOLINE = FLUIDS.register("flowing_gasoline",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.GASOLINE_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_KEROSENE = FLUIDS.register("kerosene",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.KEROSENE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_KEROSENE = FLUIDS.register("flowing_kerosene",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.KEROSENE_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_DIESEL = FLUIDS.register("diesel",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.DIESEL_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_DIESEL = FLUIDS.register("flowing_diesel",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.DIESEL_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_BITUMEN = FLUIDS.register("bitumen",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.BITUMEN_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BITUMEN = FLUIDS.register("flowing_bitumen",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.BITUMEN_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_BUTANE = FLUIDS.register("butane",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.BUTANE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_BUTANE = FLUIDS.register("flowing_butane",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.BUTANE_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_PROPANE = FLUIDS.register("propane",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.PROPANE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PROPANE = FLUIDS.register("flowing_propane",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.PROPANE_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_ETHANE = FLUIDS.register("ethane",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.ETHANE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ETHANE = FLUIDS.register("flowing_ethane",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.ETHANE_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_METHANE = FLUIDS.register("methane",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.METHANE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_METHANE = FLUIDS.register("flowing_methane",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.METHANE_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_CREOSOTE = FLUIDS.register("creosote",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.CREOSOTE_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_CREOSOTE = FLUIDS.register("flowing_creosote",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.CREOSOTE_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_STEAM = FLUIDS.register("steam",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.STEAM_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_STEAM = FLUIDS.register("flowing_steam",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.STEAM_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_HYDROGEN = FLUIDS.register("hydrogen",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.HYDROGEN_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_HYDROGEN = FLUIDS.register("flowing_hydrogen",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.HYDROGEN_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_OXYGEN = FLUIDS.register("oxygen",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.OXYGEN_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_OXYGEN = FLUIDS.register("flowing_oxygen",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.OXYGEN_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> SOURCE_MUSTARD_GAS = FLUIDS.register("mustard_gas",
            () -> new BaseFlowingFluid.Source(DefensiveFluids.MUSTARD_GAS_PROPERTIES));
    public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_MUSTARD_GAS = FLUIDS.register("flowing_mustard_gas",
            () -> new BaseFlowingFluid.Flowing(DefensiveFluids.MUSTARD_GAS_PROPERTIES));




    public static final BaseFlowingFluid.Properties CRUDE_OIL_PROPERTIES = new BaseFlowingFluid.Properties(
            CrudeOilFluidType.CRUDE_OIL_FLUID_TYPE, SOURCE_CRUDE_OIL, FLOWING_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.CRUDE_OIL)
            .bucket(DefensiveItems.CRUDE_OIL_BUCKET);

    public static final BaseFlowingFluid.Properties DIRTY_RAW_CRUDE_OIL_PROPERTIES = new BaseFlowingFluid.Properties(
            DirtyRawCrudeOilFluidType.DIRTY_RAW_CRUDE_OIL_FLUID_TYPE, SOURCE_DIRTY_RAW_CRUDE_OIL, FLOWING_DIRTY_RAW_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.DIRTY_RAW_CRUDE_OIL)
            .bucket(DefensiveItems.DIRTY_RAW_CRUDE_OIL_BUCKET);

    public static final BaseFlowingFluid.Properties RAW_CRUDE_OIL_PROPERTIES = new BaseFlowingFluid.Properties(
            RawCrudeOilFluidType.RAW_CRUDE_OIL_FLUID_TYPE, SOURCE_RAW_CRUDE_OIL, FLOWING_RAW_CRUDE_OIL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.RAW_CRUDE_OIL)
            .bucket(DefensiveItems.RAW_CRUDE_OIL_BUCKET);

    public static final BaseFlowingFluid.Properties NATURAL_GAS_PROPERTIES = new BaseFlowingFluid.Properties(
            NaturalGasFluidType.NATURAL_GAS_FLUID_TYPE, SOURCE_NATURAL_GAS, FLOWING_NATURAL_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.NATURAL_GAS)
            .bucket(DefensiveItems.NATURAL_GAS_BUCKET);

    public static final BaseFlowingFluid.Properties RAW_NATURAL_GAS_PROPERTIES = new BaseFlowingFluid.Properties(
            RawNaturalGasFluidType.RAW_NATURAL_GAS_FLUID_TYPE, SOURCE_RAW_NATURAL_GAS, FLOWING_RAW_NATURAL_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.RAW_NATURAL_GAS)
            .bucket(DefensiveItems.RAW_NATURAL_GAS_BUCKET);

    public static final BaseFlowingFluid.Properties GASOLINE_PROPERTIES = new BaseFlowingFluid.Properties(
            GasolineFluidType.GASOLINE_FLUID_TYPE, SOURCE_GASOLINE, FLOWING_GASOLINE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.GASOLINE)
            .bucket(DefensiveItems.GASOLINE_BUCKET);

    public static final BaseFlowingFluid.Properties KEROSENE_PROPERTIES = new BaseFlowingFluid.Properties(
            KeroseneFluidType.KEROSENE_FLUID_TYPE, SOURCE_KEROSENE, FLOWING_KEROSENE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.KEROSENE)
            .bucket(DefensiveItems.KEROSENE_BUCKET);

    public static final BaseFlowingFluid.Properties DIESEL_PROPERTIES = new BaseFlowingFluid.Properties(
            DieselFluidType.DIESEL_FLUID_TYPE, SOURCE_DIESEL, FLOWING_DIESEL)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.DIESEL)
            .bucket(DefensiveItems.DIESEL_BUCKET);

    public static final BaseFlowingFluid.Properties BITUMEN_PROPERTIES = new BaseFlowingFluid.Properties(
            BitumenFluidType.BITUMEN_FLUID_TYPE, SOURCE_BITUMEN, FLOWING_BITUMEN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.BITUMEN)
            .bucket(DefensiveItems.BITUMEN_BUCKET);

    public static final BaseFlowingFluid.Properties BUTANE_PROPERTIES = new BaseFlowingFluid.Properties(
            ButaneFluidType.BUTANE_FLUID_TYPE, SOURCE_BUTANE, FLOWING_BUTANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.BUTANE)
            .bucket(DefensiveItems.BUTANE_BUCKET);

    public static final BaseFlowingFluid.Properties PROPANE_PROPERTIES = new BaseFlowingFluid.Properties(
            PropaneFluidType.PROPANE_FLUID_TYPE, SOURCE_PROPANE, FLOWING_PROPANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.PROPANE)
            .bucket(DefensiveItems.PROPANE_BUCKET);

    public static final BaseFlowingFluid.Properties ETHANE_PROPERTIES = new BaseFlowingFluid.Properties(
            EthaneFluidType.ETHANE_FLUID_TYPE, SOURCE_ETHANE, FLOWING_ETHANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.ETHANE)
            .bucket(DefensiveItems.ETHANE_BUCKET);

    public static final BaseFlowingFluid.Properties METHANE_PROPERTIES = new BaseFlowingFluid.Properties(
            MethaneFluidType.METHANE_FLUID_TYPE, SOURCE_METHANE, FLOWING_METHANE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.METHANE)
            .bucket(DefensiveItems.METHANE_BUCKET);

    public static final BaseFlowingFluid.Properties CREOSOTE_PROPERTIES = new BaseFlowingFluid.Properties(
            CreosoteFluidType.CREOSOTE_FLUID_TYPE, SOURCE_CREOSOTE, FLOWING_CREOSOTE)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.CREOSOTE)
            .bucket(DefensiveItems.CREOSOTE_BUCKET);

    public static final BaseFlowingFluid.Properties STEAM_PROPERTIES = new BaseFlowingFluid.Properties(
            SteamFluidType.STEAM_FLUID_TYPE, SOURCE_STEAM, FLOWING_STEAM)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.STEAM)
            .bucket(DefensiveItems.STEAM_BUCKET);

    public static final BaseFlowingFluid.Properties HYDROGEN_PROPERTIES = new BaseFlowingFluid.Properties(
            HydrogenFluidType.HYDROGEN_FLUID_TYPE, SOURCE_HYDROGEN, FLOWING_HYDROGEN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.HYDROGEN)
            .bucket(DefensiveItems.HYDROGEN_BUCKET);

    public static final BaseFlowingFluid.Properties OXYGEN_PROPERTIES = new BaseFlowingFluid.Properties(
            OxygenFluidType.OXYGEN_FLUID_TYPE, SOURCE_OXYGEN, FLOWING_OXYGEN)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.OXYGEN)
            .bucket(DefensiveItems.OXYGEN_BUCKET);

    public static final BaseFlowingFluid.Properties MUSTARD_GAS_PROPERTIES = new BaseFlowingFluid.Properties(
            MustardGasFluidType.MUSTARD_GAS_FLUID_TYPE, SOURCE_MUSTARD_GAS, FLOWING_MUSTARD_GAS)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(DefensiveBlocks.MUSTARD_GAS)
            .bucket(DefensiveItems.MUSTARD_GAS_BUCKET);



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
