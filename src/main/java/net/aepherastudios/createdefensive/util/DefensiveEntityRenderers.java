package net.aepherastudios.createdefensive.util;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.client.*;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;

import static net.aepherastudios.createdefensive.entity.DefensiveEntities.SUPERHEATED_BLAZE;

public class DefensiveEntityRenderers {
    public DefensiveEntityRenderers(){
    }

    public static void renderEntities(){
        EntityRenderers.register(DefensiveEntities.ALUMINUM_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "aluminum_spear"));
        EntityRenderers.register(DefensiveEntities.SILVER_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "silver_spear"));
        EntityRenderers.register(DefensiveEntities.PLATINUM_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "platinum_spear"));
        EntityRenderers.register(DefensiveEntities.STEEL_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "steel_spear"));
        EntityRenderers.register(DefensiveEntities.COPPER_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "copper_spear"));
        EntityRenderers.register(DefensiveEntities.ZINC_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "zinc_spear"));
        EntityRenderers.register(DefensiveEntities.BRASS_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "brass_spear"));
        EntityRenderers.register(DefensiveEntities.ROSE_QUARTZ_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "rose_quartz_spear"));
        EntityRenderers.register(DefensiveEntities.ELECTRUM_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "electrum_spear"));
        EntityRenderers.register(DefensiveEntities.STARDUST_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "stardust_spear"));
        EntityRenderers.register(DefensiveEntities.PYRAEN_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "pyraen_spear"));
        EntityRenderers.register(DefensiveEntities.WOODEN_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "wooden_spear"));
        EntityRenderers.register(DefensiveEntities.STONE_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "stone_spear"));
        EntityRenderers.register(DefensiveEntities.IRON_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "iron_spear"));
        EntityRenderers.register(DefensiveEntities.GOLDEN_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "golden_spear"));
        EntityRenderers.register(DefensiveEntities.DIAMOND_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "diamond_spear"));
        EntityRenderers.register(DefensiveEntities.NETHERITE_SPEAR.get(), (EntityRendererProvider.Context pContext) -> new SpearRenderer(pContext, "netherite_spear"));

        EntityRenderers.register(DefensiveEntities.ALUMINUM_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "aluminum_throwing_star"));
        EntityRenderers.register(DefensiveEntities.SILVER_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "silver_throwing_star"));
        EntityRenderers.register(DefensiveEntities.PLATINUM_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "platinum_throwing_star"));
        EntityRenderers.register(DefensiveEntities.STEEL_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "steel_throwing_star"));
        EntityRenderers.register(DefensiveEntities.COPPER_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "copper_throwing_star"));
        EntityRenderers.register(DefensiveEntities.ZINC_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "zinc_throwing_star"));
        EntityRenderers.register(DefensiveEntities.BRASS_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "brass_throwing_star"));
        EntityRenderers.register(DefensiveEntities.ROSE_QUARTZ_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "rose_quartz_throwing_star"));
        EntityRenderers.register(DefensiveEntities.ELECTRUM_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "electrum_throwing_star"));
        EntityRenderers.register(DefensiveEntities.STARDUST_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "stardust_throwing_star"));
        EntityRenderers.register(DefensiveEntities.PYRAEN_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "pyraen_throwing_star"));
        EntityRenderers.register(DefensiveEntities.WOODEN_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "wooden_throwing_star"));
        EntityRenderers.register(DefensiveEntities.STONE_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "stone_throwing_star"));
        EntityRenderers.register(DefensiveEntities.IRON_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "iron_throwing_star"));
        EntityRenderers.register(DefensiveEntities.GOLDEN_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "golden_throwing_star"));
        EntityRenderers.register(DefensiveEntities.DIAMOND_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "diamond_throwing_star"));
        EntityRenderers.register(DefensiveEntities.NETHERITE_THROWING_STAR.get(), (EntityRendererProvider.Context pContext) -> new ThrowingStarRenderer(pContext, "netherite_throwing_star"));

        EntityRenderers.register(DefensiveEntities.ALUMINUM_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "aluminum_arrow"));
        EntityRenderers.register(DefensiveEntities.SILVER_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "silver_arrow"));
        EntityRenderers.register(DefensiveEntities.PLATINUM_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "platinum_arrow"));
        EntityRenderers.register(DefensiveEntities.STEEL_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "steel_arrow"));
        EntityRenderers.register(DefensiveEntities.COPPER_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "copper_arrow"));
        EntityRenderers.register(DefensiveEntities.ZINC_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "zinc_arrow"));
        EntityRenderers.register(DefensiveEntities.BRASS_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "brass_arrow"));
        EntityRenderers.register(DefensiveEntities.ROSE_QUARTZ_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "rose_quartz_arrow"));
        EntityRenderers.register(DefensiveEntities.ELECTRUM_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "electrum_arrow"));
        EntityRenderers.register(DefensiveEntities.STARDUST_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "stardust_arrow"));
        EntityRenderers.register(DefensiveEntities.PYRAEN_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "pyraen_arrow"));
        EntityRenderers.register(DefensiveEntities.WOODEN_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "wooden_arrow"));
        EntityRenderers.register(DefensiveEntities.STONE_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "stone_arrow"));
        EntityRenderers.register(DefensiveEntities.IRON_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "iron_arrow"));
        EntityRenderers.register(DefensiveEntities.GOLDEN_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "golden_arrow"));
        EntityRenderers.register(DefensiveEntities.DIAMOND_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "diamond_arrow"));
        EntityRenderers.register(DefensiveEntities.NETHERITE_ARROW.get(), (EntityRendererProvider.Context pContext) -> new DefensiveArrowRenderer(pContext, "netherite_arrow"));

        EntityRenderers.register(SUPERHEATED_BLAZE.get(), SuperheatedBlazeEntityRenderer::new);

        EntityRenderers.register(DefensiveEntities.PRIMED_HIGH_POWER_EXPLOSIVE.get(), PrimedHighExplosiveRenderer::new);

    }

}
