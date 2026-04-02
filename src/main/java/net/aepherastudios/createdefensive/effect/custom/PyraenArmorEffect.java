package net.aepherastudios.createdefensive.effect.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class PyraenArmorEffect extends MobEffect {
    public PyraenArmorEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public boolean applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.level().isClientSide()) {
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10, 2, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10, 2, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 10, 2, false, false, false));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, 2, false, false, false));
        }
        return super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}