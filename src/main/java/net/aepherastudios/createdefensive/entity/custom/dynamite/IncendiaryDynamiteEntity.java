package net.aepherastudios.createdefensive.entity.custom.dynamite;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class IncendiaryDynamiteEntity extends ThrowableItemProjectile {
    public IncendiaryDynamiteEntity(EntityType<? extends IncendiaryDynamiteEntity> entityType, Level level) {
        super(entityType, level);
    }

    public IncendiaryDynamiteEntity(Level level, LivingEntity shooter) {
        super(DefensiveEntities.INCENDIARY_DYNAMITE.get(), shooter, level);
    }

    public IncendiaryDynamiteEntity(Level level, double x, double y, double z) {
        super(DefensiveEntities.INCENDIARY_DYNAMITE.get(), x, y, z, level);
    }

    protected Item getDefaultItem() {
        return DefensiveItems.INCENDIARY_DYNAMITE.get();
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
        level.explode(this, this.getX(), this.getY(), this.getZ(), 2, true, Level.ExplosionInteraction.TNT);
    }
}
