package net.aepherastudios.createdefensive.recipe.type;

import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;

import java.util.Optional;

public class ChemicalReactionRecipe implements Recipe<ChemicalReactionRecipe.Input> {

    private final FluidIngredient ingredient1;
    private final FluidIngredient ingredient2;
    private final FluidStack output0;
    private final FluidStack output1;
    private final Optional<Ingredient> catalyst;
    private final int processingTime;

    public ChemicalReactionRecipe(FluidIngredient inputFluid1, FluidIngredient inputFluid2, FluidStack outputFluid1, FluidStack outputFluid2, Optional<Ingredient> catalyst, int processingTime) {
        this.ingredient1 = inputFluid1;
        this.ingredient2 = inputFluid2;
        this.output0 = outputFluid1;
        this.output1 = outputFluid2;
        this.catalyst = catalyst;
        this.processingTime = processingTime;
    }

    @Override
    public boolean matches(Input input, Level level) {
        if (!ingredient1.isEmpty() && !ingredient1.test(input.inputFluid1())) {
            return false;
        }

        if (!ingredient2.isEmpty() && !ingredient2.test(input.inputFluid2())) {
            return false;
        }

        if (catalyst.isPresent()) {
            ItemStack slotStack = input.catalystStack();
            if (slotStack.isEmpty()) return false;
            if (!catalyst.get().test(slotStack)) return false;
        }

        return true;
    }

    @Override
    public ItemStack assemble(Input input, HolderLookup.Provider registries) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return ItemStack.EMPTY;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return DefensiveRecipes.CHEMICAL_REACTION_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return DefensiveRecipes.CHEMICAL_REACTION_TYPE.get();
    }

    public FluidIngredient getInputFluid1() {
        return ingredient1;
    }

    public FluidIngredient getInputFluid2() {
        return ingredient2;
    }

    public FluidStack getOutputFluid1() {
        return output0.copy();
    }

    public FluidStack getOutputFluid2() {
        return output1.copy();
    }

    public Optional<Ingredient> getCatalyst() {
        return catalyst;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public record Input(FluidStack inputFluid1, FluidStack inputFluid2, ItemStack  catalystStack) implements RecipeInput {
        @Override
        public ItemStack getItem(int index) {
            return index == 0 ? catalystStack : ItemStack.EMPTY;
        }

        @Override
        public int size() {
            return 1;
        }
    }
}
