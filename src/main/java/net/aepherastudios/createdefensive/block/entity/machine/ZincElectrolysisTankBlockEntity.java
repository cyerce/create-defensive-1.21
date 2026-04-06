package net.aepherastudios.createdefensive.block.entity.machine;

import com.simibubi.create.api.equipment.goggles.IHaveGoggleInformation;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.Capabilities;

import java.util.List;

public class ZincElectrolysisTankBlockEntity extends AbstractElectrolysisTankBlockEntity implements IHaveGoggleInformation {
    public ZincElectrolysisTankBlockEntity(BlockPos pos, BlockState blockState) {
        super(DefensiveBlockEntities.ZINC_ELECTROLYSIS_TANK_BE.get(), pos, blockState);
    }

    @Override
    public boolean addToGoggleTooltip(List<Component> tooltip, boolean isPlayerSneaking) {
        return containedFluidTooltip(tooltip, false,
                level.getCapability(Capabilities.FluidHandler.BLOCK, getBlockPos(), null));
    }
}
