package net.aepherastudios.createdefensive.block.custom.trap;

import com.mojang.serialization.MapCodec;
import net.aepherastudios.createdefensive.block.entity.trap.GasTrapBlockEntity;
import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.particle.DefensiveParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GasTrapBlock extends BaseEntityBlock {

    protected MapCodec CODEC = simpleCodec(GasTrapBlock::new);

    public GasTrapBlock(Properties properties) {
        super(properties);
    }

    public static final VoxelShape SHAPE = Block.box(0,0,0,16,16,16);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext){
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (level.hasNeighborSignal(pos)) {
            if (level.getBlockEntity(pos) instanceof GasTrapBlockEntity){
                shootGas(level, pos);
            }
        }
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if (!level.isClientSide && entity instanceof LivingEntity) {
            if (level.getBlockEntity(pos) instanceof GasTrapBlockEntity){
                shootGas(level, pos);
            }
        }
        super.stepOn(level, pos, state, entity);
    }

    private void shootGas(Level world, BlockPos pos) {
        for (int i = 1; i <= 2; i++) {
            BlockPos gasPos = pos.above(i);
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (world instanceof ServerLevel serverLevel && blockEntity instanceof GasTrapBlockEntity gasTrap) {
                if (gasTrap.canShoot(world)){
                    AABB gasZone = new AABB(
                            pos.getX(), pos.getY() + 1, pos.getZ(),
                            pos.getX() + 1, pos.getY() + 4, pos.getZ() + 1);

                    List<LivingEntity> targets = serverLevel.getEntitiesOfClass(LivingEntity.class, gasZone);

                    for (LivingEntity entity : targets) {
                        entity.hurt(entity.damageSources().fall(), 0.1F);
                        entity.addEffect(new MobEffectInstance(DefensiveEffects.MUSTARD_POISONING, 200, 1), entity);
                    }
                    serverLevel.sendParticles(DefensiveParticles.MUSTARD_GAS_PARTICLES.get(),
                            gasPos.getX() + 0.5,
                            gasPos.getY() + 0.5,
                            gasPos.getZ() + 0.5,
                            50,
                            0, 1, 0,
                            0.1
                    );

                    world.playSound(null, pos, SoundEvents.TRIDENT_RIPTIDE_1.value(),
                            SoundSource.BLOCKS, 1.0f, 1.0f);

                    if (serverLevel.getBlockEntity(pos) instanceof GasTrapBlockEntity){
                        gasTrap.gasTank.drain(100, IFluidHandler.FluidAction.EXECUTE);
                    }
                }
            }
        }
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new GasTrapBlockEntity(blockPos, blockState);
    }
}
