package net.aepherastudios.createdefensive.block.entity.machine;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.utility.BlockHelper;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.block.custom.machine.CokingOvenBlock;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.aepherastudios.createdefensive.recipe.type.CokingRecipe;
import net.aepherastudios.createdefensive.screen.menu.CokingOvenMenu;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

public class CokingOvenBlockEntity extends BlockEntity implements MenuProvider {

    public final ItemStackHandler itemHandler = new ItemStackHandler(2) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (slot == 0) {
                currentRecipe = null;
            }
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            if (slot == 1) return false;
            return slot == 0;
        }
    };

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        tag.put("Tank", tank.writeToNBT(registries, new CompoundTag()));
        tag.put("inventory", itemHandler.serializeNBT(registries));
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider registries) {
        tank.readFromNBT(registries, tag.getCompound("Tank"));
        itemHandler.deserializeNBT(registries, tag.getCompound("inventory"));
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    private final FluidTank tank = new FluidTank(8000) {
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
    };

    public static final int INPUT_SLOT = 0;
    public static final int OUTPUT_SLOT = 1;

    protected final ContainerData data;
    private int progress = 0;
    private static final int MAX_PROGRESS = 195;

    @Nullable
    private CokingRecipe currentRecipe = null;

    public CokingOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(DefensiveBlockEntities.COKING_OVEN_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int i) {
                return switch (i) {
                    case 0 -> CokingOvenBlockEntity.this.progress;
                    case 1 -> MAX_PROGRESS;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int value) {
                if (i == 0) CokingOvenBlockEntity.this.progress = value;
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Nullable
    private CokingRecipe findRecipe() {
        if (level == null) return null;
        ItemStack input = itemHandler.getStackInSlot(INPUT_SLOT);
        if (input.isEmpty()) return null;
        SingleRecipeInput recipeInput = new SingleRecipeInput(input);
        return level.getRecipeManager()
                .getRecipeFor(DefensiveRecipes.COKING_TYPE.get(), recipeInput, level)
                .map(RecipeHolder::value)
                .orElse(null);
    }

    private boolean canOutput(CokingRecipe recipe) {
        ItemStack outputSlot = itemHandler.getStackInSlot(OUTPUT_SLOT);
        ItemStack recipeResult = recipe.getResult();

        if (outputSlot.isEmpty()) return true;
        if (!ItemStack.isSameItemSameComponents(outputSlot, recipeResult)) return false;
        return outputSlot.getCount() + recipeResult.getCount() <= outputSlot.getMaxStackSize();
    }

    private boolean canFillFluid(CokingRecipe recipe) {
        FluidStack fluidResult = recipe.getFluidResult();
        return tank.fill(fluidResult, IFluidHandler.FluidAction.SIMULATE) == fluidResult.getAmount();
    }

    public void tick(Level level, BlockPos pos, BlockState state, CokingOvenBlockEntity blockEntity) {
        BlazeBurnerBlock.HeatLevel heat = getHeatLevelOf(level.getBlockState(pos.below()));

        if (!heat.isAtLeast(HeatCondition.HEATED.visualizeAsBlazeBurner())) {
            setLit(level, pos, state, false);
            progress = 0;
            return;
        }

        if (currentRecipe == null) {
            currentRecipe = findRecipe();
        }

        if (currentRecipe == null) {
            setLit(level, pos, state, false);
            progress = 0;
            return;
        }

        if (!canOutput(currentRecipe) || !canFillFluid(currentRecipe)) {
            setLit(level, pos, state, false);
            return;
        }

        setLit(level, pos, state, true);

        int progressAdd = heat.isAtLeast(HeatCondition.SUPERHEATED.visualizeAsBlazeBurner()) ? 5 : 1;
        progress += progressAdd;

        if (progress >= MAX_PROGRESS) {
            process(currentRecipe);
            progress = 0;
            currentRecipe = null;
        }

        setChanged();
    }

    private void process(CokingRecipe recipe) {
        itemHandler.extractItem(INPUT_SLOT, 1,  false);

        ItemStack outputSlot = itemHandler.getStackInSlot(OUTPUT_SLOT);
        if (outputSlot.isEmpty()) {
            itemHandler.setStackInSlot(OUTPUT_SLOT, recipe.getResult());
        } else {
            outputSlot.grow(recipe.getResult().getCount());
        }

        tank.fill(recipe.getFluidResult(), IFluidHandler.FluidAction.EXECUTE);
        level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);

        setChanged();
    }

    private void setLit(Level level, BlockPos pos, BlockState state, boolean lit) {
        if (state.getValue(CokingOvenBlock.LIT) != lit) {
            level.setBlockAndUpdate(pos, state.setValue(CokingOvenBlock.LIT, lit));
        }
    }

    public boolean isLit() {
        return getBlockState().getValue(CokingOvenBlock.LIT);
    }

    public IFluidHandler getFluidHandler(Direction side) {
        return tank;
    }

    public FluidStack getFluidStack() {
        return tank.getFluid();
    }

    public int getTankCapacity() {
        return tank.getCapacity();
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.createdefensive.coking_oven").withStyle(ChatFormatting.WHITE);
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
        tag.putInt("Progress", progress);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        itemHandler.deserializeNBT(registries, tag.getCompound("inventory"));
        tank.readFromNBT(registries, tag.getCompound("Tank"));
        progress = tag.getInt("Progress");
    }

    public static BlazeBurnerBlock.HeatLevel getHeatLevelOf(BlockState state) {
        if (state.hasProperty(BlazeBurnerBlock.HEAT_LEVEL))
            return state.getValue(BlazeBurnerBlock.HEAT_LEVEL);
        return AllTags.AllBlockTags.PASSIVE_BOILER_HEATERS.matches(state) && BlockHelper.isNotUnheated(state)
                ? BlazeBurnerBlock.HeatLevel.SMOULDERING
                : BlazeBurnerBlock.HeatLevel.NONE;
    }
}