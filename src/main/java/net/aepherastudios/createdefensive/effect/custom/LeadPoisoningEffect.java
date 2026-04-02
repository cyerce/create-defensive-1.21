package net.aepherastudios.createdefensive.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class LeadPoisoningEffect extends MobEffect {
    public LeadPoisoningEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level().isClientSide()) {
            pLivingEntity.hurt(pLivingEntity.damageSources().wither(), 0.5f);
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 10, 0, true, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 10, 0, true, false));
        }
        return super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
