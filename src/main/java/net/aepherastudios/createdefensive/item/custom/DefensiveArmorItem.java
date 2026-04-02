package net.aepherastudios.createdefensive.item.custom;

import com.google.common.collect.ImmutableMap;
import net.aepherastudios.createdefensive.effect.DefensiveEffects;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Map;

public class DefensiveArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<MobEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<ArmorMaterial, List<MobEffectInstance>>()
                    .put(DefensiveArmorMaterials.SILVER.value(), List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, 600, 0, false, false, true)))
                    .put(DefensiveArmorMaterials.PLATINUM.value(), List.of(
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0, false, false, true)))
                    .put(DefensiveArmorMaterials.ELECTRUM.value(), List.of(
                            new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0, false, false, true)))
                    .put(DefensiveArmorMaterials.STARDUST.value(), List.of(
                            new MobEffectInstance(MobEffects.REGENERATION, 600, 1, false, false, true)))
                    .put(DefensiveArmorMaterials.PYRAEN.value(), List.of(
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 2, false, false, true)))
                    .put(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL.value(), List.of(
                            new MobEffectInstance(MobEffects.DIG_SPEED, 600, 1, false, false, true)))
                    .put(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL.value(), List.of(
                            new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, false, true)))
                    .put(DefensiveArmorMaterials.GOLD_CEREMONIAL.value(), List.of(
                            new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 600, 0, false, false, true)))
                    .put(DefensiveArmorMaterials.STEEL.value(), List.of(
                            new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1, false, false, true)))
                    .put(DefensiveArmorMaterials.ALUMINUM_POWER.value(), List.of(
                            new MobEffectInstance(DefensiveEffects.ALUMINUM_POWER, 600, 0, false, false, true)))
                    .put(DefensiveArmorMaterials.STEEL_POWER.value(), List.of(
                            new MobEffectInstance(DefensiveEffects.STEEL_POWER, 600, 0, false, false, true)))
                    .put(DefensiveArmorMaterials.NETHERITE_POWER.value(), List.of(
                            new MobEffectInstance(DefensiveEffects.NETHERITE_POWER, 600, 0, false, false, true)))
                    .build();

    public DefensiveArmorItem(Holder<ArmorMaterial> material, Type type, Properties properties) {
        super(material, type, properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slotId, boolean isSelected) {
        if(entity instanceof Player player && !level.isClientSide() && hasFullSuitOfArmorOn(player)) {
            evaluateArmorEffects(player);
        }
    }

    private void evaluateArmorEffects(Player player) {
        for (Map.Entry<ArmorMaterial, List<MobEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            ArmorMaterial mapArmorMaterial = entry.getKey();
            List<MobEffectInstance> mapEffect = entry.getValue();

            if (hasPlayerCorrectArmorOn(mapArmorMaterial, player)) {
                addEffectToPlayer(player, mapEffect);
            }
        }
    }

    private void addEffectToPlayer(Player player, List<MobEffectInstance> mapEffect) {
        boolean hasPlayerEffect = mapEffect.stream().allMatch(effect -> player.hasEffect(effect.getEffect()));

        if(!hasPlayerEffect) {
            for (MobEffectInstance effect : mapEffect) {
                player.addEffect(new MobEffectInstance(effect.getEffect(),
                        effect.getDuration(), effect.getAmplifier(), effect.isAmbient(), effect.isVisible()));
            }
        }
    }

    private boolean hasPlayerCorrectArmorOn(ArmorMaterial mapArmorMaterial, Player player) {
        for (ItemStack armorStack : player.getArmorSlots()) {
            if (!(armorStack.getItem() instanceof ArmorItem)) return false;
        }

        ArmorItem boots = (ArmorItem) player.getInventory().getArmor(0).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmor(1).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmor(2).getItem();
        ArmorItem helmet = (ArmorItem) player.getInventory().getArmor(3).getItem();

        return boots.getMaterial().value() == mapArmorMaterial &&
                leggings.getMaterial().value() == mapArmorMaterial &&
                chestplate.getMaterial().value() == mapArmorMaterial &&
                helmet.getMaterial().value() == mapArmorMaterial;
    }

    private boolean hasFullSuitOfArmorOn(Player player) {
        ItemStack boots = player.getInventory().getArmor(0);
        ItemStack leggings = player.getInventory().getArmor(1);
        ItemStack chestplate = player.getInventory().getArmor(2);
        ItemStack helmet = player.getInventory().getArmor(3);

        return !boots.isEmpty() && !leggings.isEmpty() && !chestplate.isEmpty() && !helmet.isEmpty();
    }
}