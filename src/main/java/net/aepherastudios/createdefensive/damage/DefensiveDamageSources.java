package net.aepherastudios.createdefensive.damage;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;

public class DefensiveDamageSources {

    public static DamageSource mustardPoisoning(ServerLevel level) {
        return level.damageSources().source(DefensiveDamageTypes.MUSTARD_POISONING);
    }

    public static DamageSource bleeding(ServerLevel level) {
        return level.damageSources().source(DefensiveDamageTypes.BLEEDING);
    }

    public static DamageSource leadPoisoning(ServerLevel level) {
        return level.damageSources().source(DefensiveDamageTypes.LEAD_POISONING);
    }

    public static DamageSource radiationPoisoning(ServerLevel level) {
        return level.damageSources().source(DefensiveDamageTypes.RADIATION_POISONING);
    }
}
