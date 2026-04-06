package net.aepherastudios.createdefensive.block.custom.machine;

import net.aepherastudios.createdefensive.block.entity.machine.CopperElectrolysisTankBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class CopperElectrolysisTankBlock extends ElectrolysisTankBlock {

    public CopperElectrolysisTankBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new CopperElectrolysisTankBlockEntity(blockPos, blockState);
    }
}
