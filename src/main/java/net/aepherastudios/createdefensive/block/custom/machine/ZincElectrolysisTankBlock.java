package net.aepherastudios.createdefensive.block.custom.machine;

import net.aepherastudios.createdefensive.block.entity.machine.ZincElectrolysisTankBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ZincElectrolysisTankBlock extends ElectrolysisTankBlock {

    public ZincElectrolysisTankBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new ZincElectrolysisTankBlockEntity(blockPos, blockState);
    }
}
