package net.aepherastudios.createdefensive.compat.jei.animated_elements;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.animations.AnimatedBlazeBurner;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.block.custom.machine.CokingOvenBlock;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.core.Direction;

public class AnimatedCokingOven extends AnimatedKinetics {

    private final AnimatedBlazeBurner blazeBurner = new AnimatedBlazeBurner()
            .withHeat(BlazeBurnerBlock.HeatLevel.KINDLED);

    @Override
    public void draw(GuiGraphics graphics, int xOffset, int yOffset) {
        PoseStack matrixStack = graphics.pose();
        int scale = 23;

        blazeBurner.draw(graphics, xOffset - 4, (yOffset + scale) - 40);

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
