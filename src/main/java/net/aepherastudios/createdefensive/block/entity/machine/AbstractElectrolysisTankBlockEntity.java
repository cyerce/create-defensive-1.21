package net.aepherastudios.createdefensive.block.entity.machine;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

public abstract class AbstractElectrolysisTankBlockEntity extends BlockEntity {

    public final FluidTank outputTank = new FluidTank(8000){
        @Override
        protected void onContentsChanged() {
            super.onContentsChanged();
        }
    };

    public AbstractElectrolysisTankBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState blockState) {
        super(type, pos, blockState);
    }

    public FluidTank getOutputTank() {
        return outputTank;
    }

    public void fill(FluidStack resource, IFluidHandler.FluidAction action){
        this.outputTank.fill(resource, action);
    }

    public void drain(int maxDrain, IFluidHandler.FluidAction action){
        this.outputTank.drain(maxDrain, action);
    }

    public void drain(FluidStack resource, IFluidHandler.FluidAction action){
        this.outputTank.drain(resource, action);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        tag.put("Tank", outputTank.writeToNBT(registries, new CompoundTag()));
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider registries) {
        outputTank.readFromNBT(registries, tag.getCompound("Tank"));
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("Tank", outputTank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        outputTank.readFromNBT(registries, tag.getCompound("Tank"));
    }
}
