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
import net.aepherastudios.createdefensive.compat.jei.animated_elements.AnimatedElectrolysis;
import net.aepherastudios.createdefensive.recipe.custom.ElectrolysisRecipe;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.neoforged.neoforge.fluids.FluidStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class ElectrolysisCategory implements IRecipeCategory<RecipeHolder<ElectrolysisRecipe>> {

    private final IDrawable background;
    private final IDrawable icon;
    private final AnimatedElectrolysis animatedElectrolysis = new AnimatedElectrolysis();


    public static final RecipeType<RecipeHolder<ElectrolysisRecipe>> RECIPE_TYPE =
            RecipeType.create(CreateDefensive.MOD_ID, "electrolysis", castClass(RecipeHolder.class));

    public ElectrolysisCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createBlankDrawable(170, 60);
        this.icon = new ItemIcon(() -> new ItemStack(DefensiveBlocks.ELECTROLYSIS_CONTROLLER.get()));
    }

    @Override
    public RecipeType<RecipeHolder<ElectrolysisRecipe>> getRecipeType() {
        return RECIPE_TYPE;
    }

    @SuppressWarnings("unchecked")
    private static <T> Class<T> castClass(Class<?> cls) {
        return (Class<T>) cls;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("createdefensive.recipe.electrolysis");
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<ElectrolysisRecipe> holder, IFocusGroup focuses) {
        ElectrolysisRecipe recipe = holder.value();
        FluidStack inputStack = recipe.getIngredient().getStacks()[0];

        builder.addSlot(RecipeIngredientRole.INPUT, 80, 10)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(inputStack.getFluid(), 1000);

        FluidStack fluidResult0 = recipe.getOutput0();
        builder.addSlot(RecipeIngredientRole.OUTPUT, 120, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(fluidResult0.getFluid(), 250)
                .addRichTooltipCallback((view, tooltip) -> {
                    tooltip.clear();
                    tooltip.add(fluidResult0.getHoverName());
                    tooltip.add(Component.literal(fluidResult0.getAmount() + " mB")
                            .withStyle(ChatFormatting.GRAY));
                });

        FluidStack fluidResult1 = recipe.getOutput1();
        builder.addSlot(RecipeIngredientRole.OUTPUT, 40, 22)
                .setBackground(CreateRecipeCategory.getRenderedSlot(), -1, -1)
                .addFluidStack(fluidResult1.getFluid(), 250)
                .addRichTooltipCallback((view, tooltip) -> {
                    tooltip.clear();
                    tooltip.add(fluidResult1.getHoverName());
                    tooltip.add(Component.literal(fluidResult1.getAmount() + " mB")
                            .withStyle(ChatFormatting.GRAY));
                });
    }

    @Override
    public void draw(RecipeHolder<ElectrolysisRecipe> holder, IRecipeSlotsView recipeSlotsView,
                     GuiGraphics graphics, double mouseX, double mouseY) {
        animatedElectrolysis.draw(graphics, 80, 35);
    }

    @SuppressWarnings("removal")
    @Override
    public IDrawable getBackground() {
        return background;
    }
}
