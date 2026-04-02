package net.aepherastudios.createdefensive;

import net.aepherastudios.createdefensive.entity.model.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.model.SpearModel;
import net.aepherastudios.createdefensive.entity.model.ThrowingStarModel;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.screen.DefensiveMenuTypes;
import net.aepherastudios.createdefensive.screen.screen.CokingOvenScreen;
import net.aepherastudios.createdefensive.util.DefensiveEntityRenderers;
import net.aepherastudios.createdefensive.util.DefensiveItemProperties;
import net.aepherastudios.createdefensive.util.EventBusRegisters;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(CreateDefensive.MOD_ID)
public class CreateDefensive {

    public static final String MOD_ID = "createdefensive";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateDefensive(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        NeoForge.EVENT_BUS.register(this);
        EventBusRegisters.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            DefensiveItemProperties.addCustomItemProperties();
        });
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = CreateDefensive.MOD_ID, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {

            DefensiveEntityRenderers.renderEntities();

            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.SOURCE_NATURAL_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.FLOWING_NATURAL_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.SOURCE_RAW_NATURAL_GAS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.FLOWING_RAW_NATURAL_GAS.get(), RenderType.translucent());


        }

        @SubscribeEvent
        public static void registerScreens(RegisterMenuScreensEvent event) {
            event.register(DefensiveMenuTypes.COKING_OVEN_MENU.get(), CokingOvenScreen::new);
        }

        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(
                    DefensiveModelLayers.SPEAR_LAYER,
                    SpearModel::createLayer
            );
            event.registerLayerDefinition(
                    DefensiveModelLayers.THROWING_STAR_LAYER,
                    ThrowingStarModel::createLayer
            );
        }
    }
}