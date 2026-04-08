package net.aepherastudios.createdefensive.recipe.type;

import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.fluids.FluidStack;

public class CokingRecipe implements Recipe<SingleRecipeInput> {

    private final Ingredient ingredient;
    private final ItemStack result;
    private final FluidStack fluidResult;

    public CokingRecipe(Ingredient ingredient, ItemStack result, FluidStack fluidResult) {
        this.ingredient = ingredient;
        this.result = result;
        this.fluidResult = fluidResult;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public ItemStack getResult() {
        return result.copy();
    }

    public FluidStack getFluidResult() {
        return fluidResult.copy();
    }

    @Override
    public boolean matches(SingleRecipeInput input, Level level) {
        return ingredient.test(input.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput input, HolderLookup.Provider registries) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return result.copy();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return DefensiveRecipes.COKING_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return DefensiveRecipes.COKING_TYPE.get();
    }
}
