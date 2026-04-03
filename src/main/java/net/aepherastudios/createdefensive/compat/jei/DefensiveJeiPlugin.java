package net.aepherastudios.createdefensive.compat.jei;

import com.simibubi.create.compat.jei.category.CreateRecipeCategory;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipeTypes;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.aepherastudios.createdefensive.recipe.custom.CentrifugeRecipe;
import net.aepherastudios.createdefensive.recipe.custom.CokingRecipe;
import net.aepherastudios.createdefensive.recipe.custom.FractionalDistillationRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;

import java.util.List;

@JeiPlugin
public class DefensiveJeiPlugin implements IModPlugin {

    private CentrifugingCategory centrifugingCategory;
    private CokingCategory cokingCategory;
    private FractionalDistillationCategory fractionalDistillationCategory;

    @Override
    public ResourceLocation getPluginUid() {
        return CreateDefensive.asResource("jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();

        centrifugingCategory = (CentrifugingCategory) new CreateRecipeCategory.Builder<>(CentrifugeRecipe.class)
                .addTypedRecipes(DefensiveRecipeTypes.CENTRIFUGE::getType)
                .catalyst(() -> DefensiveBlocks.CENTRIFUGE)
                .itemIcon(DefensiveBlocks.CENTRIFUGE)
                .emptyBackground(160, 60)
                .build(CreateDefensive.asResource("centrifuge"), CentrifugingCategory::new);

        cokingCategory = new CokingCategory(guiHelper);
        fractionalDistillationCategory = new FractionalDistillationCategory(guiHelper);

        registration.addRecipeCategories(centrifugingCategory, cokingCategory, fractionalDistillationCategory);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        centrifugingCategory.registerRecipes(registration);
        ClientLevel level = Minecraft.getInstance().level;
        if (level != null) {
            List<RecipeHolder<CokingRecipe>> recipes = level.getRecipeManager()
                    .getAllRecipesFor(DefensiveRecipes.COKING_TYPE.get());
            registration.addRecipes(CokingCategory.RECIPE_TYPE, recipes);
        }
        if (level != null) {
            List<RecipeHolder<FractionalDistillationRecipe>> recipes = level.getRecipeManager()
                    .getAllRecipesFor(DefensiveRecipes.FRACTIONAL_DISTILLATION_TYPE.get());
            registration.addRecipes(FractionalDistillationCategory.RECIPE_TYPE, recipes);
        }
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        centrifugingCategory.registerCatalysts(registration);
        registration.addRecipeCatalyst(
                new ItemStack(DefensiveBlocks.COKING_OVEN.get()),
                CokingCategory.RECIPE_TYPE
        );
        registration.addRecipeCatalyst(
                new ItemStack(DefensiveBlocks.FRACTIONAL_STILL_TANK.get()),
                FractionalDistillationCategory.RECIPE_TYPE
        );
        registration.addRecipeCatalyst(
                new ItemStack(DefensiveBlocks.FRACTIONAL_STILL_CONTROLLER.get()),
                FractionalDistillationCategory.RECIPE_TYPE
        );
    }

}