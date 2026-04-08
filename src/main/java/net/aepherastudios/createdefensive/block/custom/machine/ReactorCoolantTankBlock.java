package net.aepherastudios.createdefensive.block.custom.machine;

import com.mojang.serialization.MapCodec;
import net.aepherastudios.createdefensive.block.entity.machine.ReactorCoolantTankBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ReactorCoolantTankBlock extends ReactorTankBlock{

    public static final MapCodec<ReactorCoolantTankBlock> CODEC = simpleCodec(ReactorCoolantTankBlock::new);

    public ReactorCoolantTankBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new ReactorCoolantTankBlockEntity(blockPos, blockState);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }
}
