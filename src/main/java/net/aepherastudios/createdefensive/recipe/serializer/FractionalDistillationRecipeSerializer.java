package net.aepherastudios.createdefensive.recipe.serializer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.aepherastudios.createdefensive.recipe.type.FractionalDistillationRecipe;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;

public class FractionalDistillationRecipeSerializer implements RecipeSerializer<FractionalDistillationRecipe> {

    public static final MapCodec<FractionalDistillationRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    FluidIngredient.CODEC.fieldOf("ingredient").forGetter(FractionalDistillationRecipe::getIngredient),
                    FluidStack.CODEC.fieldOf("output0").forGetter(FractionalDistillationRecipe::getOutput0),
                    FluidStack.CODEC.fieldOf("output1").forGetter(FractionalDistillationRecipe::getOutput1),
                    FluidStack.CODEC.fieldOf("output2").forGetter(FractionalDistillationRecipe::getOutput2),
                    FluidStack.CODEC.fieldOf("output3").forGetter(FractionalDistillationRecipe::getOutput3)
            ).apply(instance, FractionalDistillationRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, FractionalDistillationRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    FluidIngredient.STREAM_CODEC, FractionalDistillationRecipe::getIngredient,
                    FluidStack.STREAM_CODEC, FractionalDistillationRecipe::getOutput0,
                    FluidStack.STREAM_CODEC, FractionalDistillationRecipe::getOutput1,
                    FluidStack.STREAM_CODEC, FractionalDistillationRecipe::getOutput2,
                    FluidStack.STREAM_CODEC, FractionalDistillationRecipe::getOutput3,
                    FractionalDistillationRecipe::new
            );

    @Override
    public MapCodec<FractionalDistillationRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, FractionalDistillationRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}
