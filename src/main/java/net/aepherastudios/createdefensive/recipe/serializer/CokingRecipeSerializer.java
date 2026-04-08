package net.aepherastudios.createdefensive.recipe.serializer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.aepherastudios.createdefensive.recipe.type.CokingRecipe;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.fluids.FluidStack;

public class CokingRecipeSerializer implements RecipeSerializer<CokingRecipe> {

    public static final MapCodec<CokingRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Ingredient.CODEC.fieldOf("ingredient").forGetter(CokingRecipe::getIngredient),
                    ItemStack.CODEC.fieldOf("result").forGetter(CokingRecipe::getResult),
                    FluidStack.CODEC.fieldOf("fluid_result").forGetter(CokingRecipe::getFluidResult)
            ).apply(instance, CokingRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, CokingRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC, CokingRecipe::getIngredient,
                    ItemStack.STREAM_CODEC, CokingRecipe::getResult,
                    FluidStack.STREAM_CODEC, CokingRecipe::getFluidResult,
                    CokingRecipe::new
            );

    @Override
    public MapCodec<CokingRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, CokingRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}
