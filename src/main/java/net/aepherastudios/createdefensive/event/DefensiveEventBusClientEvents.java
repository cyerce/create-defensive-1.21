package net.aepherastudios.createdefensive.event;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.client.DefensivePartialModels;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.SuperheatedBlazeEntity;
import net.aepherastudios.createdefensive.entity.model.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.model.SpearModel;
import net.aepherastudios.createdefensive.entity.model.ThrowingStarModel;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.ModelEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

public class DefensiveEventBusClientEvents {
    @SubscribeEvent
    public static void registerAluminumSpearLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.SPEAR_LAYER, SpearModel::createLayer);
    }

    @SubscribeEvent
    public static void registerAluminumThrowingStarLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(DefensiveModelLayers.THROWING_STAR_LAYER, ThrowingStarModel::createLayer);
    }


    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(DefensiveEntities.SUPERHEATED_BLAZE.get(), SuperheatedBlazeEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterAdditional(ModelEvent.RegisterAdditional event) {
        DefensivePartialModels.init();
    }
}