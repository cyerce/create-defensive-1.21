package net.aepherastudios.createdefensive.block.entity.machine;

import com.simibubi.create.AllSoundEvents;
import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.RadiationCloudEntity;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.aepherastudios.createdefensive.recipe.DefensiveRecipes;
import net.aepherastudios.createdefensive.recipe.custom.ReactorFluidInput;
import net.aepherastudios.createdefensive.recipe.type.ReactorFluidRecipe;
import net.aepherastudios.createdefensive.recipe.type.ReactorItemRecipe;
import net.aepherastudios.createdefensive.screen.menu.CokingOvenMenu;
import net.aepherastudios.createdefensive.screen.menu.ReactorMenu;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
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
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

public class ReactorBlockEntity extends BlockEntity implements MenuProvider {

    public static final int FUEL_SLOT_1 = 0;
    public static final int FUEL_SLOT_2 = 1;
    public static final int FUEL_SLOT_3 = 2;
    public static final int FUEL_SLOT_4 = 3;
    public static final int FUEL_SLOT_5 = 4;
    public static final int CONTROL_SLOT_1 = 5;
    public static final int CONTROL_SLOT_2 = 6;
    public static final int CONTROL_SLOT_3 = 7;
    public static final int CONTROL_SLOT_4 = 8;
    public static final int CONTROL_SLOT_5 = 9;
    public static final int NEUTRON_SLOT = 10;
    public static final int INPUT_SLOT = 11;
    public static final int OUTPUT_SLOT = 12;

    protected final ContainerData data;

    public static final int COUNTDOWN_MAX = 30;
    public int countdown = 30;
    public boolean meltdown = false;
    public boolean powered = false;
    public boolean active = false;
    public boolean exploded = false;

    private final int MAX_PROGRESS = 195;
    public int progress = 0;

    @Nullable
    private ReactorItemRecipe currentItemRecipe = null;

    @Nullable
    private ReactorFluidRecipe currentFluidRecipe = null;

    public ReactorBlockEntity(BlockPos pos, BlockState blockState) {
        super(DefensiveBlockEntities.REACTOR_BE.get(), pos, blockState);
        this.data = new ContainerData() {
            @Override
            public int get(int i) {
                return switch (i) {
                    case 0 -> ReactorBlockEntity.this.progress;
                    case 1 -> MAX_PROGRESS;
                    default -> 0;
                };
            }

            @Override
            public void set(int i, int value) {
                if (i == 0) ReactorBlockEntity.this.progress = value;
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    public void drops() {
        SimpleContainer dropInventory = new SimpleContainer(inventory.getSlots());
        for (int i = 0; i < inventory.getSlots(); i++) {
            dropInventory.setItem(i, inventory.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, dropInventory);
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new ReactorMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.createdefensive.reactor").withStyle(ChatFormatting.WHITE);
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }


    public boolean isMeltdown(){
        return meltdown;
    }

    public void setMeltdown(boolean meltdown){
        this.meltdown = meltdown;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    public boolean isActive() {
        return active;
    }

    @Nullable
    private ReactorItemRecipe findItemRecipe() {
        if (level == null) return null;
        ItemStack input = inventory.getStackInSlot(INPUT_SLOT);
        if (input.isEmpty()) return null;
        SingleRecipeInput recipeInput = new SingleRecipeInput(input);
        return level.getRecipeManager()
                .getRecipeFor(DefensiveRecipes.REACTOR_ITEM_TYPE.get(), recipeInput, level)
                .map(RecipeHolder::value)
                .orElse(null);
    }

    @Nullable
    private ReactorFluidRecipe findFluidRecipe() {
        if (level == null) return null;
        FluidStack input = inputResourceTank.getFluid();
        if (input.isEmpty()) return null;
        ReactorFluidInput recipeInput = new ReactorFluidInput(input.getFluid());
        return level.getRecipeManager()
                .getRecipeFor(DefensiveRecipes.REACTOR_FLUID_TYPE.get(), recipeInput, level)
                .map(RecipeHolder::value)
                .orElse(null);
    }

    public void setActive(boolean active) {
        this.active = active;
        if (active){
            inventory.getStackInSlot(NEUTRON_SLOT).hurtAndBreak(1, (ServerLevel) level, null, item -> {});
        }
    }

    public final ItemStackHandler inventory = new ItemStackHandler(13){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (slot == INPUT_SLOT) {
                currentItemRecipe = null;
            }
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            if (slot >= 0 && slot <= 4){
                return (stack.is(DefensiveItems.FUEL_ROD) || stack.is(DefensiveItems.SPENT_FUEL_ROD));
            } else if (slot >= 5 && slot <= 9){
                return (stack.is(DefensiveItems.CONTROL_ROD));
            }
            else if (slot == NEUTRON_SLOT){
                return (stack.is(DefensiveItems.NEUTRON_ACTIVATOR));
            } else if (slot == INPUT_SLOT){
                return true;
            } else if (slot == OUTPUT_SLOT){
                return false;
            } else {
                return false;
            }
        }
    };

    public final FluidTank inputCoolantTank = new FluidTank(16000){
        @Override
        protected void onContentsChanged() {
            setChanged();
        }

        @Override
        public boolean isFluidValid(FluidStack stack) {
            return (stack.is(Fluids.WATER) || stack.is(DefensiveFluids.SOURCE_IRRADIATED_WATER));
        }
    };

    public final FluidTank outputCoolantTank = new FluidTank(16000){
        @Override
        protected void onContentsChanged() {
            setChanged();
        }

        @Override
        public boolean isFluidValid(FluidStack stack) {
            return false;
        }

        public boolean isFull(){
            return this.fluid.getAmount() >= this.capacity;
        }
    };

    public final FluidTank inputResourceTank = new FluidTank(16000){
        @Override
        protected void onContentsChanged() {
            setChanged();
        }
    };

    public final FluidTank outputResourceTank = new FluidTank(16000){
        @Override
        protected void onContentsChanged() {
            setChanged();
        }

        @Override
        public boolean isFluidValid(FluidStack stack) {
            return false;
        }
    };

    public boolean shouldMeltdown(){
        for (int i = 5; i <= 9; i++) {
            ItemStack stack = inventory.getStackInSlot(i);
            if (!stack.is(DefensiveItems.CONTROL_ROD)) {
                return true;
            }
        }

        FluidStack input = inputCoolantTank.getFluid();
        if (!(input.is(Fluids.WATER) || input.is(DefensiveFluids.SOURCE_IRRADIATED_WATER))) {
            return true;
        }

        if (outputCoolantTank.getFluidAmount() >= outputCoolantTank.getCapacity()) {
            return true;
        }

        return false;
    }

    public boolean shouldActivate(){
        for (int i = 0; i <= 4; i++) {
            ItemStack stack = inventory.getStackInSlot(i);
            if (!stack.is(DefensiveItems.FUEL_ROD)) {
                return false;
            }
        }

        if (!inventory.getStackInSlot(NEUTRON_SLOT).is(DefensiveItems.NEUTRON_ACTIVATOR)){
            return false;
        }

        return powered;
    }

    public void meltdown(){
        if (countdown > 0){
            countdown--;
            if (level instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.CLOUD,
                        getBlockPos().getX() + 0.5,
                        getBlockPos().getY() + 0.5,
                        getBlockPos().getZ() + 0.5,
                        10,
                        0, 0, 0,
                        0.25
                );
                serverLevel.sendParticles(
                        ParticleTypes.ANGRY_VILLAGER,
                        getBlockPos().getX() + 0.5,
                        getBlockPos().getY() + 0.5,
                        getBlockPos().getZ() + 0.5,
                        3,
                        1, 1, 1,
                        0.15
                );
            }
            level.playSound(null, getBlockPos(), AllSoundEvents.STEAM.getMainEvent(), SoundSource.BLOCKS, 1, 1);

        } else {
            if (level != null) {
                if (!exploded) {
                    exploded = true;
                    explode();
                }
            }
        }
    }

    public void explode(){
        if (level instanceof net.minecraft.server.level.ServerLevel serverLevel) {
            RadiationCloudEntity cloud = new RadiationCloudEntity(
                    DefensiveEntities.RADIATION_CLOUD.get(), serverLevel
            );
            cloud.setPos(getBlockPos().getX(), getBlockPos().getY(), getBlockPos().getZ());
            cloud.setRadius(30.0f);
            cloud.setDuration(600);
            serverLevel.addFreshEntity(cloud);
        }

        level.explode(null,
                getBlockPos().getX(),
                getBlockPos().getY(),
                getBlockPos().getZ(),
                30,
                Level.ExplosionInteraction.TNT
        );
    }

    public void process(BlockPos leftPos, BlockPos rightPos, BlockPos backPos) {
        if (level == null || level.isClientSide()) return;

        if (currentItemRecipe == null) {
            currentItemRecipe = findItemRecipe();
            progress = 0;
        }

        if (currentFluidRecipe == null) {
            currentFluidRecipe = findFluidRecipe();
        }

        for (int i = 0; i <= 4; i++) {
            final int slot = i;
            ItemStack itemStack = inventory.getStackInSlot(i);
            if (!itemStack.isEmpty()) {
                itemStack.hurtAndBreak(1, (ServerLevel) level, null, item -> {
                    inventory.setStackInSlot(slot, new ItemStack(DefensiveItems.SPENT_FUEL_ROD.get()));
                });
            }
        }

        for (int i = 5; i <= 9; i++) {
            ItemStack itemStack = inventory.getStackInSlot(i);
            if (!itemStack.isEmpty()) {
                itemStack.hurtAndBreak(1, (ServerLevel) level, null, item -> {});
            }
        }

        if (!inventory.getStackInSlot(INPUT_SLOT).isEmpty()){
            if (progress >= MAX_PROGRESS){
                progress = 0;
                processItemRecipe(currentItemRecipe, backPos);
            } else {
                progress ++;
            }
        }

        if (inputResourceTank.getFluidAmount() > 10){
            processFluidRecipe(currentFluidRecipe, rightPos);
        }

        processCoolant(leftPos);
    }

    public void processItemRecipe(ReactorItemRecipe recipe, BlockPos backPos){
        if (recipe == null) return;
        inventory.extractItem(INPUT_SLOT, 1,  false);
        ItemStack outputSlot = inventory.getStackInSlot(OUTPUT_SLOT);
        if (outputSlot.isEmpty()) {
            inventory.setStackInSlot(OUTPUT_SLOT, recipe.getResult());
        } else {
            outputSlot.grow(recipe.getResult().getCount());
        }
        level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);

        if (inventory.getStackInSlot(INPUT_SLOT).isEmpty()){
            // TODO: write the gawt damn block for backPos
        }


        setChanged();
    }

    public void processFluidRecipe(ReactorFluidRecipe recipe, BlockPos rightPos){
        if (recipe == null) return;
        if (inputResourceTank.getFluid().getFluid() != recipe.getIngredient()
                || (outputResourceTank.getFluid().getFluid() != recipe.getResult())){
            this.currentFluidRecipe = null;
        } else {
            if (inputResourceTank.getFluidAmount() >= 10){
                inputResourceTank.drain(10, IFluidHandler.FluidAction.EXECUTE);
                outputResourceTank.fill(new FluidStack(recipe.getResult(), 10), IFluidHandler.FluidAction.EXECUTE);
            }
        }

        setChanged();
    }

    public void processCoolant(BlockPos leftPos){
        inputCoolantTank.drain(10, IFluidHandler.FluidAction.EXECUTE);
        outputCoolantTank.fill(new FluidStack(DefensiveFluids.SOURCE_SUPERHEATED_IRRADIATED_WATER, 10), IFluidHandler.FluidAction.EXECUTE);
        setChanged();

        if (level.getBlockEntity(leftPos) instanceof ReactorCoolantTankBlockEntity extraTank){
            if (inputCoolantTank.isEmpty() || extraTank.inputTank.getFluid().is(inputCoolantTank.getFluid().getFluid())){
                if (extraTank.inputTank.getFluidAmount() >= 100){
                    extraTank.inputTank.drain(100, IFluidHandler.FluidAction.EXECUTE);
                    inputCoolantTank.fill(new FluidStack(extraTank.inputTank.getFluid().getFluid(), 100), IFluidHandler.FluidAction.EXECUTE);
                }
            }

            if (outputCoolantTank.getFluidAmount() >= 100 && extraTank.outputTank.getFluidAmount() < extraTank.outputTank.getCapacity() - 100){
                outputCoolantTank.drain(100, IFluidHandler.FluidAction.EXECUTE);
                extraTank.outputTank.fill(new FluidStack(DefensiveFluids.SOURCE_SUPERHEATED_IRRADIATED_WATER, 100), IFluidHandler.FluidAction.EXECUTE);
            }
        }
    }

    public void tick(Level level, BlockPos pos, BlockState state){
        if (!isPowered() && !isMeltdown()) return;

        setMeltdown(shouldMeltdown());
        setActive(shouldActivate());

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
        Direction backDir = switch (facing) {
            case NORTH -> Direction.SOUTH;
            case SOUTH -> Direction.NORTH;
            case EAST  -> Direction.WEST;
            case WEST  -> Direction.EAST;
            default -> Direction.SOUTH;
        };

        BlockPos leftPos = pos.relative(leftDir);
        BlockPos rightPos = pos.relative(rightDir);
        BlockPos backPos = pos.relative(backDir);

        if (level.getGameTime() % 20 == 0){
            if (isMeltdown()){
                meltdown();
            } else {
                countdown = COUNTDOWN_MAX;
                process(leftPos, rightPos, backPos);
            }
        }
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        tag.put("coolant_input", inputCoolantTank.writeToNBT(registries, new CompoundTag()));
        tag.put("coolant_output", outputCoolantTank.writeToNBT(registries, new CompoundTag()));
        tag.put("resource_input", inputResourceTank.writeToNBT(registries, new CompoundTag()));
        tag.put("resource_output", outputResourceTank.writeToNBT(registries, new CompoundTag()));
        tag.put("inventory", inventory.serializeNBT(registries));
        tag.putInt("progress", progress);
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, HolderLookup.Provider registries) {
        inputCoolantTank.readFromNBT(registries, tag.getCompound("coolant_input"));
        outputCoolantTank.readFromNBT(registries, tag.getCompound("coolant_output"));
        inputResourceTank.readFromNBT(registries, tag.getCompound("resource_input"));
        outputResourceTank.readFromNBT(registries, tag.getCompound("resource_output"));
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
        progress = tag.getInt("progress");
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("coolant_input", inputCoolantTank.writeToNBT(registries, new CompoundTag()));
        tag.put("coolant_output", outputCoolantTank.writeToNBT(registries, new CompoundTag()));
        tag.put("resource_input", inputResourceTank.writeToNBT(registries, new CompoundTag()));
        tag.put("resource_output", outputResourceTank.writeToNBT(registries, new CompoundTag()));
        tag.put("inventory", inventory.serializeNBT(registries));
        tag.putInt("progress", progress);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inputCoolantTank.readFromNBT(registries, tag.getCompound("coolant_input"));
        outputCoolantTank.readFromNBT(registries, tag.getCompound("coolant_output"));
        inputResourceTank.readFromNBT(registries, tag.getCompound("resource_input"));
        outputResourceTank.readFromNBT(registries, tag.getCompound("resource_output"));
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
        progress = tag.getInt("progress");
    }
}
