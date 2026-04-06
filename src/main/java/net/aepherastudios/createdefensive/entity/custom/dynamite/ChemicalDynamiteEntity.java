package net.aepherastudios.createdefensive.entity.custom.dynamite;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.entity.custom.GasCloudEntity;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class ChemicalDynamiteEntity extends ThrowableItemProjectile {
    public ChemicalDynamiteEntity(EntityType<? extends ChemicalDynamiteEntity> entityType, Level level) {
        super(entityType, level);
    }

    public ChemicalDynamiteEntity(Level level, LivingEntity shooter) {
        super(DefensiveEntities.CHEMICAL_DYNAMITE.get(), shooter, level);
    }

    public ChemicalDynamiteEntity(Level level, double x, double y, double z) {
        super(DefensiveEntities.CHEMICAL_DYNAMITE.get(), x, y, z, level);
    }

    protected Item getDefaultItem() {
        return DefensiveItems.CHEMICAL_DYNAMITE.get();
    }

    private ParticleOptions getParticle() {
        ItemStack itemstack = this.getItem();
        return (ParticleOptions)(!itemstack.isEmpty() && !itemstack.is(this.getDefaultItem()) ? new ItemParticleOption(ParticleTypes.ITEM, itemstack) : ParticleTypes.SMOKE);
    }

    public void handleEntityEvent(byte id) {
        if (id == 3) {
            ParticleOptions particleoptions = this.getParticle();

            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }

    }

    protected void onHitEntity(EntityHitResult result) {
        super.onHitEntity(result);
        this.explode(level());
    }

    protected void onHit(HitResult result) {
        super.onHit(result);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte)3);
            this.explode(level());
            this.discard();
        }

    }

    protected void explode(Level level){
        if (level instanceof ServerLevel serverLevel) {
            level.playSound(null, this.getX(), this.getY(), this.getZ(), SoundEvents.TRIDENT_RIPTIDE_1.value(),
                    SoundSource.BLOCKS, 1.0f, 1.0f);
            GasCloudEntity cloud = new GasCloudEntity(DefensiveEntities.GAS_CLOUD.get(), serverLevel);
            cloud.setPos(this.getX(), this.getY(), this.getZ());
            cloud.setRadius(3.0f);
            cloud.setDuration(100);
            serverLevel.addFreshEntity(cloud);
        }
    }
}
