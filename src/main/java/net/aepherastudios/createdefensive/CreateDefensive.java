package net.aepherastudios.createdefensive;

import com.simibubi.create.api.stress.BlockStressValues;
import com.simibubi.create.compat.jei.category.animations.AnimatedMillstone;
import com.simibubi.create.content.kinetics.press.MechanicalPressBlock;
import com.simibubi.create.infrastructure.config.CStress;
import dev.engine_room.flywheel.api.visual.BlockEntityVisual;
import dev.engine_room.flywheel.api.visualization.BlockEntityVisualizer;
import dev.engine_room.flywheel.api.visualization.VisualizationContext;
import dev.engine_room.flywheel.api.visualization.VisualizerRegistry;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.block.client.CentrifugeRenderer;
import net.aepherastudios.createdefensive.block.client.CentrifugeVisual;
import net.aepherastudios.createdefensive.block.entity.CentrifugeBlockEntity;
import net.aepherastudios.createdefensive.entity.model.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.model.SpearModel;
import net.aepherastudios.createdefensive.entity.model.ThrowingStarModel;
import net.aepherastudios.createdefensive.event.DefensiveEventBusClientEvents;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.aepherastudios.createdefensive.screen.DefensiveMenuTypes;
import net.aepherastudios.createdefensive.screen.screen.CokingOvenScreen;
import net.aepherastudios.createdefensive.util.DefensiveEntityRenderers;
import net.aepherastudios.createdefensive.util.DefensiveItemProperties;
import net.aepherastudios.createdefensive.util.EventBusRegisters;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
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
        modEventBus.register(DefensiveEventBusClientEvents.class);


        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        NeoForge.EVENT_BUS.addListener((ServerStartedEvent event) -> {
            var recipes = event.getServer().getRecipeManager()
                    .getAllRecipesFor(DefensiveRecipes.COKING_TYPE.get());
            CreateDefensive.LOGGER.info("Loaded {} coking recipes", recipes.size());
        });

    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            DefensiveItemProperties.addCustomItemProperties();
        });

        VisualizerRegistry.setVisualizer(
                DefensiveBlockEntities.CENTRIFUGE_BE.get(),
                new BlockEntityVisualizer<CentrifugeBlockEntity>() {
                    @Override
                    public BlockEntityVisual<? super CentrifugeBlockEntity> createVisual(VisualizationContext ctx, CentrifugeBlockEntity blockEntity, float partialTick) {
                        return new CentrifugeVisual(ctx, blockEntity, partialTick);
                    }

                    @Override
                    public boolean skipVanillaRender(CentrifugeBlockEntity blockEntity) {
                        return true;
                    }
                }
        );
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            BlockStressValues.IMPACTS.register(
                    DefensiveBlocks.CENTRIFUGE.get(),
                    () -> 16
            );
        });
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
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.SOURCE_HYDROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.FLOWING_HYDROGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.SOURCE_OXYGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.FLOWING_OXYGEN.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.SOURCE_STEAM.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(DefensiveFluids.FLOWING_STEAM.get(), RenderType.translucent());

            BlockEntityRenderers.register(DefensiveBlockEntities.CENTRIFUGE_BE.get(),
                    CentrifugeRenderer::new);
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