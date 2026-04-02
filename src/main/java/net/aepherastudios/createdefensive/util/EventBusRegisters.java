package net.aepherastudios.createdefensive.util;

import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.fluid.fluid_types.*;
import net.aepherastudios.createdefensive.item.DefensiveCreativeModeTabs;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.screen.DefensiveMenuTypes;
import net.neoforged.bus.api.IEventBus;

public class EventBusRegisters {
    public static void register(IEventBus modEventBus){
        DefensiveEffects.register(modEventBus);
        DefensiveEntities.register(modEventBus);
        DefensiveItems.register(modEventBus);
        DefensiveBlocks.register(modEventBus);
        DefensiveBlockEntities.register(modEventBus);
        DefensiveMenuTypes.register(modEventBus);
        DefensiveCreativeModeTabs.register(modEventBus);

        CrudeOilFluidType.register(modEventBus);
        DirtyRawCrudeOilFluidType.register(modEventBus);
        RawCrudeOilFluidType.register(modEventBus);
        RawNaturalGasFluidType.register(modEventBus);
        NaturalGasFluidType.register(modEventBus);
        ButaneFluidType.register(modEventBus);
        PropaneFluidType.register(modEventBus);
        EthaneFluidType.register(modEventBus);
        MethaneFluidType.register(modEventBus);
        GasolineFluidType.register(modEventBus);
        KeroseneFluidType.register(modEventBus);
        DieselFluidType.register(modEventBus);
        BitumenFluidType.register(modEventBus);

        DefensiveFluids.register(modEventBus);
    }
}
