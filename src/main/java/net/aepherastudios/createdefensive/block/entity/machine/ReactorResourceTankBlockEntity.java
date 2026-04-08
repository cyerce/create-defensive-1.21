package net.aepherastudios.createdefensive.block.entity.machine;

import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

import java.util.List;

public class ReactorResourceTankBlockEntity extends BlockEntity implements IHaveGoggleInformation {
    public ReactorResourceTankBlockEntity(BlockPos pos, BlockState blockState) {
        super(DefensiveBlockEntities.REACTOR_RESOURCE_TANK_BE.get(), pos, blockState);
    }

    public FluidTank inputTank = new FluidTank(16000){
        @Override
        protected void onContentsChanged() {
            setChanged();
        }

        @Override
        public boolean isFluidValid(FluidStack stack) {
            return (stack.is(Fluids.WATER) || stack.is((DefensiveFluids.SOURCE_IRRADIATED_WATER)));
        }
    };

    public FluidTank outputTank = new FluidTank(16000){
        @Override
        protected void onContentsChanged() {
            setChanged();
        }

        @Override
        public boolean isFluidValid(FluidStack stack) {
            return false;
        }
    };

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
        return containedFluidTooltip(tooltip, false,
                level.getCapability(Capabilities.FluidHandler.BLOCK, getBlockPos(), null));
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        tag.put("input_tank", inputTank.writeToNBT(registries, new CompoundTag()));
        tag.put("output_tank", outputTank.writeToNBT(registries, new CompoundTag()));
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider registries) {
        inputTank.readFromNBT(registries, tag.getCompound("input_tank"));
        outputTank.readFromNBT(registries, tag.getCompound("output_tank"));
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("input_tank", inputTank.writeToNBT(registries, new CompoundTag()));
        tag.put("output_tank", outputTank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inputTank.readFromNBT(registries, tag.getCompound("input_tank"));
        outputTank.readFromNBT(registries, tag.getCompound("output_tank"));
    }
}
