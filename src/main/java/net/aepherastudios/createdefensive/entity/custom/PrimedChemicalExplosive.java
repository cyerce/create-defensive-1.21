package net.aepherastudios.createdefensive.entity.custom;

import net.aepherastudios.createdefensive.block.DefensiveBlocks;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class PrimedChemicalExplosive extends Entity {

    public static final int DEFAULT_FUSE = 80;

    private static final EntityDataAccessor<Integer> DATA_FUSE =
            SynchedEntityData.defineId(PrimedChemicalExplosive.class, EntityDataSerializers.INT);

    @Nullable
    private LivingEntity owner;

    public PrimedChemicalExplosive(EntityType<?> type, Level level) {
        super(type, level);
        this.blocksBuilding = true;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        builder.define(DATA_FUSE, DEFAULT_FUSE);
    }

    public int getFuse() {
        return entityData.get(DATA_FUSE);
    }

    public void setFuse(int fuse) {
        entityData.set(DATA_FUSE, fuse);
    }

    public void setOwner(@Nullable LivingEntity owner) {
        this.owner = owner;
    }

    @Nullable
    public LivingEntity getOwner() {
        return owner;
    }

    @Override
    protected double getDefaultGravity() {
        return 0.04;
    }

    @Override
    public void tick() {
        this.applyGravity();
        this.move(net.minecraft.world.entity.MoverType.SELF, this.getDeltaMovement());
        this.setDeltaMovement(this.getDeltaMovement().scale(0.98));

        if (this.onGround()) {
            this.setDeltaMovement(
                    this.getDeltaMovement().multiply(0.7, -0.5, 0.7)
            );
        }

        int fuse = getFuse() - 1;
        setFuse(fuse);

        if (fuse <= 0) {
            this.discard();
            if (!this.level().isClientSide) {
                explode();
            }
        } else {
            this.updateInWaterStateAndDoFluidPushing();

            if (this.level().isClientSide) {
                this.level().addParticle(
                        net.minecraft.core.particles.ParticleTypes.SMOKE,
                        this.getX(), this.getY() + 0.5, this.getZ(),
                        0.0, 0.0, 0.0
                );
            }
        }
    }

    private void explode() {
        this.playSound(SoundEvents.DRAGON_FIREBALL_EXPLODE, 4.0f, (1.0f + (this.level().random.nextFloat() - this.level().random.nextFloat()) * 0.2f) * 0.7f);

        if (this.level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
            GasCloudEntity cloud = new GasCloudEntity(
                    DefensiveEntities.GAS_CLOUD.get(), serverLevel
            );
            cloud.setPos(this.getX(), this.getY(), this.getZ());
            cloud.setRadius(4.0f);
            cloud.setDuration(600);
            serverLevel.addFreshEntity(cloud);
        }
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        setFuse(tag.getInt("Fuse"));
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        tag.putInt("Fuse", getFuse());
    }

    @Override
    public boolean isPickable() {
        return false;
    }

    public BlockState getBlockState() {
        return DefensiveBlocks.CHEMICAL_EXPLOSIVE.get().defaultBlockState();
    }
}
