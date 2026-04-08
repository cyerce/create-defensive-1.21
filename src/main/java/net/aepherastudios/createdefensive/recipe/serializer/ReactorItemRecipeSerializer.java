package net.aepherastudios.createdefensive.recipe.serializer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.aepherastudios.createdefensive.recipe.type.ReactorItemRecipe;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class ReactorItemRecipeSerializer implements RecipeSerializer<ReactorItemRecipe> {

    public static final MapCodec<ReactorItemRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Ingredient.CODEC.fieldOf("ingredient").forGetter(ReactorItemRecipe::getIngredient),
                    ItemStack.CODEC.fieldOf("result").forGetter(ReactorItemRecipe::getResult)
            ).apply(instance, ReactorItemRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, ReactorItemRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC, ReactorItemRecipe::getIngredient,
                    ItemStack.STREAM_CODEC, ReactorItemRecipe::getResult,
                    ReactorItemRecipe::new
            );

    @Override
    public MapCodec<ReactorItemRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, ReactorItemRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}
