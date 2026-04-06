package net.aepherastudios.createdefensive.screen.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.screen.menu.CokingOvenMenu;
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

import java.util.List;

public class CokingOvenScreen extends AbstractContainerScreen<CokingOvenMenu> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "textures/gui/coking_oven.png");

    private static final int METER_X = 149;
    private static final int METER_Y = 11;
    private static final int METER_WIDTH = 16;
    private static final int METER_HEIGHT = 60;

    public CokingOvenScreen(CokingOvenMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
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

        renderFluidMeter(guiGraphics, x, y);
        renderProgressArrow(guiGraphics, x, y);
    }

    private void renderFluidMeter(GuiGraphics guiGraphics, int x, int y) {
        FluidStack fluidStack = menu.blockEntity.getFluidStack();
        if (fluidStack.isEmpty()) return;

        int capacity = menu.blockEntity.getTankCapacity();
        int amount = fluidStack.getAmount();

        int fillHeight = (int) ((float) amount / capacity * METER_HEIGHT);
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

        int meterLeft = x + METER_X;
        int meterBottom = y + METER_Y + METER_HEIGHT;
        int meterTop = meterBottom - fillHeight;

        int renderY = meterTop;
        while (renderY < meterBottom) {
            int renderX = meterLeft;
            int rowHeight = Math.min(16, meterBottom - renderY);
            while (renderX < meterLeft + METER_WIDTH) {
                int colWidth = Math.min(16, meterLeft + METER_WIDTH - renderX);
                guiGraphics.blit(renderX, renderY, 0, colWidth, rowHeight, sprite);
                renderX += colWidth;
            }
            renderY += rowHeight;
        }

        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
    }

    private void renderProgressArrow(GuiGraphics guiGraphics, int x, int y) {
        if (menu.isCrafting()) {
            guiGraphics.blit(TEXTURE, x + 79, y + 35, 176, 14, menu.getScaledProgress(), 16);
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

        // Fluid meter tooltip
        if (mouseX >= x + METER_X && mouseX <= x + METER_X + METER_WIDTH
                && mouseY >= y + METER_Y && mouseY <= y + METER_Y + METER_HEIGHT) {

            FluidStack fluidStack = menu.blockEntity.getFluidStack();
            if (!fluidStack.isEmpty()) {
                int amount = fluidStack.getAmount();
                int capacity = menu.blockEntity.getTankCapacity();
                List<Component> tooltip = List.of(
                        fluidStack.getHoverName(),
                        Component.literal(amount + " / " + capacity + " mB")
                                .withStyle(ChatFormatting.GRAY)
                );
                guiGraphics.renderComponentTooltip(font, tooltip, mouseX, mouseY);
            } else {
                guiGraphics.renderTooltip(font,
                        Component.translatable("tooltip.coking_oven.empty").withStyle(ChatFormatting.GRAY),
                        mouseX, mouseY);
            }
        }
    }
}
