package net.aepherastudios.createdefensive.damage;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;

public class DefensiveDamageTypes {
    public static final ResourceKey<DamageType> MUSTARD_POISONING =
            ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "mustard_poisoning"));
    public static final ResourceKey<DamageType> BLEEDING =
            ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "bleeding"));
    public static final ResourceKey<DamageType> LEAD_POISONING =
            ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "lead_poisoning"));
    public static final ResourceKey<DamageType> RADIATION_POISONING =
            ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "radiation_poisoning"));

}
