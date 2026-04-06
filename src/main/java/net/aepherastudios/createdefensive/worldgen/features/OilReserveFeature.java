package net.aepherastudios.createdefensive.worldgen.features;

import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class OilReserveFeature extends AbstractReserveFeature {

    @Override
    protected Block getReserveBlock() {
        return DefensiveBlocks.CRUDE_OIL.get();
    }

    @Override
    protected void placeSurfaceIndicator(WorldGenLevel level, BlockPos surfacePos, RandomSource random) {
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                if (random.nextFloat() < 0.7f) {
                    BlockPos pos = surfacePos.offset(x, 0, z);
                    BlockState current = level.getBlockState(pos);
                    if (current.isSolid() && !current.is(DefensiveBlocks.TAR_SAND.get())) {
                        level.setBlock(pos, DefensiveBlocks.TAR_SAND.get().defaultBlockState(), 2);
                    }
                }
            }
        }
    }
}
