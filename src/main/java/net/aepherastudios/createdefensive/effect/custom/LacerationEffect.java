package net.aepherastudios.createdefensive.effect.custom;

import net.aepherastudios.createdefensive.damage.DefensiveDamageSources;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class LacerationEffect extends MobEffect {
    public LacerationEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (pLivingEntity.level() instanceof ServerLevel serverLevel) {
            float damage = 1f * (pAmplifier + 1);
            pLivingEntity.hurt(DefensiveDamageSources.bleeding(serverLevel), damage);
        }
        return super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration % 20 == 0;
    }
}