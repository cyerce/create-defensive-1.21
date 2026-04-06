package net.aepherastudios.createdefensive.block.custom.explosive;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class IncendiaryWarheadBlock extends Block {
    public IncendiaryWarheadBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.hasNeighborSignal(pos)) {
            detonate(level, pos);
        }
    }

    public void detonate(Level level, BlockPos pos){
        level.explode(null, pos.getX(), pos.getY(), pos.getZ(), 8, true, Level.ExplosionInteraction.TNT);
    }
}
