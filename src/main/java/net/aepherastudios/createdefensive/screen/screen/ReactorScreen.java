package net.aepherastudios.createdefensive.screen.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.screen.menu.ReactorMenu;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

import java.util.List;

public class ReactorScreen extends AbstractContainerScreen<ReactorMenu> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "textures/gui/reactor.png");

    // Coolant input tank (8x17 to 20x68)
    private static final int COOLANT_IN_X = 8;
    private static final int COOLANT_IN_Y = 17;
    private static final int COOLANT_IN_W = 12;
    private static final int COOLANT_IN_H = 51;

    // Coolant output tank (26x17 to 38x68)
    private static final int COOLANT_OUT_X = 26;
    private static final int COOLANT_OUT_Y = 17;
    private static final int COOLANT_OUT_W = 12;
    private static final int COOLANT_OUT_H = 51;

    // Resource input tank (137x17 to 149x68)
    private static final int RESOURCE_IN_X = 137;
    private static final int RESOURCE_IN_Y = 17;
    private static final int RESOURCE_IN_W = 12;
    private static final int RESOURCE_IN_H = 51;

    // Resource output tank (155x17 to 167x68)
    private static final int RESOURCE_OUT_X = 155;
    private static final int RESOURCE_OUT_Y = 17;
    private static final int RESOURCE_OUT_W = 12;
    private static final int RESOURCE_OUT_H = 51;

    // Progress bar (7x79 to 168x73, u/v at 0x172)
    private static final int PROGRESS_X = 7;
    private static final int PROGRESS_Y = 73;
    private static final int PROGRESS_W = 161;
    private static final int PROGRESS_H = 6;
    private static final int PROGRESS_U = 0;
    private static final int PROGRESS_V = 172;

    public ReactorScreen(ReactorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderFluidTank(guiGraphics, x, y, menu.blockEntity.inputCoolantTank, COOLANT_IN_X, COOLANT_IN_Y, COOLANT_IN_W, COOLANT_IN_H);
        renderFluidTank(guiGraphics, x, y, menu.blockEntity.outputCoolantTank, COOLANT_OUT_X, COOLANT_OUT_Y, COOLANT_OUT_W, COOLANT_OUT_H);
        renderFluidTank(guiGraphics, x, y, menu.blockEntity.inputResourceTank, RESOURCE_IN_X, RESOURCE_IN_Y, RESOURCE_IN_W, RESOURCE_IN_H);
        renderFluidTank(guiGraphics, x, y, menu.blockEntity.outputResourceTank, RESOURCE_OUT_X, RESOURCE_OUT_Y, RESOURCE_OUT_W, RESOURCE_OUT_H);

        renderProgressBar(guiGraphics, x, y);
    }

    private void renderFluidTank(GuiGraphics guiGraphics, int x, int y, FluidTank tank, int tankX, int tankY, int tankW, int tankH) {
        FluidStack fluidStack = tank.getFluid();
        if (fluidStack.isEmpty()) return;

        int amount = fluidStack.getAmount();
        int capacity = tank.getCapacity();
        int fillHeight = (int) ((float) amount / capacity * tankH);
        if (fillHeight <= 0) return;

        IClientFluidTypeExtensions fluidExtensions = IClientFluidTypeExtensions.of(fluidStack.getFluid());
        ResourceLocation stillTexture = fluidExtensions.getStillTexture();
        int tintColor = fluidExtensions.getTintColor(fluidStack);

        float a = ((tintColor >> 24) & 0xFF) / 255f;
        float r = ((tintColor >> 16) & 0xFF) / 255f;
        float g = ((tintColor >> 8) & 0xFF) / 255f;
        float b = (tintColor & 0xFF) / 255f;
        if (a == 0f) a = 1f;

        RenderSystem.setShaderTexture(0, TextureAtlas.LOCATION_BLOCKS);
        RenderSystem.setShaderColor(r, g, b, a);

        TextureAtlasSprite sprite = Minecraft.getInstance()
                .getTextureAtlas(TextureAtlas.LOCATION_BLOCKS)
                .apply(stillTexture);

        int meterLeft = x + tankX;
        int meterBottom = y + tankY + tankH;
        int meterTop = meterBottom - fillHeight;

        int renderY = meterTop;
        while (renderY < meterBottom) {
            int renderX = meterLeft;
            int rowHeight = Math.min(16, meterBottom - renderY);
            while (renderX < meterLeft + tankW) {
                int colWidth = Math.min(16, meterLeft + tankW - renderX);
                guiGraphics.blit(renderX, renderY, 0, colWidth, rowHeight, sprite);
                renderX += colWidth;
            }
            renderY += rowHeight;
        }

        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
    }

    private void renderProgressBar(GuiGraphics guiGraphics, int x, int y) {
        if (menu.isCrafting()) {
            guiGraphics.blit(TEXTURE, x + PROGRESS_X, y + PROGRESS_Y, PROGRESS_U, PROGRESS_V, menu.getScaledProgress(), PROGRESS_H);
        }
    }

    @Override
    public void render(GuiGraphics pGuiGraphics, int mouseX, int mouseY, float delta) {
        super.render(pGuiGraphics, mouseX, mouseY, delta);
        renderTooltip(pGuiGraphics, mouseX, mouseY);
    }

    @Override
    protected void renderTooltip(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        super.renderTooltip(guiGraphics, mouseX, mouseY);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        renderTankTooltip(guiGraphics, mouseX, mouseY, x, y, menu.blockEntity.inputCoolantTank, COOLANT_IN_X, COOLANT_IN_Y, COOLANT_IN_W, COOLANT_IN_H, "Coolant Input");
        renderTankTooltip(guiGraphics, mouseX, mouseY, x, y, menu.blockEntity.outputCoolantTank, COOLANT_OUT_X, COOLANT_OUT_Y, COOLANT_OUT_W, COOLANT_OUT_H, "Coolant Output");
        renderTankTooltip(guiGraphics, mouseX, mouseY, x, y, menu.blockEntity.inputResourceTank, RESOURCE_IN_X, RESOURCE_IN_Y, RESOURCE_IN_W, RESOURCE_IN_H, "Resource Input");
        renderTankTooltip(guiGraphics, mouseX, mouseY, x, y, menu.blockEntity.outputResourceTank, RESOURCE_OUT_X, RESOURCE_OUT_Y, RESOURCE_OUT_W, RESOURCE_OUT_H, "Resource Output");
    }

    private void renderTankTooltip(GuiGraphics guiGraphics, int mouseX, int mouseY, int x, int y,
                                   FluidTank tank, int tankX, int tankY, int tankW, int tankH, String label) {
        if (mouseX >= x + tankX && mouseX <= x + tankX + tankW
                && mouseY >= y + tankY && mouseY <= y + tankY + tankH) {
            FluidStack fluidStack = tank.getFluid();
            if (!fluidStack.isEmpty()) {
                List<Component> tooltip = List.of(
                        Component.literal(label).withStyle(ChatFormatting.GRAY),
                        fluidStack.getHoverName(),
                        Component.literal(fluidStack.getAmount() + " / " + tank.getCapacity() + " mB")
                                .withStyle(ChatFormatting.GRAY)
                );
                guiGraphics.renderComponentTooltip(font, tooltip, mouseX, mouseY);
            } else {
                List<Component> tooltip = List.of(
                        Component.literal(label).withStyle(ChatFormatting.GRAY),
                        Component.literal("Empty").withStyle(ChatFormatting.GRAY)
                );
                guiGraphics.renderComponentTooltip(font, tooltip, mouseX, mouseY);
            }
        }
    }
}
