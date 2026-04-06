package net.aepherastudios.createdefensive.compat.jei.animated_elements;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.client.gui.GuiGraphics;

public class AnimatedElectrolysis extends AnimatedKinetics {

    @Override
    public void draw(GuiGraphics graphics, int xOffset, int yOffset) {
        PoseStack matrixStack = graphics.pose();
        int scale = 15;

        matrixStack.pushPose();
        matrixStack.translate(xOffset, yOffset, 201);
        matrixStack.translate(0, 15, 0);

        blockElement(DefensiveBlocks.ELECTROLYSIS_CONTROLLER.get().defaultBlockState())
                .rotateBlock(15.5, 180, 0)
                .scale(scale)
                .at(0, 0, 0)
                .render(graphics);
        blockElement(DefensiveBlocks.COPPER_ELECTROLYSIS_TANK.get().defaultBlockState())
                .rotateBlock(15.5, 0, 0)
                .scale(scale)
                .at(-15, 0, 0)
                .render(graphics);
        blockElement(DefensiveBlocks.ZINC_ELECTROLYSIS_TANK.get().defaultBlockState())
                .rotateBlock(15.5, 0, 0)
                .scale(scale)
                .at(15, 0, 0)
                .render(graphics);

        matrixStack.popPose();
    }
}
