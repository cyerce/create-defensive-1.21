package net.aepherastudios.createdefensive.event;

import net.aepherastudios.createdefensive.block.client.DefensivePartialModels;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.SuperheatedBlazeEntity;
import net.aepherastudios.createdefensive.entity.model.DefensiveModelLayers;
import net.aepherastudios.createdefensive.entity.model.SpearModel;
import net.aepherastudios.createdefensive.entity.model.ThrowingStarModel;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.item.custom.gun.GunItem;
import net.aepherastudios.createdefensive.util.AimPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.ModelEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.network.PacketDistributor;

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

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            registerGunPredicates(DefensiveItems.PISTOL.get());
            registerGunPredicates(DefensiveItems.RIFLE.get());
            registerGunPredicates(DefensiveItems.SHOTGUN.get());
        });
    }

    private static void registerGunPredicates(net.minecraft.world.item.Item item) {
        ItemProperties.register(item,
                ResourceLocation.fromNamespaceAndPath("createdefensive", "aiming"),
                (stack, level, entity, seed) ->
                        GunItem.isAiming(stack) ? 1.0f : 0.0f
        );

        ItemProperties.register(item,
                ResourceLocation.fromNamespaceAndPath("createdefensive", "loaded"),
                (stack, level, entity, seed) ->
                        GunItem.getAmmoCount(stack) == 0 ? 1.0f : 0.0f
        );
    }
}