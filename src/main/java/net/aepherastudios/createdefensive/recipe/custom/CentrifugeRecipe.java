package net.aepherastudios.createdefensive.recipe.custom;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.content.kinetics.crusher.AbstractCrushingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeParams;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipeTypes;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.level.Level;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class CentrifugeRecipe extends AbstractCrushingRecipe {

    public CentrifugeRecipe(ProcessingRecipeParams params) {
        super(DefensiveRecipeTypes.CENTRIFUGE, params);
    }

    @Override
    public boolean matches(RecipeInput inv, Level worldIn) {
        if (inv.isEmpty())
            return false;
        return ingredients.get(0)
                .test(inv.getItem(0));
    }

    @Override
    protected int getMaxOutputCount() {
        return 4;
    }
}
