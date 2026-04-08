package net.aepherastudios.createdefensive.compat.jei.category;

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
import net.aepherastudios.createdefensive.compat.jei.animated_elements.AnimatedFractionalDistillation;
import net.aepherastudios.createdefensive.recipe.type.FractionalDistillationRecipe;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.neoforged.neoforge.fluids.FluidStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class FractionalDistillationCategory implements IRecipeCategory<RecipeHolder<FractionalDistillationRecipe>> {

    private final IDrawable background;
    private final IDrawable icon;
    private final AnimatedFractionalDistillation animatedFractionalDistillation = new AnimatedFractionalDistillation();


    public static final RecipeType<RecipeHolder<FractionalDistillationRecipe>> RECIPE_TYPE =
            RecipeType.create(CreateDefensive.MOD_ID, "fractional_distillation", castClass(RecipeHolder.class));

    public FractionalDistillationCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createBlankDrawable(170, 60);
        this.icon = new ItemIcon(() -> new ItemStack(DefensiveBlocks.FRACTIONAL_STILL_TANK.get()));
    }

    @Override
    public RecipeType<RecipeHolder<FractionalDistillationRecipe>> getRecipeType() {
        return RECIPE_TYPE;
    }

    @SuppressWarnings("unchecked")
    private static <T> Class<T> castClass(Class<?> cls) {
        return (Class<T>) cls;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("createdefensive.recipe.fractional_distillation");
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<FractionalDistillationRecipe> holder, IFocusGroup focuses) {
        FractionalDistillationRecipe recipe = holder.value();
        FluidStack inputStack = recipe.getIngredient().getStacks()[0];

        builder.addSlot(RecipeIngredientRole.INPUT, 15, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(inputStack.getFluid(), 1000);

        FluidStack fluidResult0 = recipe.getOutput0();
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(fluidResult0.getFluid(), 250)
                .addRichTooltipCallback((view, tooltip) -> {
                    tooltip.clear();
                    tooltip.add(fluidResult0.getHoverName());
                    tooltip.add(Component.literal(fluidResult0.getAmount() + " mB")
                            .withStyle(ChatFormatting.GRAY));
                });

        FluidStack fluidResult1 = recipe.getOutput1();
        builder.addSlot(RecipeIngredientRole.OUTPUT, 105, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(fluidResult1.getFluid(), 250)
                .addRichTooltipCallback((view, tooltip) -> {
                    tooltip.clear();
                    tooltip.add(fluidResult1.getHoverName());
                    tooltip.add(Component.literal(fluidResult1.getAmount() + " mB")
                            .withStyle(ChatFormatting.GRAY));
                });

        FluidStack fluidResult2 = recipe.getOutput2();
        builder.addSlot(RecipeIngredientRole.OUTPUT, 130, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(fluidResult2.getFluid(), 250)
                .addRichTooltipCallback((view, tooltip) -> {
                    tooltip.clear();
                    tooltip.add(fluidResult2.getHoverName());
                    tooltip.add(Component.literal(fluidResult2.getAmount() + " mB")
                            .withStyle(ChatFormatting.GRAY));
                });

        FluidStack fluidResult3 = recipe.getOutput3();
        builder.addSlot(RecipeIngredientRole.OUTPUT, 155, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(fluidResult3.getFluid(), 250)
                .addRichTooltipCallback((view, tooltip) -> {
                    tooltip.clear();
                    tooltip.add(fluidResult3.getHoverName());
                    tooltip.add(Component.literal(fluidResult3.getAmount() + " mB")
                            .withStyle(ChatFormatting.GRAY));
                });

    }

    @Override
    public void draw(RecipeHolder<FractionalDistillationRecipe> holder, IRecipeSlotsView recipeSlotsView,
                     GuiGraphics graphics, double mouseX, double mouseY) {
        AllGuiTextures.JEI_DOWN_ARROW.render(graphics, 60, 10);
        animatedFractionalDistillation.draw(graphics, 48, 35);
    }

    @SuppressWarnings("removal")
    @Override
    public IDrawable getBackground() {
        return background;
    }
}
