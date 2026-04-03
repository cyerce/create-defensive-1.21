package net.aepherastudios.createdefensive.block.custom;

import com.mojang.serialization.MapCodec;
import net.aepherastudios.createdefensive.block.entity.FractionalStillTank;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class FractionalStillTankBlock extends BaseEntityBlock {

    public static final MapCodec<FractionalStillTankBlock> CODEC = simpleCodec(FractionalStillTankBlock::new);
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);

    public FractionalStillTankBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext){
        return SHAPE;
    }

    /* Block Entity Stuff? */

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }


    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FractionalStillTank(blockPos, blockState);
    }
}
