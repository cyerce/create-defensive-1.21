package net.aepherastudios.createdefensive.block.entity;

import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

public class FractionalStillTank extends BlockEntity {

    public FluidTank fluidTank = new FluidTank(8000){
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
    };

    public FluidTank getFluidTank() {
        return fluidTank;
    }

    public FractionalStillTank(BlockPos pos, BlockState blockState) {
        super(DefensiveBlockEntities.FRACTIONAL_STILL_OUTPUT_BE.get(), pos, blockState);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("Tank", fluidTank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        fluidTank.readFromNBT(registries, tag.getCompound("Tank"));
    }
}
