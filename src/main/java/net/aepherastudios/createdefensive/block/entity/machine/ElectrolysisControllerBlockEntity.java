package net.aepherastudios.createdefensive.block.entity.machine;

import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.custom.machine.ElectrolysisControllerBlock;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

import java.util.List;

public class ElectrolysisControllerBlockEntity extends BlockEntity implements IHaveGoggleInformation {

    public final FluidTank inputTank = new FluidTank(8000){
        @Override
        protected void onContentsChanged() {
            super.onContentsChanged();
        }
    };

    public ElectrolysisControllerBlockEntity(BlockPos pos, BlockState blockState) {
        super(DefensiveBlockEntities.ELECTROLYSIS_CONTROLLER_BE.get(), pos, blockState);
    }

    public FluidTank getInputTank() {
        return inputTank;
    }

    public void fill(FluidStack resource, IFluidHandler.FluidAction action){
        this.inputTank.fill(resource, action);
    }

    public void drain(int maxDrain, IFluidHandler.FluidAction action){
        this.inputTank.drain(maxDrain, action);
    }

    public void drain(FluidStack resource, IFluidHandler.FluidAction action){
        this.inputTank.drain(resource, action);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        tag.put("Tank", inputTank.writeToNBT(registries, new CompoundTag()));
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider registries) {
        inputTank.readFromNBT(registries, tag.getCompound("Tank"));
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("Tank", inputTank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inputTank.readFromNBT(registries, tag.getCompound("Tank"));
    }

    public void tick(Level level, BlockPos pos, BlockState state, ElectrolysisControllerBlockEntity blockEntity){
        if (getBlockState().getBlock() instanceof ElectrolysisControllerBlock && (level.getGameTime() % 20 == 0)){
            Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            Direction leftDir = switch (facing) {
                case NORTH -> Direction.WEST;
                case SOUTH -> Direction.EAST;
                case EAST  -> Direction.NORTH;
                case WEST  -> Direction.SOUTH;
                default -> Direction.NORTH;
            };
            Direction rightDir = switch (facing) {
                case NORTH -> Direction.EAST;
                case SOUTH -> Direction.WEST;
                case EAST  -> Direction.SOUTH;
                case WEST  -> Direction.NORTH;
                default -> Direction.SOUTH;
            };

            BlockPos leftPos = pos.relative(leftDir);
            BlockPos rightPos = pos.relative(rightDir);

            if (level.getBlockEntity(leftPos) instanceof CopperElectrolysisTankBlockEntity leftTank
                    && level.getBlockEntity(rightPos) instanceof ZincElectrolysisTankBlockEntity rightTank){
                if (inputTank.getFluid().getFluid().isSame(Fluids.WATER)){
                    if ((leftTank.getOutputTank().isEmpty() || leftTank.getOutputTank().getFluid().getFluid().isSame(DefensiveFluids.SOURCE_HYDROGEN.get()))
                    && ((rightTank.getOutputTank().isEmpty() || rightTank.getOutputTank().getFluid().getFluid().isSame(DefensiveFluids.SOURCE_OXYGEN.get())))){
                        leftTank.fill(new FluidStack(DefensiveFluids.SOURCE_HYDROGEN.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        rightTank.fill(new FluidStack(DefensiveFluids.SOURCE_OXYGEN.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        inputTank.drain(new FluidStack(Fluids.WATER, 500), IFluidHandler.FluidAction.EXECUTE);
                    }
                } else if (inputTank.getFluid().getFluid().isSame(DefensiveFluids.SOURCE_MOLTEN_SALT.get())){
                    if ((leftTank.getOutputTank().isEmpty() || leftTank.getOutputTank().getFluid().getFluid().isSame(DefensiveFluids.SOURCE_MOLTEN_SODIUM.get()))
                            && ((rightTank.getOutputTank().isEmpty() || rightTank.getOutputTank().getFluid().getFluid().isSame(DefensiveFluids.SOURCE_CHLORINE.get())))){
                        leftTank.fill(new FluidStack(DefensiveFluids.SOURCE_MOLTEN_SODIUM.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        rightTank.fill(new FluidStack(DefensiveFluids.SOURCE_CHLORINE.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        inputTank.drain(new FluidStack(DefensiveFluids.SOURCE_MOLTEN_SODIUM, 500), IFluidHandler.FluidAction.EXECUTE);
                    }
                }
                setChanged();
            }
        }
    }

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
        return containedFluidTooltip(tooltip, false,
                level.getCapability(Capabilities.FluidHandler.BLOCK, getBlockPos(), null));
    }

}
