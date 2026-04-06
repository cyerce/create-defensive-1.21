package net.aepherastudios.createdefensive.block.entity.trap;


import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import com.simibubi.create.content.fluids.tank.FluidTankBlockEntity;
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
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;

import java.util.List;

public class GasTrapBlockEntity extends BlockEntity implements IHaveGoggleInformation {

    private long lastFireTime = 0;
    private static final long COOLDOWN_TICKS = 60;

    public FluidTank gasTank = new FluidTank(2000){
        @Override
        protected void onContentsChanged() {
            super.onContentsChanged();
        }
    };

    public GasTrapBlockEntity(BlockPos pos, BlockState state) {
        super(DefensiveBlockEntities.GAS_TRAP_BE.get(), pos, state);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        tag.put("Tank", gasTank.writeToNBT(registries, new CompoundTag()));
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider registries) {
        gasTank.readFromNBT(registries, tag.getCompound("Tank"));
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("Tank", gasTank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        gasTank.readFromNBT(registries, tag.getCompound("Tank"));
    }

    public boolean canShoot(Level level) {
        long gameTime = level.getGameTime();
        if (gameTime - lastFireTime >= COOLDOWN_TICKS && gasTank.getFluid().is(DefensiveFluids.SOURCE_MUSTARD_GAS) && gasTank.getFluidAmount() >= 100) {
            lastFireTime = gameTime;
            return true;
        }
        return false;
    }

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
        return containedFluidTooltip(tooltip, false,
                level.getCapability(Capabilities.FluidHandler.BLOCK, getBlockPos(), null));
    }

}
