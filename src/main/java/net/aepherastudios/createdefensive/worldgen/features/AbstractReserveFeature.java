package net.aepherastudios.createdefensive.worldgen.features;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.neoforge.common.Tags;

import java.util.Random;

public abstract class AbstractReserveFeature extends Feature<NoneFeatureConfiguration> {

    private static final int HORIZONTAL_RADIUS = 25;
    private static final int VERTICAL_RADIUS = 10;
    private static final double NOISE_SCALE = 0.15;
    private static final double NOISE_STRENGTH = 4.0;

    public AbstractReserveFeature() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos origin = context.origin();
        RandomSource random = context.random();

        for (int x = -HORIZONTAL_RADIUS - 5; x <= HORIZONTAL_RADIUS + 5; x++) {
            for (int y = -VERTICAL_RADIUS - 5; y <= VERTICAL_RADIUS + 5; y++) {
                for (int z = -HORIZONTAL_RADIUS - 5; z <= HORIZONTAL_RADIUS + 5; z++) {

                    double ellipsoid = (double)(x * x) / (HORIZONTAL_RADIUS * HORIZONTAL_RADIUS)
                            + (double)(y * y) / (VERTICAL_RADIUS * VERTICAL_RADIUS)
                            + (double)(z * z) / (HORIZONTAL_RADIUS * HORIZONTAL_RADIUS);

                    if (ellipsoid < 0.6) {
                        BlockPos pos = origin.offset(x, y, z);
                        tryPlaceReserveBlock(level, pos);
                    } else if (ellipsoid < 1.4) {
                        double noise = sampleNoise(origin.getX() + x, origin.getY() + y, origin.getZ() + z, random);
                        if (ellipsoid + noise < 1.0) {
                            BlockPos pos = origin.offset(x, y, z);
                            tryPlaceReserveBlock(level, pos);
                        }
                    }
                }
            }
        }

        BlockPos surfacePos = findSurface(level, origin);
        if (surfacePos != null) {
            placeSurfaceIndicator(level, surfacePos, random);
        }

        return true;
    }

    private void tryPlaceReserveBlock(WorldGenLevel level, BlockPos pos) {
        BlockState state = level.getBlockState(pos);
        if ((state.is(Blocks.DEEPSLATE)
                || state.is(Blocks.STONE)
                || state.is(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                || state.is(BlockTags.STONE_ORE_REPLACEABLES))
                && !state.is(Tags.Blocks.ORES)) {
            level.setBlock(pos, getReserveBlock().defaultBlockState(), 2);
        }
    }

    private double sampleNoise(int x, int y, int z, RandomSource random) {
        long seed = (long)x * 1619L + (long)y * 31337L + (long)z * 6971L;
        RandomSource noiseRandom = RandomSource.create(seed ^ random.nextLong());
        return (noiseRandom.nextDouble() - 0.5) * 0.6;
    }

    private double getNoise(int x, int y, int z, Random random) {
        long seed = random.nextLong();
        double nx = x * NOISE_SCALE;
        double ny = y * NOISE_SCALE;
        double nz = z * NOISE_SCALE;
        return (Math.sin(nx * seed % 7.3) + Math.cos(nz * seed % 5.1) + Math.sin(ny * seed % 3.7))
                / 3.0 * NOISE_STRENGTH;
    }

    private BlockPos findSurface(WorldGenLevel level, BlockPos origin) {
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos(origin.getX(), 0, origin.getZ());
        for (int y = 0; y < level.getMaxBuildHeight(); y++) {
            pos.setY(y);
            BlockState current = level.getBlockState(pos);
            BlockState above = level.getBlockState(pos.above());
            if (current.isSolid() && (above.isAir() || above.getFluidState().is(FluidTags.WATER))) {
                return pos.immutable();
            }
        }
        return null;
    }

    protected abstract Block getReserveBlock();
    protected abstract void placeSurfaceIndicator(WorldGenLevel level, BlockPos surfacePos, RandomSource random);
}
