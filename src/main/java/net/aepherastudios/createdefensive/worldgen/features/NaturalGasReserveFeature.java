package net.aepherastudios.createdefensive.worldgen.features;

import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class NaturalGasReserveFeature extends AbstractReserveFeature {

    @Override
    protected Block getReserveBlock() {
        return DefensiveBlocks.NATURAL_GAS.get();
    }

    @Override
    protected void placeSurfaceIndicator(WorldGenLevel level, BlockPos surfacePos, RandomSource random) {
        BlockPos ventPos = surfacePos.above();
        BlockState above = level.getBlockState(ventPos);
        if (above.isAir() || above.getFluidState().is(FluidTags.WATER)) {
            level.setBlock(ventPos, DefensiveBlocks.GAS_VENT.get().defaultBlockState(), 2);
        }
    }
}
