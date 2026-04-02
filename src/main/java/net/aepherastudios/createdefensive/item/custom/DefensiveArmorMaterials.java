package net.aepherastudios.createdefensive.item.custom;

import com.simibubi.create.AllItems;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class DefensiveArmorMaterials {

    public static final Holder<ArmorMaterial> ALUMINUM = register("aluminum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> COPPER = register("copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> SILVER = register("silver",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> ZINC = register("zinc",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> BRASS = register("brass",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 2f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> ROSEQUARTZ = register("rosequartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.POLISHED_ROSE_QUARTZ.get());

    public static final Holder<ArmorMaterial> PLATINUM = register("platinum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> ELECTRUM = register("electrum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> STARDUST = register("stardust",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> PYRAEN = register("pyraen",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 10);
                attribute.put(ArmorItem.Type.LEGGINGS, 15);
                attribute.put(ArmorItem.Type.CHESTPLATE, 18);
                attribute.put(ArmorItem.Type.HELMET, 8);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> STEEL = register("steel",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 10);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> ALUMINUM_POWER = register("aluminum_power",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 5, 1f, 1f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> STEEL_POWER = register("steel_power",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 5, 1f, 1f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> NETHERITE_POWER = register("netherite_power",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 10);
                attribute.put(ArmorItem.Type.LEGGINGS, 15);
                attribute.put(ArmorItem.Type.CHESTPLATE, 17);
                attribute.put(ArmorItem.Type.HELMET, 8);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 5, 1f, 1f, () -> Items.NETHERITE_INGOT);





    public static final Holder<ArmorMaterial> GOLD_CEREMONIAL = register("gold_ceremonial",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> ROSE_GOLD_CEREMONIAL = register("rose_gold_ceremonial",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> VIOLET_GOLD_CEREMONIAL = register("violet_gold_ceremonial",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());





    public static final Holder<ArmorMaterial> REGAL_ALUMINUM = register("regal_aluminum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER = register("regal_copper",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER = register("regal_silver",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC = register("aluminum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS = register("regal_brass",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM = register("regal_platinum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM = register("regal_electrum",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST = register("regal_stardust",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN = register("regal_pyraen",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL = register("regal_steel",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD = register("regal_rose_gold",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD = register("regal_violet_gold",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD = register("regal_wood",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE = register("regal_stone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON = register("regal_iron",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD = register("regal_gold",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE = register("regal_netherite",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);



    public static final Holder<ArmorMaterial> REGAL_ALUMINUM_EMERALD = register("regal_aluminum_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER_EMERALD = register("regal_copper_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER_EMERALD = register("regal_silver_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC_EMERALD = register("aluminum_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS_EMERALD = register("regal_brass_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM_EMERALD = register("regal_platinum_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM_EMERALD = register("regal_electrum_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST_EMERALD = register("regal_stardust_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN_EMERALD = register("regal_pyraen_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL_EMERALD = register("regal_steel_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD_EMERALD = register("regal_rose_gold_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD_EMERALD = register("regal_violet_gold_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD_EMERALD = register("regal_wood_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE_EMERALD = register("regal_stone_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON_EMERALD = register("regal_iron_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD_EMERALD = register("regal_gold_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE_EMERALD = register("regal_netherite_emerald",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);



    public static final Holder<ArmorMaterial> REGAL_ALUMINUM_LAPIS = register("regal_aluminum_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER_LAPIS = register("regal_copper_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER_LAPIS = register("regal_silver_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC_LAPIS = register("aluminum_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS_LAPIS = register("regal_brass_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM_LAPIS = register("regal_platinum_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM_LAPIS = register("regal_electrum_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST_LAPIS = register("regal_stardust_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN_LAPIS = register("regal_pyraen_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL_LAPIS = register("regal_steel_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD_LAPIS = register("regal_rose_gold_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD_LAPIS = register("regal_violet_gold_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD_LAPIS = register("regal_wood_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE_LAPIS = register("regal_stone_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON_LAPIS = register("regal_iron_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD_LAPIS = register("regal_gold_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE_LAPIS = register("regal_netherite_lapis",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);



    public static final Holder<ArmorMaterial> REGAL_ALUMINUM_DIAMOND = register("regal_aluminum_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER_DIAMOND = register("regal_copper_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER_DIAMOND = register("regal_silver_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC_DIAMOND = register("aluminum_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS_DIAMOND = register("regal_brass_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM_DIAMOND = register("regal_platinum_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM_DIAMOND = register("regal_electrum_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST_DIAMOND = register("regal_stardust_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN_DIAMOND = register("regal_pyraen_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL_DIAMOND = register("regal_steel_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD_DIAMOND = register("regal_rose_gold_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD_DIAMOND = register("regal_violet_gold_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD_DIAMOND = register("regal_wood_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE_DIAMOND = register("regal_stone_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON_DIAMOND = register("regal_iron_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD_DIAMOND = register("regal_gold_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE_DIAMOND = register("regal_netherite_diamond",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);



    public static final Holder<ArmorMaterial> REGAL_ALUMINUM_QUARTZ = register("regal_aluminum_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER_QUARTZ = register("regal_copper_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER_QUARTZ = register("regal_silver_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC_QUARTZ = register("aluminum_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS_QUARTZ = register("regal_brass_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM_QUARTZ = register("regal_platinum_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM_QUARTZ = register("regal_electrum_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST_QUARTZ = register("regal_stardust_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN_QUARTZ = register("regal_pyraen_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL_QUARTZ = register("regal_steel_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD_QUARTZ = register("regal_rose_gold_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD_QUARTZ = register("regal_violet_gold_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD_QUARTZ = register("regal_wood_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE_QUARTZ = register("regal_stone_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON_QUARTZ = register("regal_iron_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD_QUARTZ = register("regal_gold_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE_QUARTZ = register("regal_netherite_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);



    public static final Holder<ArmorMaterial> REGAL_ALUMINUM_REDSTONE = register("regal_aluminum_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER_REDSTONE = register("regal_copper_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER_REDSTONE = register("regal_silver_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC_REDSTONE = register("aluminum_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS_REDSTONE = register("regal_brass_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM_REDSTONE = register("regal_platinum_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM_REDSTONE = register("regal_electrum_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST_REDSTONE = register("regal_stardust_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN_REDSTONE = register("regal_pyraen_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL_REDSTONE = register("regal_steel_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD_REDSTONE = register("regal_rose_gold_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD_REDSTONE = register("regal_violet_gold_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD_REDSTONE = register("regal_wood_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE_REDSTONE = register("regal_stone_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON_REDSTONE = register("regal_iron_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD_REDSTONE = register("regal_gold_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE_REDSTONE = register("regal_netherite_redstone",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);



    public static final Holder<ArmorMaterial> REGAL_ALUMINUM_ROSE_QUARTZ = register("regal_aluminum_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER_ROSE_QUARTZ = register("regal_copper_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER_ROSE_QUARTZ = register("regal_silver_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC_ROSE_QUARTZ = register("aluminum_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS_ROSE_QUARTZ = register("regal_brass_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM_ROSE_QUARTZ = register("regal_platinum_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM_ROSE_QUARTZ = register("regal_electrum_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST_ROSE_QUARTZ = register("regal_stardust_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN_ROSE_QUARTZ = register("regal_pyraen_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL_ROSE_QUARTZ = register("regal_steel_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD_ROSE_QUARTZ = register("regal_rose_gold_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD_ROSE_QUARTZ = register("regal_violet_gold_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD_ROSE_QUARTZ = register("regal_wood_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE_ROSE_QUARTZ = register("regal_stone_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON_ROSE_QUARTZ = register("regal_iron_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD_ROSE_QUARTZ = register("regal_gold_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE_ROSE_QUARTZ = register("regal_netherite_rose_quartz",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);



    public static final Holder<ArmorMaterial> REGAL_ALUMINUM_AMETHYST = register("regal_aluminum_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ALUMINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_COPPER_AMETHYST = register("regal_copper_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> REGAL_SILVER_AMETHYST = register("regal_silver_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.SILVER_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ZINC_AMETHYST = register("aluminum_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.ZINC_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_BRASS_AMETHYST = register("regal_brass_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 7);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> AllItems.BRASS_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PLATINUM_AMETHYST = register("regal_platinum_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.PLATINUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ELECTRUM_AMETHYST = register("regal_electrum_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 7);
                attribute.put(ArmorItem.Type.LEGGINGS, 10);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 5);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 5f, 0.3f, () -> DefensiveItems.ENERGIZED_ELECTRUM_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STARDUST_AMETHYST = register("regal_stardust_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 12);
                attribute.put(ArmorItem.Type.CHESTPLATE, 14);
                attribute.put(ArmorItem.Type.HELMET, 6);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 7f, 0.5f, () -> DefensiveItems.STARDUST_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_PYRAEN_AMETHYST = register("regal_pyraen_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 8);
                attribute.put(ArmorItem.Type.LEGGINGS, 18);
                attribute.put(ArmorItem.Type.CHESTPLATE, 15);
                attribute.put(ArmorItem.Type.HELMET, 10);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 8f, 0.6f, () -> DefensiveItems.PYRAEN_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_STEEL_AMETHYST = register("regal_steel_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 5);
                attribute.put(ArmorItem.Type.LEGGINGS, 8);
                attribute.put(ArmorItem.Type.CHESTPLATE, 12);
                attribute.put(ArmorItem.Type.HELMET, 4);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.STEEL_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_ROSE_GOLD_AMETHYST = register("regal_rose_gold_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.ROSE_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_VIOLET_GOLD_AMETHYST = register("regal_violet_gold_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> DefensiveItems.VIOLET_GOLD_INGOT.get());

    public static final Holder<ArmorMaterial> REGAL_WOOD_AMETHYST = register("regal_wood_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 2);
                attribute.put(ArmorItem.Type.CHESTPLATE, 3);
                attribute.put(ArmorItem.Type.HELMET, 1);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.STICK);

    public static final Holder<ArmorMaterial> REGAL_STONE_AMETHYST = register("regal_stone_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 4);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.COBBLESTONE);

    public static final Holder<ArmorMaterial> REGAL_IRON_AMETHYST = register("regal_iron_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 2);
                attribute.put(ArmorItem.Type.LEGGINGS, 5);
                attribute.put(ArmorItem.Type.CHESTPLATE, 6);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.IRON_INGOT);

    public static final Holder<ArmorMaterial> REGAL_GOLD_AMETHYST = register("regal_gold_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 1);
                attribute.put(ArmorItem.Type.LEGGINGS, 3);
                attribute.put(ArmorItem.Type.CHESTPLATE, 5);
                attribute.put(ArmorItem.Type.HELMET, 2);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.GOLD_INGOT);

    public static final Holder<ArmorMaterial> REGAL_NETHERITE_AMETHYST = register("regal_netherite_amethyst",
            Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
                attribute.put(ArmorItem.Type.BOOTS, 3);
                attribute.put(ArmorItem.Type.LEGGINGS, 6);
                attribute.put(ArmorItem.Type.CHESTPLATE, 8);
                attribute.put(ArmorItem.Type.HELMET, 3);
                attribute.put(ArmorItem.Type.BODY, 9);
            }), 25, 0f, 0f, () -> Items.NETHERITE_INGOT);





    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, name);
        Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_NETHERITE;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }

}
