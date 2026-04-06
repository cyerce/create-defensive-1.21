package net.aepherastudios.createdefensive.recipe.custom;

import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;

public class ElectrolysisRecipe implements Recipe<RecipeInput>{
    private final FluidIngredient ingredient;
    private final FluidStack output0;
    private final FluidStack output1;

    public ElectrolysisRecipe(FluidIngredient ingredient, FluidStack output0, FluidStack output1){
        this.ingredient = ingredient;
        this.output0 = output0;
        this.output1 = output1;
    }

    public FluidIngredient  getIngredient(){
        return ingredient;
    }

    public FluidStack getOutput0() {
        return output0.copy();
    }

    public FluidStack getOutput1() {
        return output1.copy();
    }

    @Override
    public boolean matches(RecipeInput input, Level level) {
        for (FluidStack stack : ingredient.getStacks()) {
            if (ingredient.test(stack)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ItemStack assemble(RecipeInput recipeInput, HolderLookup.Provider provider) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return ItemStack.EMPTY;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return DefensiveRecipes.ELECTROLYSIS_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return DefensiveRecipes.ELECTROLYSIS_TYPE.get();
    }
}
