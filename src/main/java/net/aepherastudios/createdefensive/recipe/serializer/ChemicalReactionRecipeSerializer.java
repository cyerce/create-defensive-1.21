package net.aepherastudios.createdefensive.recipe.serializer;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.aepherastudios.createdefensive.recipe.type.ChemicalReactionRecipe;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.crafting.FluidIngredient;

import java.util.List;
import java.util.Optional;

public class ChemicalReactionRecipeSerializer
        implements RecipeSerializer<ChemicalReactionRecipe> {

    private static final Codec<List<FluidIngredient>> FLUID_INGREDIENT_LIST_CODEC =
            FluidIngredient.CODEC.listOf(0, 2);

    private static final Codec<List<FluidStack>> FLUID_STACK_LIST_CODEC =
            FluidStack.CODEC.listOf(0, 2);

    private static <T> T getOrDefault(List<T> list, int index, T defaultValue) {
        return index < list.size() ? list.get(index) : defaultValue;
    }

    public static final MapCodec<ChemicalReactionRecipe> CODEC =
            RecordCodecBuilder.mapCodec(instance -> instance.group(

                    FLUID_INGREDIENT_LIST_CODEC
                            .optionalFieldOf("ingredients", List.of())
                            .forGetter(r -> {
                                if (!r.getInputFluid2().isEmpty())
                                    return List.of(r.getInputFluid1(), r.getInputFluid2());
                                if (!r.getInputFluid1().isEmpty())
                                    return List.of(r.getInputFluid1());
                                return List.of();
                            }),

                    FLUID_STACK_LIST_CODEC
                            .optionalFieldOf("results", List.of())
                            .forGetter(r -> {
                                if (!r.getOutputFluid2().isEmpty())
                                    return List.of(r.getOutputFluid1(), r.getOutputFluid2());
                                if (!r.getOutputFluid1().isEmpty())
                                    return List.of(r.getOutputFluid1());
                                return List.of();
                            }),

                    Ingredient.CODEC
                            .optionalFieldOf("catalyst")
                            .forGetter(ChemicalReactionRecipe::getCatalyst),

                    Codec.INT
                            .optionalFieldOf("processing_time", 200)
                            .forGetter(ChemicalReactionRecipe::getProcessingTime)

            ).apply(instance, (ingredientList, resultList, catalyst, processingTime) ->
                    new ChemicalReactionRecipe(
                            getOrDefault(ingredientList, 0, FluidIngredient.empty()),
                            getOrDefault(ingredientList, 1, FluidIngredient.empty()),
                            getOrDefault(resultList,     0, FluidStack.EMPTY),
                            getOrDefault(resultList,     1, FluidStack.EMPTY),
                            catalyst,
                            processingTime
                    )
            ));

    private static final StreamCodec<RegistryFriendlyByteBuf, FluidIngredient>
            FLUID_INGREDIENT_STREAM_CODEC = FluidIngredient.STREAM_CODEC;

    private static final StreamCodec<RegistryFriendlyByteBuf, FluidStack>
            OPT_FLUID_STACK_STREAM_CODEC = StreamCodec.of(
            (buf, fs) -> {
                buf.writeBoolean(!fs.isEmpty());
                if (!fs.isEmpty()) FluidStack.STREAM_CODEC.encode(buf, fs);
            },
            buf -> buf.readBoolean() ? FluidStack.STREAM_CODEC.decode(buf) : FluidStack.EMPTY
    );

    private static final StreamCodec<RegistryFriendlyByteBuf, Optional<Ingredient>>
            OPT_INGREDIENT_STREAM_CODEC = StreamCodec.of(
            (buf, opt) -> {
                buf.writeBoolean(opt.isPresent());
                opt.ifPresent(ing -> Ingredient.CONTENTS_STREAM_CODEC.encode(buf, ing));
            },
            buf -> buf.readBoolean()
                    ? Optional.of(Ingredient.CONTENTS_STREAM_CODEC.decode(buf))
                    : Optional.empty()
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, ChemicalReactionRecipe>
            STREAM_CODEC = StreamCodec.of(
            (buf, recipe) -> {
                FLUID_INGREDIENT_STREAM_CODEC.encode(buf, recipe.getInputFluid1());
                FLUID_INGREDIENT_STREAM_CODEC.encode(buf, recipe.getInputFluid2());
                OPT_FLUID_STACK_STREAM_CODEC.encode(buf, recipe.getOutputFluid1());
                OPT_FLUID_STACK_STREAM_CODEC.encode(buf, recipe.getOutputFluid2());
                OPT_INGREDIENT_STREAM_CODEC.encode(buf, recipe.getCatalyst());
                ByteBufCodecs.INT.encode(buf, recipe.getProcessingTime());
            },
            buf -> new ChemicalReactionRecipe(
                    FLUID_INGREDIENT_STREAM_CODEC.decode(buf),
                    FLUID_INGREDIENT_STREAM_CODEC.decode(buf),
                    OPT_FLUID_STACK_STREAM_CODEC.decode(buf),
                    OPT_FLUID_STACK_STREAM_CODEC.decode(buf),
                    OPT_INGREDIENT_STREAM_CODEC.decode(buf),
                    ByteBufCodecs.INT.decode(buf)
            )
    );

    @Override
    public MapCodec<ChemicalReactionRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, ChemicalReactionRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}
