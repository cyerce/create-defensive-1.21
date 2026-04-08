package net.aepherastudios.createdefensive.block.custom.machine;

import com.mojang.serialization.MapCodec;
import net.aepherastudios.createdefensive.block.entity.machine.ReactorCoolantTankBlockEntity;
import net.aepherastudios.createdefensive.block.entity.machine.ReactorResourceTankBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class ReactorResourceTankBlock extends ReactorTankBlock{

    public static final MapCodec<ReactorResourceTankBlock> CODEC = simpleCodec(ReactorResourceTankBlock::new);

    public ReactorResourceTankBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new ReactorResourceTankBlockEntity(blockPos, blockState);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }
}
