package net.aepherastudios.createdefensive.entity.custom;


import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.aepherastudios.createdefensive.particle.DefensiveParticles;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class RadiationCloudEntity extends Entity {

    private static final EntityDataAccessor<Float> DATA_RADIUS =
            SynchedEntityData.defineId(RadiationCloudEntity.class, EntityDataSerializers.FLOAT);

    private static final EntityDataAccessor<Integer> DATA_DURATION =
            SynchedEntityData.defineId(RadiationCloudEntity.class, EntityDataSerializers.INT);

    private static final int EFFECT_INTERVAL = 20;

    private boolean particlesBurst = false;

    private int effectTickCount = 0;

    public RadiationCloudEntity(EntityType<?> type, Level level) {
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
        float radius = getRadius();
        int count = (int) (Math.PI * radius * radius * 4);
        count = Math.max(20, Math.min(count, 200));

        for (int i = 0; i < count; i++) {
            double angle = level().random.nextDouble() * 2 * Math.PI;
            double r     = level().random.nextDouble() * radius;
            double px    = getX() + r * Math.cos(angle);
            double py    = getY() + level().random.nextDouble() * 0.5;
            double pz    = getZ() + r * Math.sin(angle);

            double vx = (px - getX()) * 0.05;
            double vy = 0.05 + level().random.nextDouble() * 0.05;
            double vz = (pz - getZ()) * 0.05;

            if (level() instanceof net.minecraft.server.level.ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        DefensiveParticles.RADIOACTIVE_CLOUD_PARTICLES.get(),
                        px, py, pz,
                        1,
                        vx, vy, vz,
                        0.01
                );
            }
        }
    }

    private void applyEffectToPlayers() {
        float radius = getRadius();
        double r2 = radius * radius;

        AABB searchBox = new AABB(
                getX() - radius, getY() - radius, getZ() - radius,
                getX() + radius, getY() + radius, getZ() + radius
        );

        List<LivingEntity> livingEntities = level().getEntitiesOfClass(LivingEntity.class, searchBox);

        for (LivingEntity livingEntity : livingEntities) {
            double dx = livingEntity.getX() - getX();
            double dz = livingEntity.getZ() - getZ();
            if (dx * dx + dz * dz <= r2) {
                livingEntity.addEffect(new MobEffectInstance(
                        DefensiveEffects.RADIATION_POISONING,
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
