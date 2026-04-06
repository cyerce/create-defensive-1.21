package net.aepherastudios.createdefensive.block.entity.machine;

import com.simibubi.create.AllTags;
import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.foundation.utility.BlockHelper;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

import java.util.List;

public class FractionalStillControllerBlockEntity extends BlockEntity implements IHaveGoggleInformation {

    public final FluidTank inputTank = new FluidTank(8000) {
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
    };

    public FractionalStillControllerBlockEntity(BlockPos pos, BlockState blockState) {
        super(DefensiveBlockEntities.FRACTIONAL_STILL_BE.get(), pos, blockState);
    }


    public void tick(Level level, BlockPos pos, BlockState state, FractionalStillControllerBlockEntity blockEntity) {
        if (level.getGameTime() % 20 == 0){
            BlockEntity output0be = level.getBlockEntity(new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ()));
            BlockEntity output1be = level.getBlockEntity(new BlockPos(pos.getX(), pos.getY() + 2, pos.getZ()));
            BlockEntity output2be = level.getBlockEntity(new BlockPos(pos.getX(), pos.getY() + 3, pos.getZ()));
            BlockEntity output3be = level.getBlockEntity(new BlockPos(pos.getX(), pos.getY() + 4, pos.getZ()));
            if (output0be instanceof FractionalStillTank
                    && output1be instanceof FractionalStillTank
                    && output2be instanceof FractionalStillTank
                    && output3be instanceof FractionalStillTank){
                FluidTank output0Tank = ((FractionalStillTank) output0be).getFluidTank();
                FluidTank output1Tank = ((FractionalStillTank) output1be).getFluidTank();
                FluidTank output2Tank = ((FractionalStillTank) output2be).getFluidTank();
                FluidTank output3Tank = ((FractionalStillTank) output3be).getFluidTank();

                BlazeBurnerBlock.HeatLevel heat = getHeatLevelOf(level.getBlockState(pos.below()));

                if (heat.isAtLeast(BlazeBurnerBlock.HeatLevel.FADING)){
                    if (!inputTank.isEmpty() && inputTank.getFluid().getFluid() == DefensiveFluids.SOURCE_CRUDE_OIL.get() && inputTank.getFluidAmount() > 1000){
                        inputTank.drain(1000, IFluidHandler.FluidAction.EXECUTE);

                        output0Tank.fill(new FluidStack(DefensiveFluids.SOURCE_BITUMEN.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        output1Tank.fill(new FluidStack(DefensiveFluids.SOURCE_DIESEL.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        output2Tank.fill(new FluidStack(DefensiveFluids.SOURCE_KEROSENE.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        output3Tank.fill(new FluidStack(DefensiveFluids.SOURCE_GASOLINE.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        setChanged();
                    }
                    if (!inputTank.isEmpty() && inputTank.getFluid().getFluid() == DefensiveFluids.SOURCE_NATURAL_GAS.get() && inputTank.getFluidAmount() > 1000){
                        inputTank.drain(1000, IFluidHandler.FluidAction.EXECUTE);

                        output0Tank.fill(new FluidStack(DefensiveFluids.SOURCE_BUTANE.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        output1Tank.fill(new FluidStack(DefensiveFluids.SOURCE_PROPANE.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        output2Tank.fill(new FluidStack(DefensiveFluids.SOURCE_ETHANE.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        output3Tank.fill(new FluidStack(DefensiveFluids.SOURCE_METHANE.get(), 250), IFluidHandler.FluidAction.EXECUTE);
                        setChanged();
                    }
                }
            }
        }
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

    public static BlazeBurnerBlock.HeatLevel getHeatLevelOf(BlockState state) {
        if (state.hasProperty(BlazeBurnerBlock.HEAT_LEVEL))
            return state.getValue(BlazeBurnerBlock.HEAT_LEVEL);
        return AllTags.AllBlockTags.PASSIVE_BOILER_HEATERS.matches(state) && BlockHelper.isNotUnheated(state)
                ? BlazeBurnerBlock.HeatLevel.SMOULDERING
                : BlazeBurnerBlock.HeatLevel.NONE;
    }

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
        return containedFluidTooltip(tooltip, false,
                level.getCapability(Capabilities.FluidHandler.BLOCK, getBlockPos(), null));
    }
}
