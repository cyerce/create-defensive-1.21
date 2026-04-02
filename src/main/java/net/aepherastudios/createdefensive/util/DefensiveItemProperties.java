package net.aepherastudios.createdefensive.util;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class DefensiveItemProperties {
    public static void addCustomItemProperties() {
        makeBow(DefensiveItems.ALUMINUM_BOW.get());
        makeBow(DefensiveItems.SILVER_BOW.get());
        makeBow(DefensiveItems.PLATINUM_BOW.get());
        makeBow(DefensiveItems.STEEL_BOW.get());
        makeBow(DefensiveItems.COPPER_BOW.get());
        makeBow(DefensiveItems.ZINC_BOW.get());
        makeBow(DefensiveItems.BRASS_BOW.get());
        makeBow(DefensiveItems.ROSE_QUARTZ_BOW.get());
        makeBow(DefensiveItems.WOODEN_BOW.get());
        makeBow(DefensiveItems.STONE_BOW.get());
        makeBow(DefensiveItems.IRON_BOW.get());
        makeBow(DefensiveItems.GOLDEN_BOW.get());
        makeBow(DefensiveItems.DIAMOND_BOW.get());
        makeBow(DefensiveItems.NETHERITE_BOW.get());
        makeBow(DefensiveItems.ELECTRUM_BOW.get());
        makeBow(DefensiveItems.STARDUST_BOW.get());
        makeBow(DefensiveItems.PYRAEN_BOW.get());
        
        makeSpear(DefensiveItems.ALUMINUM_SPEAR.get());
        makeSpear(DefensiveItems.SILVER_SPEAR.get());
        makeSpear(DefensiveItems.PLATINUM_SPEAR.get());
        makeSpear(DefensiveItems.STEEL_SPEAR.get());
        makeSpear(DefensiveItems.COPPER_SPEAR.get());
        makeSpear(DefensiveItems.ZINC_SPEAR.get());
        makeSpear(DefensiveItems.BRASS_SPEAR.get());
        makeSpear(DefensiveItems.ROSE_QUARTZ_SPEAR.get());
        makeSpear(DefensiveItems.WOODEN_SPEAR.get());
        makeSpear(DefensiveItems.STONE_SPEAR.get());
        makeSpear(DefensiveItems.IRON_SPEAR.get());
        makeSpear(DefensiveItems.GOLDEN_SPEAR.get());
        makeSpear(DefensiveItems.DIAMOND_SPEAR.get());
        makeSpear(DefensiveItems.NETHERITE_SPEAR.get());
        makeSpear(DefensiveItems.ELECTRUM_SPEAR.get());
        makeSpear(DefensiveItems.STARDUST_SPEAR.get());
        makeSpear(DefensiveItems.PYRAEN_SPEAR.get());

        makeSpear(DefensiveItems.ALUMINUM_THROWING_STAR.get());
        makeSpear(DefensiveItems.SILVER_THROWING_STAR.get());
        makeSpear(DefensiveItems.PLATINUM_THROWING_STAR.get());
        makeSpear(DefensiveItems.STEEL_THROWING_STAR.get());
        makeSpear(DefensiveItems.COPPER_THROWING_STAR.get());
        makeSpear(DefensiveItems.ZINC_THROWING_STAR.get());
        makeSpear(DefensiveItems.BRASS_THROWING_STAR.get());
        makeSpear(DefensiveItems.ROSE_QUARTZ_THROWING_STAR.get());
        makeSpear(DefensiveItems.WOODEN_THROWING_STAR.get());
        makeSpear(DefensiveItems.STONE_THROWING_STAR.get());
        makeSpear(DefensiveItems.IRON_THROWING_STAR.get());
        makeSpear(DefensiveItems.GOLDEN_THROWING_STAR.get());
        makeSpear(DefensiveItems.DIAMOND_THROWING_STAR.get());
        makeSpear(DefensiveItems.NETHERITE_THROWING_STAR.get());
        makeSpear(DefensiveItems.ELECTRUM_THROWING_STAR.get());
        makeSpear(DefensiveItems.STARDUST_THROWING_STAR.get());
        makeSpear(DefensiveItems.PYRAEN_THROWING_STAR.get());

        makeCrossbow(DefensiveItems.ALUMINUM_CROSSBOW.get());
        makeCrossbow(DefensiveItems.SILVER_CROSSBOW.get());
        makeCrossbow(DefensiveItems.PLATINUM_CROSSBOW.get());
        makeCrossbow(DefensiveItems.STEEL_CROSSBOW.get());
        makeCrossbow(DefensiveItems.COPPER_CROSSBOW.get());
        makeCrossbow(DefensiveItems.ZINC_CROSSBOW.get());
        makeCrossbow(DefensiveItems.BRASS_CROSSBOW.get());
        makeCrossbow(DefensiveItems.ROSE_QUARTZ_CROSSBOW.get());
        makeCrossbow(DefensiveItems.WOODEN_CROSSBOW.get());
        makeCrossbow(DefensiveItems.STONE_CROSSBOW.get());
        makeCrossbow(DefensiveItems.IRON_CROSSBOW.get());
        makeCrossbow(DefensiveItems.GOLDEN_CROSSBOW.get());
        makeCrossbow(DefensiveItems.DIAMOND_CROSSBOW.get());
        makeCrossbow(DefensiveItems.NETHERITE_CROSSBOW.get());
        makeCrossbow(DefensiveItems.ELECTRUM_CROSSBOW.get());
        makeCrossbow(DefensiveItems.STARDUST_CROSSBOW.get());
        makeCrossbow(DefensiveItems.PYRAEN_CROSSBOW.get());
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"),
                (stack, level, entity, seed) -> {
                    if (entity == null) return 0.0F;
                    return entity.getUseItem() != stack ? 0.0F :
                            (float)(stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / 20.0F;
                });

        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"),
                (stack, level, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0F : 0.0F
        );
    }

    private static void makeSpear(Item item) {
        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("throwing"), (itemStack, level, entity, i) -> {
            return entity != null && entity.isUsingItem() && entity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });
    }

    private static void makeCrossbow(Item item) {

        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pull"),
                (stack, level, entity, seed) -> {
                    if (entity == null) return 0.0F;
                    return CrossbowItem.isCharged(stack) ? 0.0F :
                            (float)(stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) /
                                    (float)CrossbowItem.getChargeDuration(stack, entity);
                });

        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("pulling"),
                (stack, level, entity, seed) ->
                        entity != null && entity.isUsingItem() && entity.getUseItem() == stack && !CrossbowItem.isCharged(stack)
                                ? 1.0F : 0.0F
        );

        ItemProperties.register(item, ResourceLocation.withDefaultNamespace("charged"),
                (stack, level, entity, seed) ->
                        CrossbowItem.isCharged(stack) ? 1.0F : 0.0F
        );
    }
}