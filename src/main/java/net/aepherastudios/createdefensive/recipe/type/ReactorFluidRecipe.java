package net.aepherastudios.createdefensive.recipe.type;

import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.aepherastudios.createdefensive.recipe.custom.ReactorFluidInput;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;

public class ReactorFluidRecipe implements Recipe<ReactorFluidInput> {

    private final Fluid ingredient;
    private final Fluid result;

    public ReactorFluidRecipe(Fluid ingredient, Fluid result) {
        this.ingredient = ingredient;
        this.result = result;
    }

    public Fluid getIngredient() {
        return ingredient;
    }

    public Fluid getResult() {
        return result;
    }

    @Override
    public boolean matches(ReactorFluidInput input, Level level) {
        return ingredient == input.fluid();
    }

    @Override
    public ItemStack assemble(ReactorFluidInput input, HolderLookup.Provider registries) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return ItemStack.EMPTY;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return DefensiveRecipes.REACTOR_FLUID_RECIPE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return DefensiveRecipes.REACTOR_FLUID_TYPE.get();
    }
}
