package net.aepherastudios.createdefensive.entity.client;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DefensiveArrowRenderer extends ArrowRenderer {

    private String name;

    public DefensiveArrowRenderer(EntityRendererProvider.Context context, String name) {
        super(context);
        this.name = name;
    }

    @Override
    public ResourceLocation getTextureLocation(Entity entity) {
        return ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "textures/entity/projectiles/" + name + ".png");
    }
}
