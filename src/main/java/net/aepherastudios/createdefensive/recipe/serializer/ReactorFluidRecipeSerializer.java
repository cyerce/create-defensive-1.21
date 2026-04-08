package net.aepherastudios.createdefensive.recipe.serializer;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.aepherastudios.createdefensive.recipe.type.ReactorFluidRecipe;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class ReactorFluidRecipeSerializer implements RecipeSerializer<ReactorFluidRecipe> {

    public static final MapCodec<ReactorFluidRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    BuiltInRegistries.FLUID.byNameCodec().fieldOf("ingredient").forGetter(ReactorFluidRecipe::getIngredient),
                    BuiltInRegistries.FLUID.byNameCodec().fieldOf("result").forGetter(ReactorFluidRecipe::getResult)
            ).apply(instance, ReactorFluidRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, ReactorFluidRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    ByteBufCodecs.registry(Registries.FLUID), ReactorFluidRecipe::getIngredient,
                    ByteBufCodecs.registry(Registries.FLUID), ReactorFluidRecipe::getResult,
                    ReactorFluidRecipe::new
            );

    @Override
    public MapCodec<ReactorFluidRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, ReactorFluidRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}
