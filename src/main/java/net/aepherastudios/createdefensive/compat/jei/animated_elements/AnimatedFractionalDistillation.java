package net.aepherastudios.createdefensive.compat.jei.animated_elements;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.client.gui.GuiGraphics;

public class AnimatedFractionalDistillation extends AnimatedKinetics {

    private final SmallAnimatedBlazeBurner blazeBurner = new SmallAnimatedBlazeBurner()
            .withHeat(BlazeBurnerBlock.HeatLevel.KINDLED, 10);


    @Override
    public void draw(GuiGraphics graphics, int xOffset, int yOffset) {
        PoseStack matrixStack = graphics.pose();
        int scale = 10;

        blazeBurner.draw(graphics, xOffset - 2, (yOffset + scale) - 3);

        matrixStack.pushPose();
        matrixStack.translate(xOffset, yOffset, 201);
        matrixStack.translate(0, 15, 0);

        blockElement(DefensiveBlocks.FRACTIONAL_STILL_CONTROLLER.get().defaultBlockState())
                .rotateBlock(15.5, 22.5, 0)
                .scale(scale)
                .at(0, 0, 0)
                .render(graphics);
        blockElement(DefensiveBlocks.FRACTIONAL_STILL_TANK.get().defaultBlockState())
                .rotateBlock(15.5, 22.5, 0)
                .scale(scale)
                .at(0, -10, 0)
                .render(graphics);
        blockElement(DefensiveBlocks.FRACTIONAL_STILL_TANK.get().defaultBlockState())
                .rotateBlock(15.5, 22.5, 0)
                .scale(scale)
                .at(0, -20, 0)
                .render(graphics);
        blockElement(DefensiveBlocks.FRACTIONAL_STILL_TANK.get().defaultBlockState())
                .rotateBlock(15.5, 22.5, 0)
                .scale(scale)
                .at(0, -30, 0)
                .render(graphics);
        blockElement(DefensiveBlocks.FRACTIONAL_STILL_TANK.get().defaultBlockState())
                .rotateBlock(15.5, 22.5, 0)
                .scale(scale)
                .at(0, -40, 0)
                .render(graphics);

        matrixStack.popPose();
    }
}
