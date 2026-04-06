package net.aepherastudios.createdefensive.entity.custom;


import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.particle.DefensiveParticles;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TraceableEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class GasCloudEntity extends Entity {

    private static final EntityDataAccessor<Float> DATA_RADIUS =
            SynchedEntityData.defineId(GasCloudEntity.class, EntityDataSerializers.FLOAT);

    private static final EntityDataAccessor<Integer> DATA_DURATION =
            SynchedEntityData.defineId(GasCloudEntity.class, EntityDataSerializers.INT);

    private static final int EFFECT_INTERVAL = 20;

    private boolean particlesBurst = false;

    private int effectTickCount = 0;

    public GasCloudEntity(EntityType<?> type, Level level) {
        super(type, level);
        this.noPhysics = true;
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        builder.define(DATA_RADIUS, 3.0f);
        builder.define(DATA_DURATION, 200);
    }

    public void setRadius(float radius) {
        entityData.set(DATA_RADIUS, Math.max(0.1f, radius));
    }

    public float getRadius() {
        return entityData.get(DATA_RADIUS);
    }

    public void setDuration(int ticks) {
        entityData.set(DATA_DURATION, Math.max(1, ticks));
    }

    public int getDuration() {
        return entityData.get(DATA_DURATION);
    }

    @Override
    public void tick() {
        super.tick();

        if (level().isClientSide) return;

        if (!particlesBurst) {
            spawnInitialParticles();
            particlesBurst = true;
        }

        int remaining = getDuration() - 1;
        setDuration(remaining);
        if (remaining <= 0) {
            discard();
            return;
        }

        effectTickCount++;
        if (effectTickCount >= EFFECT_INTERVAL) {
            effectTickCount = 0;
            applyEffectToPlayers();
        }
    }

    private void spawnInitialParticles() {
        if (!(level() instanceof ServerLevel serverLevel)) return;

        float radius = getRadius();
        int count = Math.max(20, Math.min((int)(Math.PI * radius * radius * 4), 200));

        serverLevel.sendParticles(
                DefensiveParticles.MUSTARD_GAS_PARTICLES.get(),
                getX(), getY(), getZ(),
                count,
                radius,
                0.25,
                radius,
                0.05
        );
    }

    private void applyEffectToPlayers() {
        float radius = getRadius();
        double r2 = radius * radius;

        AABB searchBox = new AABB(
                getX() - radius, getY() - radius, getZ() - radius,
                getX() + radius, getY() + radius, getZ() + radius
        );

        List<LivingEntity> entities = level().getEntitiesOfClass(LivingEntity.class, searchBox);

        for (LivingEntity entity : entities) {
            double dx = entity.getX() - getX();
            double dz = entity.getZ() - getZ();
            if (dx * dx + dz * dz <= r2) {
                entity.addEffect(new MobEffectInstance(
                        DefensiveEffects.MUSTARD_POISONING,
                        600,
                        0,
                        false,
                        true,
                        true
                ));
            }
        }
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag tag) {
        setRadius(tag.getFloat("Radius"));
        setDuration(tag.getInt("Duration"));
        particlesBurst = tag.getBoolean("ParticlesBurst");
    }

    @Override
    protected void addAdditionalSaveData(CompoundTag tag) {
        tag.putFloat("Radius", getRadius());
        tag.putInt("Duration", getDuration());
        tag.putBoolean("ParticlesBurst", particlesBurst);
    }

    @Override
    public boolean shouldShowName() {
        return false;
    }

    @Override
    public boolean isInvisible() {
        return true;
    }

    @Override
    public boolean isPickable() {
        return false;
    }
}
