package net.aepherastudios.createdefensive.block.custom.explosive;

import net.aepherastudios.createdefensive.entity.custom.PrimedChemicalExplosive;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ChemicalExplosiveBlock extends Block {

    public ChemicalExplosiveBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemInteractionResult useItemOn(
            ItemStack stack,
            BlockState state,
            Level level,
            BlockPos pos,
            Player player,
            InteractionHand hand,
            BlockHitResult hitResult
    ) {
        if (stack.is(Items.FLINT_AND_STEEL) || stack.is(Items.FIRE_CHARGE)) {
            prime(level, pos, player);
            stack.hurtAndBreak(1, player, LivingEntity.getSlotForHand(hand));
            return ItemInteractionResult.sidedSuccess(level.isClientSide);
        }
        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    @Override
    public void wasExploded(Level level, BlockPos pos, net.minecraft.world.level.Explosion explosion) {
        if (!level.isClientSide) {
            PrimedChemicalExplosive primed = createPrimed(level, pos, null);
            primed.setFuse((int)(primed.getFuse() / 4 + level.random.nextInt(primed.getFuse() / 4)));
            level.addFreshEntity(primed);
        }
    }

    @Override
    protected void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
        if (!level.isClientSide && projectile.isOnFire()) {
            prime(level, hit.getBlockPos(), projectile.getOwner() instanceof LivingEntity le ? le : null);
        }
    }

    private void prime(Level level, BlockPos pos, LivingEntity igniter) {
        if (!level.isClientSide) {
            level.removeBlock(pos, false);
            level.addFreshEntity(createPrimed(level, pos, igniter));
            level.playSound(null, pos, SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0f, 1.0f);
        }
    }

    private PrimedChemicalExplosive createPrimed(Level level, BlockPos pos, LivingEntity igniter) {
        PrimedChemicalExplosive entity = new PrimedChemicalExplosive(
                DefensiveEntities.PRIMED_CHEMICAL_EXPLOSIVE.get(), level
        );
        entity.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
        entity.setOwner(igniter);
        return entity;
    }
}
