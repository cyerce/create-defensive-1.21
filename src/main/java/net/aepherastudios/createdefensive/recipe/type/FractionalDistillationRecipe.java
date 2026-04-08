package net.aepherastudios.createdefensive.recipe.type;

import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;


public class FractionalDistillationRecipe implements Recipe<RecipeInput> {

    private final FluidIngredient ingredient;
    private final FluidStack output0;
    private final FluidStack output1;
    private final FluidStack output2;
    private final FluidStack output3;

    public FractionalDistillationRecipe(FluidIngredient ingredient, FluidStack output0, FluidStack output1, FluidStack output2, FluidStack output3){
        this.ingredient = ingredient;
        this.output0 = output0;
        this.output1 = output1;
        this.output2 = output2;
        this.output3 = output3;
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

    public FluidStack getOutput2() {
        return output2.copy();
    }

    public FluidStack getOutput3() {
        return output3.copy();
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
        return DefensiveRecipes.FRACTIONAL_DISTILLATION_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return DefensiveRecipes.FRACTIONAL_DISTILLATION_TYPE.get();
    }


}
