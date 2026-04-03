package net.aepherastudios.createdefensive.compat.jei;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.compat.jei.category.MixingCategory;
import com.simibubi.create.compat.jei.category.animations.AnimatedBlazeBurner;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.foundation.gui.AllGuiTextures;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.block.custom.CokingOvenBlock;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.Direction;

public class AnimatedCokingOven extends AnimatedKinetics {

    private final AnimatedBlazeBurner blazeBurner = new AnimatedBlazeBurner()
            .withHeat(BlazeBurnerBlock.HeatLevel.KINDLED);

    @Override
    public void draw(GuiGraphics graphics, int xOffset, int yOffset) {
        PoseStack matrixStack = graphics.pose();
        int scale = 23;

        // Blaze burner — using AnimatedBlazeBurner for proper flame rendering
        blazeBurner.draw(graphics, xOffset - 4, (yOffset + scale) - 40);

        // Coking oven — rendered above
        matrixStack.pushPose();
        matrixStack.translate(xOffset, yOffset, 201);
        matrixStack.translate(0, 0, 0);

        blockElement(DefensiveBlocks.COKING_OVEN.get().defaultBlockState()
                .setValue(CokingOvenBlock.LIT, true)
                .setValue(CokingOvenBlock.FACING, Direction.SOUTH))
                .rotateBlock(15.5, 22.5, 0)
                .scale(scale)
                .render(graphics);

        matrixStack.popPose();
    }
}
