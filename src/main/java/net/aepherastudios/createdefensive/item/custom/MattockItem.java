package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.util.DefensiveTags;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

import java.util.Optional;

public class MattockItem extends DiggerItem {
    public MattockItem(Tier pTier, Properties pProperties) {
        super(pTier, DefensiveTags.Blocks.MINEABLE_WITH_MATTOCK, pProperties);
    }

    public static ItemAttributeModifiers createAttributes(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier) {
        return ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, (double)(pAttackDamageModifier + pTier.getAttackDamageBonus()), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, (double)pAttackSpeedModifier, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).build();
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();
        BlockState state = level.getBlockState(pos);

        // ---- Axe logic ----
        Optional<BlockState> axeResult = Optional.ofNullable(state.getToolModifiedState(context, ItemAbilities.AXE_STRIP, false));
        if (!axeResult.isPresent())
            axeResult = Optional.ofNullable(state.getToolModifiedState(context, ItemAbilities.AXE_SCRAPE, false));
        if (!axeResult.isPresent())
            axeResult = Optional.ofNullable(state.getToolModifiedState(context, ItemAbilities.AXE_WAX_OFF, false));

        if (axeResult.isPresent()) {
            BlockState newState = axeResult.get();
            // Play appropriate sound
            if (state.getToolModifiedState(context, ItemAbilities.AXE_STRIP, false) != null)
                level.playSound(player, pos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
            else if (state.getToolModifiedState(context, ItemAbilities.AXE_SCRAPE, false) != null) {
                level.playSound(player, pos, SoundEvents.AXE_SCRAPE, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(player, 3005, pos, 0);
            } else {
                level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(player, 3004, pos, 0);
            }

            if (player instanceof ServerPlayer sp) {
                CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(sp, pos, stack);
            }

            level.setBlock(pos, newState, 11);
            level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, newState));

            if (player != null){
                EquipmentSlot slot = context.getHand() == InteractionHand.MAIN_HAND
                        ? EquipmentSlot.MAINHAND
                        : EquipmentSlot.OFFHAND;

                stack.hurtAndBreak(1, player, slot);
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        // ---- Hoe logic ----
        BlockState hoeResult = state.getToolModifiedState(context, ItemAbilities.HOE_TILL, false);
        if (hoeResult != null) {
            if (context.getClickedFace() != Direction.DOWN && level.getBlockState(pos.above()).isAir()) { // air check
                level.playSound(player, pos, SoundEvents.HOE_TILL, SoundSource.BLOCKS, 1.0F, 1.0F);

                if (!level.isClientSide) {
                    level.setBlock(pos, hoeResult, 11);
                    level.gameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Context.of(player, hoeResult));

                    if (player != null){
                        EquipmentSlot slot = context.getHand() == InteractionHand.MAIN_HAND
                                ? EquipmentSlot.MAINHAND
                                : EquipmentSlot.OFFHAND;

                        stack.hurtAndBreak(1, player, slot);
                    }
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }

        return InteractionResult.PASS;
    }

    @Override
    public boolean canPerformAction(ItemStack stack, ItemAbility toolAction) {
        return ItemAbilities.DEFAULT_AXE_ACTIONS.contains(toolAction)
                || ItemAbilities.DEFAULT_HOE_ACTIONS.contains(toolAction);
    }
}
