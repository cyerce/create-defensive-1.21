package net.aepherastudios.createdefensive.recipe;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.recipe.custom.CokingRecipe;
import net.aepherastudios.createdefensive.recipe.custom.CokingRecipeSerializer;
import net.aepherastudios.createdefensive.recipe.custom.FractionalDistillationRecipe;
import net.aepherastudios.createdefensive.recipe.custom.FractionalDistillationRecipeSerializer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DefensiveRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, CreateDefensive.MOD_ID);

    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, CreateDefensive.MOD_ID);

    public static final Supplier<RecipeSerializer<CokingRecipe>> COKING_SERIALIZER =
            SERIALIZERS.register("coking", CokingRecipeSerializer::new);

    public static final Supplier<RecipeType<CokingRecipe>> COKING_TYPE =
            TYPES.register("coking", () -> RecipeType.simple(CreateDefensive.asResource("coking")));

    public static final Supplier<RecipeSerializer<FractionalDistillationRecipe>> FRACTIONAL_DISTILLATION_SERIALIZER =
            SERIALIZERS.register("fractional_distillation", FractionalDistillationRecipeSerializer::new);

    public static final Supplier<RecipeType<FractionalDistillationRecipe>> FRACTIONAL_DISTILLATION_TYPE =
            TYPES.register("fractional_distillation", () -> RecipeType.simple(CreateDefensive.asResource("fractional_distillation")));


    public static void register(IEventBus modEventBus) {
        SERIALIZERS.register(modEventBus);
        TYPES.register(modEventBus);
    }
}
