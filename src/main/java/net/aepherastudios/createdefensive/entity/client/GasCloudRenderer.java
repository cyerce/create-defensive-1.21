package net.aepherastudios.createdefensive.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.aepherastudios.createdefensive.entity.custom.GasCloudEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class GasCloudRenderer extends EntityRenderer<GasCloudEntity> {

    public GasCloudRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(GasCloudEntity entity) {
        return ResourceLocation.fromNamespaceAndPath("minecraft", "textures/misc/transparent.png");
    }

    public void render(
            GasCloudRenderer entity,
            float entityYaw,
            float partialTick,
            PoseStack poseStack,
            MultiBufferSource bufferSource,
            int packedLight
    ) {}
}
