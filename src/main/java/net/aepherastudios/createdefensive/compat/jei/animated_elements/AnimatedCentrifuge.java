package net.aepherastudios.createdefensive.compat.jei.animated_elements;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.animations.AnimatedKinetics;
import com.simibubi.create.foundation.gui.AllGuiTextures;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.block.client.DefensivePartialModels;
import net.minecraft.client.gui.GuiGraphics;

public class AnimatedCentrifuge extends AnimatedKinetics {

    @Override
    public void draw(GuiGraphics graphics, int xOffset, int yOffset) {
        PoseStack matrixStack = graphics.pose();
        matrixStack.pushPose();
        matrixStack.translate(xOffset, yOffset, 0);
        AllGuiTextures.JEI_SHADOW.render(graphics, -16, 13);
        matrixStack.translate(-2, 18, 0);
        int scale = 22;

        blockElement(DefensivePartialModels.CENTRIFUGE_COG)
                .rotateBlock(15.5, getCurrentAngle() * 2, 0)
                .scale(scale)
                .render(graphics);

        blockElement(DefensiveBlocks.CENTRIFUGE.get().defaultBlockState())
                .rotateBlock(15.5, 22.5, 0)
                .scale(scale)
                .render(graphics);

        matrixStack.popPose();
    }

}
