package net.aepherastudios.createdefensive.recipe.serializer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.aepherastudios.createdefensive.recipe.custom.ElectrolysisRecipe;
import net.aepherastudios.createdefensive.recipe.custom.ElectrolysisRecipe;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;

public class ElectrolysisRecipeSerializer implements RecipeSerializer<ElectrolysisRecipe> {

    public static final MapCodec<ElectrolysisRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    FluidIngredient.CODEC.fieldOf("ingredient").forGetter(ElectrolysisRecipe::getIngredient),
                    FluidStack.CODEC.fieldOf("output0").forGetter(ElectrolysisRecipe::getOutput0),
                    FluidStack.CODEC.fieldOf("output1").forGetter(ElectrolysisRecipe::getOutput1)
            ).apply(instance, ElectrolysisRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, ElectrolysisRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    FluidIngredient.STREAM_CODEC, ElectrolysisRecipe::getIngredient,
                    FluidStack.STREAM_CODEC, ElectrolysisRecipe::getOutput0,
                    FluidStack.STREAM_CODEC, ElectrolysisRecipe::getOutput1,
                    ElectrolysisRecipe::new
            );

    @Override
    public MapCodec<ElectrolysisRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, ElectrolysisRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}
