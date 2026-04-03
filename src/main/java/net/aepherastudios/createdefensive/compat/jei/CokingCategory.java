package net.aepherastudios.createdefensive.compat.jei;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.compat.jei.ItemIcon;
import com.simibubi.create.compat.jei.category.CreateRecipeCategory;
import com.simibubi.create.foundation.gui.AllGuiTextures;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.recipe.custom.CokingRecipe;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.neoforged.neoforge.fluids.FluidStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class CokingCategory implements IRecipeCategory<RecipeHolder<CokingRecipe>> {

    public static final RecipeType<RecipeHolder<CokingRecipe>> RECIPE_TYPE =
            RecipeType.create(CreateDefensive.MOD_ID, "coking", castClass(RecipeHolder.class));

    private final IDrawable background;
    private final IDrawable icon;
    private final AnimatedCokingOven cokingOven = new AnimatedCokingOven();

    public CokingCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createBlankDrawable(170, 60);
        this.icon = new ItemIcon(() -> new ItemStack(DefensiveBlocks.COKING_OVEN.get()));
    }

    @SuppressWarnings("unchecked")
    private static <T> Class<T> castClass(Class<?> cls) {
        return (Class<T>) cls;
    }

    @Override
    public RecipeType<RecipeHolder<CokingRecipe>> getRecipeType() {
        return RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("createdefensive.recipe.coking");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<CokingRecipe> holder, IFocusGroup focuses) {
        CokingRecipe recipe = holder.value();

        // Input slot
        builder.addSlot(RecipeIngredientRole.INPUT, 15, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addIngredients(recipe.getIngredient());

        // Item output slot
        builder.addSlot(RecipeIngredientRole.OUTPUT, 120, 15)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addItemStack(recipe.getResult());

        // Fluid output slot — show bucket item, tooltip shows fluid name + amount
        FluidStack fluidResult = recipe.getFluidResult();
        ItemStack bucketStack = fluidResult.getFluid().getBucket().getDefaultInstance();
        builder.addSlot(RecipeIngredientRole.OUTPUT, 140, 15)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addItemStack(bucketStack)
                .addRichTooltipCallback((view, tooltip) -> {
                    tooltip.clear();
                    tooltip.add(fluidResult.getHoverName());
                    tooltip.add(Component.literal(fluidResult.getAmount() + " mB")
                            .withStyle(ChatFormatting.GRAY));
                });
    }

    @Override
    public void draw(RecipeHolder<CokingRecipe> holder, IRecipeSlotsView recipeSlotsView,
                     GuiGraphics graphics, double mouseX, double mouseY) {
        AllGuiTextures.JEI_ARROW.render(graphics, 60, 22);
        cokingOven.draw(graphics, 48, 35);
    }
}