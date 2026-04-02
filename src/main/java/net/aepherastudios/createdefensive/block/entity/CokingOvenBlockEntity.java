package net.aepherastudios.createdefensive.block.entity;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.fluid.SmartFluidTank;
import com.simibubi.create.foundation.utility.BlockHelper;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.custom.CokingOvenBlock;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.fluid.fluid_types.DieselFluidType;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.screen.menu.CokingOvenMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CokingOvenBlockEntity extends BlockEntity implements MenuProvider {
    public CokingOvenBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState){
        super(pType, pPos, pBlockState);
    }

    private final FluidTank tank = new FluidTank(8000) {
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
    };

    public final ItemStackHandler itemHandler = new ItemStackHandler(2){
        @Override
        protected void onContentsChanged(int slot){
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack){
            return switch(slot) {
                case 0 -> stack.getItem() == Items.COAL || stack.getItem() == Items.OAK_LOG ||
                        stack.getItem() == Items.ACACIA_LOG || stack.getItem() == Items.BIRCH_LOG ||
                        stack.getItem() == Items.CHERRY_LOG || stack.getItem() == Items.JUNGLE_LOG ||
                        stack.getItem() == Items.DARK_OAK_LOG || stack.getItem() == Items.MANGROVE_LOG ||
                        stack.getItem() == Items.SPRUCE_LOG || stack.getItem() == Items.STRIPPED_ACACIA_LOG ||
                        stack.getItem() == Items.STRIPPED_OAK_LOG || stack.getItem() == Items.STRIPPED_BIRCH_LOG ||
                        stack.getItem() == Items.STRIPPED_CHERRY_LOG || stack.getItem() == Items.STRIPPED_JUNGLE_LOG ||
                        stack.getItem() == Items.STRIPPED_DARK_OAK_LOG || stack.getItem() == Items.STRIPPED_MANGROVE_LOG ||
                        stack.getItem() == Items.STRIPPED_SPRUCE_LOG;
                case 1 -> stack.getItem() == DefensiveItems.COKE.get()  || stack.getItem() == Items.CHARCOAL;
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    public static final int SLOT1 = 0;
    public static final int SLOT2 = 1;

    private Optional<IItemHandler> lazyItemHandler = Optional.empty();

    protected ContainerData data;
    private int heatedProgress;
    // (mentiy werse here =}> <- does haves moosetach)
    private int heatedMaxProgress = 195;


    public CokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(DefensiveBlockEntities.COKING_OVEN_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int i) {
                return switch (i){
                    case 0 -> CokingOvenBlockEntity.this.heatedProgress;
                    case 1 -> CokingOvenBlockEntity.this.heatedMaxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int i1) {
                switch (i){
                    case 0 -> CokingOvenBlockEntity.this.heatedProgress = i1;
                    case 1 -> CokingOvenBlockEntity.this.heatedMaxProgress = i1;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    public void drops() {
        SimpleContainer invintory = new SimpleContainer(itemHandler.getSlots());
        for(int i = 0; i < itemHandler.getSlots(); i++){
            invintory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, invintory);

    }

    public IFluidHandler getFluidHandler(Direction side) {
        return tank;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.createdefensive.coking_oven");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new CokingOvenMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", itemHandler.serializeNBT(registries));
        tag.put("Tank", tank.writeToNBT(registries, new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        itemHandler.deserializeNBT(registries, tag.getCompound("inventory"));
        tank.readFromNBT(registries, tag.getCompound("Tank"));
    }

    public Boolean isLit() {
        return false;
    }

    public void tick(Level level, BlockPos pPos, BlockState pState, CokingOvenBlockEntity pBlockEntity) {
        if (itemHandler.isItemValid(SLOT1, new ItemStack(itemHandler.getStackInSlot(SLOT1).getItem()))) {
            BlazeBurnerBlock.HeatLevel heat = CokingOvenBlockEntity.getHeatLevelOf(getLevel().getBlockState(getBlockPos().below(1)));
            if (heat.isAtLeast(HeatCondition.HEATED.visualizeAsBlazeBurner())) {
                int progressAdd = 1;
                if (heat.isAtLeast(HeatCondition.SUPERHEATED.visualizeAsBlazeBurner())) {
                    progressAdd = 5;
                }


                if (heatedProgress < heatedMaxProgress) {
                    heatedProgress+= progressAdd;
                    level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, true));
                } else if (heatedProgress >= heatedMaxProgress) {
                    if (itemHandler.getStackInSlot(SLOT1).getItem() == Items.OAK_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.ACACIA_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.BIRCH_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.CHERRY_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.JUNGLE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.DARK_OAK_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.MANGROVE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.SPRUCE_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_ACACIA_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_OAK_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_BIRCH_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_CHERRY_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_JUNGLE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_DARK_OAK_LOG || itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_MANGROVE_LOG ||
                            itemHandler.getStackInSlot(SLOT1).getItem() == Items.STRIPPED_SPRUCE_LOG) {
                        itemHandler.setStackInSlot(SLOT2, new ItemStack(Items.CHARCOAL,
                                itemHandler.getStackInSlot(SLOT2).getCount() + 1));
                    } else if (itemHandler.getStackInSlot(SLOT1).getItem() == Items.COAL) {
                        itemHandler.setStackInSlot(SLOT2, new ItemStack(DefensiveItems.COKE.get(),
                                itemHandler.getStackInSlot(SLOT2).getCount() + 1));
                    } else {
                        level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
                    }
                    tank.fill(new FluidStack(DefensiveFluids.SOURCE_ETHANE, 100), IFluidHandler.FluidAction.EXECUTE);


                    itemHandler.extractItem(SLOT1, 1, false);
                    heatedProgress = 0;
                } else {
                    level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
                }
            } else {
                level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
            }
        } else {
            level.setBlockAndUpdate(pPos, pState.setValue(CokingOvenBlock.LIT, false));
        }
    }

    public static BlazeBurnerBlock.HeatLevel getHeatLevelOf(BlockState state) {
        if (state.hasProperty(BlazeBurnerBlock.HEAT_LEVEL))
            return state.getValue(BlazeBurnerBlock.HEAT_LEVEL);
        return AllTags.AllBlockTags.PASSIVE_BOILER_HEATERS.matches(state) && BlockHelper.isNotUnheated(state)
                ? BlazeBurnerBlock.HeatLevel.SMOULDERING
                : BlazeBurnerBlock.HeatLevel.NONE;

    }


}
