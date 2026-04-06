package net.aepherastudios.createdefensive.util;

import com.sun.jna.platform.mac.Carbon;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.fluid.fluid_types.*;
import net.aepherastudios.createdefensive.item.DefensiveCreativeModeTabs;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.particle.DefensiveParticles;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipeTypes;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.aepherastudios.createdefensive.screen.DefensiveMenuTypes;
import net.aepherastudios.createdefensive.worldgen.DefensiveFeatures;
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
        DefensiveRecipeTypes.register(modEventBus);
        DefensiveRecipes.register(modEventBus);
        DefensiveParticles.register(modEventBus);
        DefensiveFeatures.register(modEventBus);

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
        CreosoteFluidType.register(modEventBus);
        HydrogenFluidType.register(modEventBus);
        OxygenFluidType.register(modEventBus);
        SteamFluidType.register(modEventBus);
        MustardGasFluidType.register(modEventBus);
        AmmoniaFluidType.register(modEventBus);
        FormaldehydeFluidType.register(modEventBus);
        MethanolFluidType.register(modEventBus);
        CarbonMonoxideFluidType.register(modEventBus);
        EthyleneFluidType.register(modEventBus);
        SulfurDichlorideFluidType.register(modEventBus);
        ChlorineFluidType.register(modEventBus);
        BenzeneFluidType.register(modEventBus);
        EthylbenzeneFluidType.register(modEventBus);
        StyreneFluidType.register(modEventBus);
        MoltenSaltFluidType.register(modEventBus);
        MoltenSodiumFluidType.register(modEventBus);


        DefensiveFluids.register(modEventBus);
    }
}
