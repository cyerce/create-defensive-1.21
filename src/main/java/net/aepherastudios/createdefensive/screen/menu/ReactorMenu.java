package net.aepherastudios.createdefensive.screen.menu;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.block.entity.machine.ReactorBlockEntity;
import net.aepherastudios.createdefensive.screen.DefensiveMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.SlotItemHandler;
import org.jetbrains.annotations.Nullable;

public class ReactorMenu extends AbstractContainerMenu {
    public final ReactorBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = 13;

    public ReactorMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()),
                new SimpleContainerData(2));
    }

    public ReactorMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(DefensiveMenuTypes.REACTOR_MENU.get(), pContainerId);
        checkContainerSize(inv, 13);
        blockEntity = ((ReactorBlockEntity) entity);
        this.level = inv.player.level();
        this.data = data;

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        // Fuel rod slots (0-4)
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.FUEL_SLOT_1, 44, 17));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.FUEL_SLOT_2, 62, 17));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.FUEL_SLOT_3, 80, 17));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.FUEL_SLOT_4, 98, 17));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.FUEL_SLOT_5, 116, 17));

        // Control rod slots (5-9)
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.CONTROL_SLOT_1, 44, 53));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.CONTROL_SLOT_2, 62, 53));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.CONTROL_SLOT_3, 80, 53));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.CONTROL_SLOT_4, 98, 53));
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.CONTROL_SLOT_5, 116, 53));

        // Neutron activator slot (10)
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.NEUTRON_SLOT, 80, 35));

        // Item input slot (11)
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.INPUT_SLOT, 44, 35));

        // Item output slot (12)
        this.addSlot(new SlotItemHandler(blockEntity.inventory, ReactorBlockEntity.OUTPUT_SLOT, 116, 35));

        addDataSlots(data);
    }

    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // Player inventory -> try input slot only
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX + 11,
                    TE_INVENTORY_FIRST_SLOT_INDEX + 12, false)) {
                return ItemStack.EMPTY;
            }
        } else if (pIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // TE slot -> player inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX,
                    VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            return ItemStack.EMPTY;
        }

        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                pPlayer, DefensiveBlocks.REACTOR.get());
    }

    public int getScaledProgress() {
        int progress = this.data.get(0);
        int maxProgress = this.data.get(1);
        int progressBarWidth = 161;
        return maxProgress != 0 && progress != 0 ? progress * progressBarWidth / maxProgress : 0;
    }

    public boolean isCrafting() {
        return data.get(0) > 0;
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}