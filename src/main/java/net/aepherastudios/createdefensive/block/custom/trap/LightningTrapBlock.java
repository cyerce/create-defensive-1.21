package net.aepherastudios.createdefensive.block.custom.trap;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class LightningTrapBlock extends Block {


    public LightningTrapBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (world.hasNeighborSignal(pos)) {
            shootLightning(world, pos);
        }
    }

    @Override
    public void stepOn(Level world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClientSide && entity instanceof LivingEntity) {
            shootLightning(world, pos);

        }
        super.stepOn(world, pos, state, entity);
    }

    private void shootLightning(Level world, BlockPos pos) {
        for (int i = 1; i <= 2; i++) {
            BlockPos lightningPos = pos.above(i);
            if (world instanceof ServerLevel serverWorld) {
                AABB lightningZone = new AABB(
                        pos.getX(), pos.getY() + 1, pos.getZ(),
                        pos.getX() + 1, pos.getY() + 4, pos.getZ() + 1);

                List<LivingEntity> targets = serverWorld.getEntitiesOfClass(LivingEntity.class, lightningZone);

                for (LivingEntity entity : targets) {
                    entity.hurt(entity.damageSources().lightningBolt(), 8.0F);
                    entity.setDeltaMovement(entity.getDeltaMovement().add(0, 0.45, 0));
                    entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 1, true, false));
                    entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 120, 1, true, false));
                    entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 120, 1, true, false));
                }
                serverWorld.sendParticles(ParticleTypes.FIREWORK,
                        lightningPos.getX() + 0.5,
                        lightningPos.getY() + 0.5,
                        lightningPos.getZ() + 0.5,
                        100,
                        0, 2, 0,
                        0.5
                );

                serverWorld.sendParticles(ParticleTypes.ELECTRIC_SPARK,
                        lightningPos.getX() + 0.5,
                        lightningPos.getY() + 0.5,
                        lightningPos.getZ() + 0.5,
                        100,
                        0, 2, 0,
                        0.1
                );
                serverWorld.sendParticles(ParticleTypes.FLASH,
                        lightningPos.getX() + 0.5,
                        lightningPos.getY() + 0.5,
                        lightningPos.getZ() + 0.5,
                        1,
                        0, 0, 0,
                        1
                );

                world.playSound(null, pos, SoundEvents.FIREWORK_ROCKET_TWINKLE,
                        SoundSource.BLOCKS, 1.0f, 1.0f);
                world.playSound(null, pos, SoundEvents.FIREWORK_ROCKET_LARGE_BLAST,
                        SoundSource.BLOCKS, 1.0f, 1.0f);
                world.playSound(null, pos, SoundEvents.LIGHTNING_BOLT_IMPACT,
                        SoundSource.BLOCKS, 1.0f, 1.0f);
            }
        }
    }
}
