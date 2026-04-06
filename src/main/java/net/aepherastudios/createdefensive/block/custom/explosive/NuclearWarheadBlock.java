package net.aepherastudios.createdefensive.block.custom.explosive;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.GasCloudEntity;
import net.aepherastudios.createdefensive.entity.custom.RadiationCloudEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class NuclearWarheadBlock extends Block {
    public NuclearWarheadBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.hasNeighborSignal(pos)) {
            detonate(level, pos);
        }
    }

    public void detonate(Level level, BlockPos pos){

        if (level instanceof net.minecraft.server.level.ServerLevel serverLevel) {
            RadiationCloudEntity cloud = new RadiationCloudEntity(
                    DefensiveEntities.RADIATION_CLOUD.get(), serverLevel
            );
            cloud.setPos(pos.getX(), pos.getY(), pos.getZ());
            cloud.setRadius(8.0f);
            cloud.setDuration(600);
            serverLevel.addFreshEntity(cloud);
        }

        level.explode(null, pos.getX(), pos.getY(), pos.getZ(), 100, false, Level.ExplosionInteraction.TNT);
    }
}
