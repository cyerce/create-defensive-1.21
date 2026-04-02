package net.aepherastudios.createdefensive.entity.model;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class DefensiveModelLayers {
    public static final ModelLayerLocation SPEAR_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "spear_layer"), "main");

    public static final ModelLayerLocation THROWING_STAR_LAYER = new ModelLayerLocation(
            ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "throwing_star_layer"), "main");
}
