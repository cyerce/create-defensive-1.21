package net.aepherastudios.createdefensive.item;

import com.simibubi.create.content.equipment.sandPaper.SandPaperItem;
import com.simibubi.create.content.materials.ExperienceNuggetItem;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.fluid.DefensiveFluids;
import net.aepherastudios.createdefensive.item.custom.*;
import net.aepherastudios.createdefensive.item.custom.SpearItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DefensiveItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateDefensive.MOD_ID);

    public static final DeferredItem<Item> INCOMPLETE_SPOOL = ITEMS.register("incomplete_spool", () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SPOOL = ITEMS.register("spool", () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> COPPER_WIRE = ITEMS.register("copper_wire", () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> ZINC_WIRE = ITEMS.register("zinc_wire", () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SILVER_WIRE = ITEMS.register("silver_wire", () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> GOLD_WIRE = ITEMS.register("gold_wire", () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_WIRE = ITEMS.register("electrum_wire", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_SHEET = ITEMS.register("aluminum_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_SHEET = ITEMS.register("silver_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD_INGOT = ITEMS.register("rose_gold_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VIOLET_GOLD_INGOT = ITEMS.register("violet_gold_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_SHEET = ITEMS.register("electrum_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENERGIZED_ELECTRUM_INGOT = ITEMS.register("energized_electrum_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SHEET = ITEMS.register("steel_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_SHEET = ITEMS.register("bronze_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANDESITE_SHEET = ITEMS.register("andesite_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUNSTEEL_INGOT = ITEMS.register("gunsteel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_INGOT = ITEMS.register("invar_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STABALLOY_INGOT = ITEMS.register("staballoy_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_QUARTZ_PANE = ITEMS.register("rose_quartz_pane", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARDUST_INGOT = ITEMS.register("stardust_ingot", () -> new FloatingItem(new Item.Properties()));
    public static final DeferredItem<Item> PYRAEN_INGOT = ITEMS.register("pyraen_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BASIC_CIRCUIT = ITEMS.register("basic_circuit", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADVANCED_CIRCUIT = ITEMS.register("advanced_circuit", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRON_TUBE_BASE = ITEMS.register("electron_tube_base", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRON_TUBE_PINS = ITEMS.register("electron_tube_pins", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ELECTRON_TUBE_CASING = ITEMS.register("incomplete_electron_tube_casing", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRON_TUBE_CASING = ITEMS.register("electron_tube_casing", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ELECTRON_TUBE_BULB = ITEMS.register("incomplete_electron_tube_bulb", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRON_TUBE_BULB = ITEMS.register("electron_tube_bulb", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ELECTRON_TUBE = ITEMS.register("incomplete_electron_tube", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TRIODE_ELECTRON_TUBE = ITEMS.register("triode_electron_tube", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_TRIODE_ELECTRON_TUBE = ITEMS.register("incomplete_triode_electron_tube", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_RADIO_TRANSMITTER = ITEMS.register("incomplete_radio_transmitter", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RADIO_TRANSMITTER = ITEMS.register("radio_transmitter", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_SAW_BLADE = ITEMS.register("incomplete_saw_blade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAW_BLADE = ITEMS.register("saw_blade", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_DRILL = ITEMS.register("incomplete_drill", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRILL_HEAD = ITEMS.register("drill_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRILL = ITEMS.register("drill", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_BRASS_HAND = ITEMS.register("incomplete_brass_hand", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_PROPELLER = ITEMS.register("incomplete_propeller", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_WHISK = ITEMS.register("incomplete_whisk", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_BASIC_CIRCUIT = ITEMS.register("incomplete_basic_circuit", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_CIRCUIT = ITEMS.register("incomplete_advanced_circuit", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_ROD = ITEMS.register("copper_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_ROD = ITEMS.register("zinc_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_ROD = ITEMS.register("iron_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ROD = ITEMS.register("steel_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_ROD = ITEMS.register("graphite_rod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_ELECTRODE = ITEMS.register("copper_electrode", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_ELECTRODE = ITEMS.register("zinc_electrode", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_ELECTRODE = ITEMS.register("graphite_electrode", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_CAM = ITEMS.register("aluminum_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_SHEET = ITEMS.register("zinc_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_SHEET = ITEMS.register("netherite_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_CAM = ITEMS.register("steel_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_CAM = ITEMS.register("copper_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_CAM = ITEMS.register("zinc_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_CAM = ITEMS.register("brass_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_QUARTZ_CAM = ITEMS.register("rose_quartz_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_CAM = ITEMS.register("wooden_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_CAM = ITEMS.register("stone_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_CAM = ITEMS.register("iron_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_CAM = ITEMS.register("golden_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_CAM = ITEMS.register("diamond_cam", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_STARDUST = ITEMS.register("yellow_stardust", () -> new FloatingItem(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_STARDUST = ITEMS.register("blue_stardust", () -> new FloatingItem(new Item.Properties()));
    public static final DeferredItem<Item> UNSTABLE_STARDUST_BLEND = ITEMS.register("unstable_stardust_blend", () -> new FloatingItem(new Item.Properties()));
    public static final DeferredItem<Item> STARDUST_BLEND = ITEMS.register("stardust_blend", () -> new FloatingItem(new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_ESSENCE = ITEMS.register("crimson_essence", () -> new FloatingItem(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_POWER_ARMOR_COMPONENTS = ITEMS.register("aluminum_power_armor_components", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_POWER_ARMOR_COMPONENTS = ITEMS.register("steel_power_armor_components", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_POWER_ARMOR_COMPONENTS = ITEMS.register("netherite_power_armor_components", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ALUMINUM_POWER_ARMOR_COMPONENTS = ITEMS.register("incomplete_aluminum_power_armor_components", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_STEEL_POWER_ARMOR_COMPONENTS = ITEMS.register("incomplete_steel_power_armor_components", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_NETHERITE_POWER_ARMOR_COMPONENTS = ITEMS.register("incomplete_netherite_power_armor_components", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BASIC_POWER_CORE = ITEMS.register("basic_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_BASIC_POWER_CORE = ITEMS.register("incomplete_basic_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNCHARGED_BASIC_POWER_CORE = ITEMS.register("uncharged_basic_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWER_CORE = ITEMS.register("power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_POWER_CORE = ITEMS.register("incomplete_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNCHARGED_POWER_CORE = ITEMS.register("uncharged_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ADVANCED_POWER_CORE = ITEMS.register("advanced_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_ADVANCED_POWER_CORE = ITEMS.register("incomplete_advanced_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNCHARGED_ADVANCED_POWER_CORE = ITEMS.register("uncharged_advanced_power_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIGHTNING_CORE = ITEMS.register("lightning_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_LIGHTNING_CORE = ITEMS.register("incomplete_lightning_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNCHARGED_LIGHTNING_CORE = ITEMS.register("uncharged_lightning_core", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE = ITEMS.register("graphite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COKE = ITEMS.register("coke", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_CARBON = ITEMS.register("powdered_carbon", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SLAG = ITEMS.register("slag", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_IRON = ITEMS.register("powdered_iron", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_STEEL = ITEMS.register("powdered_steel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_LEAD = ITEMS.register("powdered_lead", () -> new Item(new Item.Properties().food(DefensiveFoods.POWDERED_LEAD)));
    public static final DeferredItem<Item> POWDERED_URANIUM = ITEMS.register("powdered_uranium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEPLETED_URANIUM_INGOT = ITEMS.register("depleted_uranium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_DEPLETED_URANIUM = ITEMS.register("powdered_depleted_uranium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FUEL_GRADE_URANIUM_INGOT = ITEMS.register("fuel_grade_uranium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_FUEL_GRADE_URANIUM = ITEMS.register("powdered_fuel_grade_uranium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WEAPONS_GRADE_URANIUM_INGOT = ITEMS.register("weapons_grade_uranium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_WEAPONS_GRADE_URANIUM = ITEMS.register("powdered_weapons_grade_uranium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCITE_SHARD = ITEMS.register("calcite_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANDESITE_SHARD = ITEMS.register("andesite_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRANITE_SHARD = ITEMS.register("granite_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIORITE_SHARD = ITEMS.register("diorite_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUFF_SHARD = ITEMS.register("tuff_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIMESTONE_SHARD = ITEMS.register("limestone_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRIMSITE_SHARD = ITEMS.register("crimsite_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ASURINE_SHARD = ITEMS.register("asurine_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VERIDIUM_SHARD = ITEMS.register("veridium_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OCHRUM_SHARD = ITEMS.register("ochrum_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCORIA_SHARD = ITEMS.register("scoria_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SCORCHIA_SHARD = ITEMS.register("scorchia_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_SHARD = ITEMS.register("diamond_shard", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUSHED_ANCIENT_DEBRIS = ITEMS.register("crushed_ancient_debris", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_CRYSTAL = ITEMS.register("redstone_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INERT_REDSTONE_CRYSTAL = ITEMS.register("inert_redstone_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_CRYSTAL_CLUSTER = ITEMS.register("redstone_crystal_cluster", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POLISHED_REDSTONE_CRYSTAL = ITEMS.register("polished_redstone_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_CAPACITOR = ITEMS.register("redstone_capacitor", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EXPERIENCE_CRYSTAL = ITEMS.register("experience_crystal", () -> new ExperienceNuggetItem(new Item.Properties()));
    public static final DeferredItem<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EXPERIENCE_CRYSTAL_CLUSTER = ITEMS.register("experience_crystal_cluster", () -> new ExperienceNuggetItem(new Item.Properties()));

    public static final DeferredItem<Item> PISTOL = ITEMS.register("pistol", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RIFLE = ITEMS.register("rifle", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHOTGUN = ITEMS.register("shotgun", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> GUNPOWDER_PINCH = ITEMS.register("gunpowder_pinch", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMALL_BULLET = ITEMS.register("small_bullet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMALL_BULLET_TIP = ITEMS.register("small_bullet_tip", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LARGE_BULLET = ITEMS.register("large_bullet", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LARGE_BULLET_TIP = ITEMS.register("large_bullet_tip", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BUCKSHOT = ITEMS.register("buckshot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHOTGUN_SHELL = ITEMS.register("shotgun_shell", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULLET_CASING = ITEMS.register("bullet_casing", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SMALL_BULLET_TIP_DIE = ITEMS.register("small_bullet_tip_die", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LARGE_BULLET_TIP_DIE = ITEMS.register("large_bullet_tip_die", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULLET_CASING_DIE = ITEMS.register("bullet_casing_die", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEATED_LEAD_INGOT = ITEMS.register("heated_lead_ingot", () -> new HotIngotItem(new Item.Properties()));
    public static final DeferredItem<Item> HEATED_BRASS_INGOT = ITEMS.register("heated_brass_ingot", () -> new HotIngotItem(new Item.Properties()));

    public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_GOLD_NUGGET = ITEMS.register("rose_gold_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VIOLET_GOLD_NUGGET = ITEMS.register("violet_gold_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GUNSTEEL_NUGGET = ITEMS.register("gunsteel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STABALLOY_NUGGET = ITEMS.register("staballoy_nugget", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILVER_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("silver_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("platinum_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("electrum_upgrade_smithing_template", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARDUST_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("stardust_upgrade_smithing_template", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final DeferredItem<Item> PYRAEN_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("pyraen_upgrade_smithing_template", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.register("raw_nickel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POWDERED_RAW_IRON = ITEMS.register("powdered_raw_iron", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_GOLD = ITEMS.register("powdered_raw_gold", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_COPPER = ITEMS.register("powdered_raw_copper", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_ZINC = ITEMS.register("powdered_raw_zinc", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_ALUMINUM = ITEMS.register("powdered_raw_aluminum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_SILVER = ITEMS.register("powdered_raw_silver", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_PLATINUM = ITEMS.register("powdered_raw_platinum", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_LEAD = ITEMS.register("powdered_raw_lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_TIN = ITEMS.register("powdered_raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_NICKEL = ITEMS.register("powdered_raw_nickel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POWDERED_RAW_URANIUM = ITEMS.register("powdered_raw_uranium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> KINETIC_MECHANISM = ITEMS.register("kinetic_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_MECHANISM = ITEMS.register("redstone_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HYDRAULIC_MECHANISM = ITEMS.register("hydraulic_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOGISTIC_MECHANISM = ITEMS.register("logistic_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMPUTATION_MECHANISM = ITEMS.register("computation_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RADAR_MECHANISM = ITEMS.register("radar_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_KINETIC_MECHANISM = ITEMS.register("incomplete_kinetic_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_REDSTONE_MECHANISM = ITEMS.register("incomplete_redstone_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_HYDRAULIC_MECHANISM = ITEMS.register("incomplete_hydraulic_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_LOGISTIC_MECHANISM = ITEMS.register("incomplete_logistic_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_COMPUTATION_MECHANISM = ITEMS.register("incomplete_computation_mechanism", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INCOMPLETE_RADAR_MECHANISM = ITEMS.register("incomplete_radar_mechanism", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_NUT = ITEMS.register("copper_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> SILVER_NUT = ITEMS.register("silver_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> GOLD_NUT = ITEMS.register("gold_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> ELECTRUM_NUT = ITEMS.register("electrum_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final DeferredItem<Item> PLATINUM_NUT = ITEMS.register("platinum_nut", () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> POLISHED_AMETHYST = ITEMS.register("polished_amethyst", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ROSE_QUARTZ_ROD = ITEMS.register("rose_quartz_rod", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IRON_GRIT_SANDPAPER = ITEMS.register("iron_grit_sandpaper", () -> new SandPaperItem(new Item.Properties().durability(32)));
    public static final DeferredItem<Item> STEEL_GRIT_SANDPAPER = ITEMS.register("steel_grit_sandpaper", () -> new SandPaperItem(new Item.Properties().durability(128)));

    public static final DeferredItem<Item> ALUMINUM_HELMET = ITEMS.register("aluminum_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final DeferredItem<Item> ALUMINUM_CHESTPLATE = ITEMS.register("aluminum_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));
    public static final DeferredItem<Item> ALUMINUM_LEGGINGS = ITEMS.register("aluminum_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));
    public static final DeferredItem<Item> ALUMINUM_BOOTS = ITEMS.register("aluminum_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.ALUMINUM, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));

    public static final DeferredItem<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final DeferredItem<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(10))));
    public static final DeferredItem<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(10))));
    public static final DeferredItem<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(10))));

    public static final DeferredItem<Item> ZINC_HELMET = ITEMS.register("zinc_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> ZINC_CHESTPLATE = ITEMS.register("zinc_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> ZINC_LEGGINGS = ITEMS.register("zinc_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> ZINC_BOOTS = ITEMS.register("zinc_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.ZINC, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final DeferredItem<Item> BRASS_HELMET = ITEMS.register("brass_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<Item> BRASS_CHESTPLATE = ITEMS.register("brass_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(30))));
    public static final DeferredItem<Item> BRASS_LEGGINGS = ITEMS.register("brass_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(30))));
    public static final DeferredItem<Item> BRASS_BOOTS = ITEMS.register("brass_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.BRASS, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(30))));

    public static final DeferredItem<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));

    public static final DeferredItem<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<Item> ROSE_GOLD_CEREMONIAL_HELMET = ITEMS.register("rose_gold_ceremonial_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> ROSE_GOLD_CEREMONIAL_CHESTPLATE = ITEMS.register("rose_gold_ceremonial_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> ROSE_GOLD_CEREMONIAL_LEGGINGS = ITEMS.register("rose_gold_ceremonial_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> ROSE_GOLD_CEREMONIAL_BOOTS = ITEMS.register("rose_gold_ceremonial_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ROSE_GOLD_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));

    public static final DeferredItem<Item> VIOLET_GOLD_CEREMONIAL_HELMET = ITEMS.register("violet_gold_ceremonial_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> VIOLET_GOLD_CEREMONIAL_CHESTPLATE = ITEMS.register("violet_gold_ceremonial_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> VIOLET_GOLD_CEREMONIAL_LEGGINGS = ITEMS.register("violet_gold_ceremonial_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> VIOLET_GOLD_CEREMONIAL_BOOTS = ITEMS.register("violet_gold_ceremonial_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.VIOLET_GOLD_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));

    public static final DeferredItem<Item> ROSE_QUARTZ_HELMET = ITEMS.register("rose_quartz_helmet",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<Item> ROSE_QUARTZ_CHESTPLATE = ITEMS.register("rose_quartz_chestplate",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(30))));
    public static final DeferredItem<Item> ROSE_QUARTZ_LEGGINGS = ITEMS.register("rose_quartz_leggings",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(30))));
    public static final DeferredItem<Item> ROSE_QUARTZ_BOOTS = ITEMS.register("rose_quartz_boots",
            () -> new ArmorItem(DefensiveArmorMaterials.ROSEQUARTZ, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(30))));

    public static final DeferredItem<Item> ELECTRUM_HELMET = ITEMS.register("electrum_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50))));
    public static final DeferredItem<Item> ELECTRUM_CHESTPLATE = ITEMS.register("electrum_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(50))));
    public static final DeferredItem<Item> ELECTRUM_LEGGINGS = ITEMS.register("electrum_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(50))));
    public static final DeferredItem<Item> ELECTRUM_BOOTS = ITEMS.register("electrum_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ELECTRUM, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(50))));

    public static final DeferredItem<Item> STARDUST_HELMET = ITEMS.register("stardust_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STARDUST, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.HELMET.getDurability(60))));
    public static final DeferredItem<Item> STARDUST_CHESTPLATE = ITEMS.register("stardust_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STARDUST, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.CHESTPLATE.getDurability(60))));
    public static final DeferredItem<Item> STARDUST_LEGGINGS = ITEMS.register("stardust_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STARDUST, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.LEGGINGS.getDurability(60))));
    public static final DeferredItem<Item> STARDUST_BOOTS = ITEMS.register("stardust_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STARDUST, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.BOOTS.getDurability(60))));

    public static final DeferredItem<Item> PYRAEN_HELMET = ITEMS.register("pyraen_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PYRAEN, ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.HELMET.getDurability(75))));
    public static final DeferredItem<Item> PYRAEN_CHESTPLATE = ITEMS.register("pyraen_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PYRAEN, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.CHESTPLATE.getDurability(75))));
    public static final DeferredItem<Item> PYRAEN_LEGGINGS = ITEMS.register("pyraen_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PYRAEN, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.LEGGINGS.getDurability(75))));
    public static final DeferredItem<Item> PYRAEN_BOOTS = ITEMS.register("pyraen_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.PYRAEN, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.RARE).durability(ArmorItem.Type.BOOTS.getDurability(75))));

    public static final DeferredItem<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));
    public static final DeferredItem<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(45))));
    public static final DeferredItem<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(45))));
    public static final DeferredItem<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(45))));

    public static final DeferredItem<Item> ALUMINUM_CROWN = ITEMS.register("aluminum_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_ALUMINUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final DeferredItem<Item> SILVER_CROWN = ITEMS.register("silver_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_SILVER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> PLATINUM_CROWN = ITEMS.register("platinum_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_PLATINUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<Item> STEEL_CROWN = ITEMS.register("steel_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_STEEL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(45))));
    public static final DeferredItem<Item> COPPER_CROWN = ITEMS.register("copper_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_COPPER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(10))));
    public static final DeferredItem<Item> ZINC_CROWN = ITEMS.register("zinc_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_ZINC, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> BRASS_CROWN = ITEMS.register("brass_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_BRASS, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<Item> WOODEN_CROWN = ITEMS.register("wooden_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_WOOD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> STONE_CROWN = ITEMS.register("stone_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_STONE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(7))));
    public static final DeferredItem<Item> IRON_CROWN = ITEMS.register("iron_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_IRON, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<Item> GOLDEN_CROWN = ITEMS.register("golden_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_GOLD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(7))));
    public static final DeferredItem<Item> NETHERITE_CROWN = ITEMS.register("netherite_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_NETHERITE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(37))));
    public static final DeferredItem<Item> ELECTRUM_CROWN = ITEMS.register("electrum_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_ELECTRUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(50))));
    public static final DeferredItem<Item> STARDUST_CROWN = ITEMS.register("stardust_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_STARDUST, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(60))));
    public static final DeferredItem<Item> PYRAEN_CROWN = ITEMS.register("pyraen_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_PYRAEN, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(75))));
    public static final DeferredItem<Item> ROSE_GOLD_CROWN = ITEMS.register("rose_gold_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_ROSE_GOLD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> VIOLET_GOLD_CROWN = ITEMS.register("violet_gold_crown",
            () -> new ArmorItem(DefensiveArmorMaterials.REGAL_VIOLET_GOLD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));

    public static final DeferredItem<Item> ALUMINUM_POWER_HELMET = ITEMS.register("aluminum_power_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.HELMET.getDurability(30))));
    public static final DeferredItem<Item> ALUMINUM_POWER_CHESTPLATE = ITEMS.register("aluminum_power_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.CHESTPLATE.getDurability(30))));
    public static final DeferredItem<Item> ALUMINUM_POWER_LEGGINGS = ITEMS.register("aluminum_power_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.LEGGINGS.getDurability(30))));
    public static final DeferredItem<Item> ALUMINUM_POWER_BOOTS = ITEMS.register("aluminum_power_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.ALUMINUM_POWER, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.BOOTS.getDurability(30))));

    public static final DeferredItem<Item> STEEL_POWER_HELMET = ITEMS.register("steel_power_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.HELMET.getDurability(35))));
    public static final DeferredItem<Item> STEEL_POWER_CHESTPLATE = ITEMS.register("steel_power_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));
    public static final DeferredItem<Item> STEEL_POWER_LEGGINGS = ITEMS.register("steel_power_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.LEGGINGS.getDurability(35))));
    public static final DeferredItem<Item> STEEL_POWER_BOOTS = ITEMS.register("steel_power_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.STEEL_POWER, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.UNCOMMON).durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<Item> NETHERITE_POWER_HELMET = ITEMS.register("netherite_power_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.RARE).durability(ArmorItem.Type.HELMET.getDurability(70))));
    public static final DeferredItem<Item> NETHERITE_POWER_CHESTPLATE = ITEMS.register("netherite_power_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.RARE).durability(ArmorItem.Type.CHESTPLATE.getDurability(70))));
    public static final DeferredItem<Item> NETHERITE_POWER_LEGGINGS = ITEMS.register("netherite_power_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.RARE).durability(ArmorItem.Type.LEGGINGS.getDurability(70))));
    public static final DeferredItem<Item> NETHERITE_POWER_BOOTS = ITEMS.register("netherite_power_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.NETHERITE_POWER, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.RARE).durability(ArmorItem.Type.BOOTS.getDurability(70))));

    public static final DeferredItem<Item> GOLD_CEREMONIAL_HELMET = ITEMS.register("gold_ceremonial_helmet",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(5))));
    public static final DeferredItem<Item> GOLD_CEREMONIAL_CHESTPLATE = ITEMS.register("gold_ceremonial_chestplate",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(5))));
    public static final DeferredItem<Item> GOLD_CEREMONIAL_LEGGINGS = ITEMS.register("gold_ceremonial_leggings",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(5))));
    public static final DeferredItem<Item> GOLD_CEREMONIAL_BOOTS = ITEMS.register("gold_ceremonial_boots",
            () -> new DefensiveArmorItem(DefensiveArmorMaterials.GOLD_CEREMONIAL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(5))));

    public static final DeferredItem<Item> ALUMINUM_SWORD = ITEMS.register("aluminum_sword",
            () -> new SwordItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.ALUMINUM, 3, -2.4f))));
    public static final DeferredItem<Item> ALUMINUM_PICKAXE = ITEMS.register("aluminum_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.ALUMINUM, 1, -2.8f))));
    public static final DeferredItem<Item> ALUMINUM_AXE = ITEMS.register("aluminum_axe",
            () -> new AxeItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.ALUMINUM, 6, -3.2f))));
    public static final DeferredItem<Item> ALUMINUM_SHOVEL = ITEMS.register("aluminum_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.ALUMINUM, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ALUMINUM_HOE = ITEMS.register("aluminum_hoe",
            () -> new HoeItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.ALUMINUM, 0f, -3.0f))));
    public static final DeferredItem<Item> ALUMINUM_PAXEL = ITEMS.register("aluminum_paxel",
            () -> new PaxelItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.ALUMINUM, 3, -2.7f))));
    public static final DeferredItem<Item> ALUMINUM_MATTOCK = ITEMS.register("aluminum_mattock",
            () -> new MattockItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.ALUMINUM, 0, -1.6f))));
    public static final DeferredItem<Item> ALUMINUM_HALBERD = ITEMS.register("aluminum_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ALUMINUM, 4, -2.7f))));
    public static final DeferredItem<Item> ALUMINUM_POLEAXE = ITEMS.register("aluminum_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ALUMINUM, 4, -2.7f))));
    public static final DeferredItem<Item> ALUMINUM_SCYTHE = ITEMS.register("aluminum_scythe",
            () -> new ScytheItem(DefensiveToolTiers.ALUMINUM, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.ALUMINUM, 4, -2.7f))));
    public static final DeferredItem<Item> ALUMINUM_M0RNINGSTAR = ITEMS.register("aluminum_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.ALUMINUM, 4, -2.7f))));
    public static final DeferredItem<Item> ALUMINUM_GREATAXE = ITEMS.register("aluminum_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.ALUMINUM, 7, -3.6f))));
    public static final DeferredItem<Item> ALUMINUM_GREATSWORD = ITEMS.register("aluminum_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.ALUMINUM, 7, -3.6f))));
    public static final DeferredItem<Item> ALUMINUM_ZWEIHANDER = ITEMS.register("aluminum_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.ALUMINUM, 6, -2.8f))));
    public static final DeferredItem<Item> ALUMINUM_HAMMER = ITEMS.register("aluminum_hammer",
            () -> new HammerItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.ALUMINUM, 12, -3.7f))));
    public static final DeferredItem<Item> ALUMINUM_EXCAVATOR = ITEMS.register("aluminum_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.ALUMINUM, 1.5f, -3f))));
    public static final DeferredItem<Item> ALUMINUM_SPEAR = ITEMS.register("aluminum_spear",
            () -> new SpearItem(new Item.Properties().durability(250).attributes(SpearItem.createAttributes(3f)), DefensiveEntities.ALUMINUM_SPEAR.get()));
    public static final DeferredItem<Item> ALUMINUM_THROWING_STAR = ITEMS.register("aluminum_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(250).attributes(ThrowingStarItem.createAttributes(3f)), DefensiveEntities.ALUMINUM_THROWING_STAR.get()));
    public static final DeferredItem<Item> ALUMINUM_GLAIVE = ITEMS.register("aluminum_glaive",
            () -> new SwordItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.ALUMINUM, 4f, -2.7f))));
    public static final DeferredItem<Item> ALUMINUM_DAGGER = ITEMS.register("aluminum_dagger",
            () -> new DaggerItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.ALUMINUM, 2, -2))));
    public static final DeferredItem<Item> ALUMINUM_STAFF = ITEMS.register("aluminum_staff",
            () -> new StaffItem(DefensiveToolTiers.ALUMINUM, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.ALUMINUM, 2, -2))));
    public static final DeferredItem<Item> ALUMINUM_BOW = ITEMS.register("aluminum_bow",
            () -> new BowItem(new Item.Properties().durability(384)));
    public static final DeferredItem<Item> ALUMINUM_CROSSBOW = ITEMS.register("aluminum_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(384)));

    public static final DeferredItem<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.SILVER, 3, -2.4f))));
    public static final DeferredItem<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.SILVER, 1, -2.8f))));
    public static final DeferredItem<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.SILVER, 6, -3.2f))));
    public static final DeferredItem<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.SILVER, 1.5f, -3.0f))));
    public static final DeferredItem<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.SILVER, 0f, -3.0f))));
    public static final DeferredItem<Item> SILVER_PAXEL = ITEMS.register("silver_paxel",
            () -> new PaxelItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.SILVER, 3, -2.7f))));
    public static final DeferredItem<Item> SILVER_MATTOCK = ITEMS.register("silver_mattock",
            () -> new MattockItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.SILVER, 0, -1.6f))));
    public static final DeferredItem<Item> SILVER_HALBERD = ITEMS.register("silver_halberd",
            () -> new HalberdItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.SILVER, 4, -2.7f))));
    public static final DeferredItem<Item> SILVER_POLEAXE = ITEMS.register("silver_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.SILVER, 4, -2.7f))));
    public static final DeferredItem<Item> SILVER_SCYTHE = ITEMS.register("silver_scythe",
            () -> new ScytheItem(DefensiveToolTiers.SILVER, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.SILVER, 4, -2.7f))));
    public static final DeferredItem<Item> SILVER_MORNINGSTAR = ITEMS.register("silver_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.SILVER, 4, -2.7f))));
    public static final DeferredItem<Item> SILVER_GREATAXE = ITEMS.register("silver_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.SILVER, 7, -3.6f))));
    public static final DeferredItem<Item> SILVER_GREATSWORD = ITEMS.register("silver_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.SILVER, 7, -3.6f))));
    public static final DeferredItem<Item> SILVER_ZWEIHANDER = ITEMS.register("silver_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.SILVER, 6, -2.8f))));
    public static final DeferredItem<Item> SILVER_HAMMER = ITEMS.register("silver_hammer",
            () -> new HammerItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.SILVER, 12, -3.7f))));
    public static final DeferredItem<Item> SILVER_EXCAVATOR = ITEMS.register("silver_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.SILVER, 1.5f, -3f))));
    public static final DeferredItem<Item> SILVER_SPEAR = ITEMS.register("silver_spear",
            () -> new SpearItem(new Item.Properties().durability(250).attributes(SpearItem.createAttributes(6.5f)), DefensiveEntities.SILVER_SPEAR.get()));
    public static final DeferredItem<Item> SILVER_THROWING_STAR = ITEMS.register("silver_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(250).attributes(ThrowingStarItem.createAttributes(3f)), DefensiveEntities.SILVER_THROWING_STAR.get()));
    public static final DeferredItem<Item> SILVER_GLAIVE = ITEMS.register("silver_glaive",
            () -> new SwordItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.SILVER, 4f, -2.7f))));
    public static final DeferredItem<Item> SILVER_DAGGER = ITEMS.register("silver_dagger",
            () -> new DaggerItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.SILVER, 2, -2))));
    public static final DeferredItem<Item> SILVER_STAFF = ITEMS.register("silver_staff",
            () -> new StaffItem(DefensiveToolTiers.SILVER, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.SILVER, 2, -2))));
    public static final DeferredItem<Item> SILVER_BOW = ITEMS.register("silver_bow",
            () -> new BowItem(new Item.Properties().durability(384)));
    public static final DeferredItem<Item> SILVER_CROSSBOW = ITEMS.register("silver_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(384)));

    public static final DeferredItem<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.PLATINUM, 3, -2.4f))));
    public static final DeferredItem<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.PLATINUM, 1, -2.8f))));
    public static final DeferredItem<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.PLATINUM, 6, -3.2f))));
    public static final DeferredItem<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.PLATINUM, 1.5f, -3.0f))));
    public static final DeferredItem<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.PLATINUM, 0f, -3.0f))));
    public static final DeferredItem<Item> PLATINUM_PAXEL = ITEMS.register("platinum_paxel",
            () -> new PaxelItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.PLATINUM, 3, -2.7f))));
    public static final DeferredItem<Item> PLATINUM_MATTOCK = ITEMS.register("platinum_mattock",
            () -> new MattockItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.PLATINUM, 0, -1.6f))));
    public static final DeferredItem<Item> PLATINUM_HALBERD = ITEMS.register("platinum_halberd",
            () -> new HalberdItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.PLATINUM, 4, -2.7f))));
    public static final DeferredItem<Item> PLATINUM_POLEAXE = ITEMS.register("platinum_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.PLATINUM, 4, -2.7f))));
    public static final DeferredItem<Item> PLATINUM_SCYTHE = ITEMS.register("platinum_scythe",
            () -> new ScytheItem(DefensiveToolTiers.PLATINUM, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.PLATINUM, 4, -2.7f))));
    public static final DeferredItem<Item> PLATINUM_MORNINGSTAR = ITEMS.register("platinum_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.PLATINUM, 4, -2.7f))));
    public static final DeferredItem<Item> PLATINUM_GREATAXE = ITEMS.register("platinum_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.PLATINUM, 7, -3.6f))));
    public static final DeferredItem<Item> PLATINUM_GREATSWORD = ITEMS.register("platinum_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.PLATINUM, 7, -3.6f))));
    public static final DeferredItem<Item> PLATINUM_ZWEIHANDER = ITEMS.register("platinum_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.PLATINUM, 6, -2.8f))));
    public static final DeferredItem<Item> PLATINUM_HAMMER = ITEMS.register("platinum_hammer",
            () -> new HammerItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.PLATINUM, 12, -3.7f))));
    public static final DeferredItem<Item> PLATINUM_EXCAVATOR = ITEMS.register("platinum_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.PLATINUM, 1.5f, -3f))));
    public static final DeferredItem<Item> PLATINUM_SPEAR = ITEMS.register("platinum_spear",
            () -> new SpearItem(new Item.Properties().durability(1800).attributes(SpearItem.createAttributes(7.5f)), DefensiveEntities.PLATINUM_SPEAR.get()));
    public static final DeferredItem<Item> PLATINUM_THROWING_STAR = ITEMS.register("platinum_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(1800).attributes(ThrowingStarItem.createAttributes(4f)), DefensiveEntities.PLATINUM_THROWING_STAR.get()));
    public static final DeferredItem<Item> PLATINUM_GLAIVE = ITEMS.register("platinum_glaive",
            () -> new SwordItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.PLATINUM, 4f, -2.7f))));
    public static final DeferredItem<Item> PLATINUM_DAGGER = ITEMS.register("platinum_dagger",
            () -> new DaggerItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.PLATINUM, 2, -2))));
    public static final DeferredItem<Item> PLATINUM_STAFF = ITEMS.register("platinum_staff",
            () -> new StaffItem(DefensiveToolTiers.PLATINUM, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.PLATINUM, 2, -2))));
    public static final DeferredItem<Item> PLATINUM_BOW = ITEMS.register("platinum_bow",
            () -> new BowItem(new Item.Properties().durability(1800)));
    public static final DeferredItem<Item> PLATINUM_CROSSBOW = ITEMS.register("platinum_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(1800)));

    public static final DeferredItem<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.STEEL, 3, -2.4f))));
    public static final DeferredItem<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.STEEL, 1, -2.8f))));
    public static final DeferredItem<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.STEEL, 6, -3.2f))));
    public static final DeferredItem<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.STEEL, 1.5f, -3.0f))));
    public static final DeferredItem<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.STEEL, 0f, -3.0f))));
    public static final DeferredItem<Item> STEEL_PAXEL = ITEMS.register("steel_paxel",
            () -> new PaxelItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.STEEL, 3, -2.7f))));
    public static final DeferredItem<Item> STEEL_MATTOCK = ITEMS.register("steel_mattock",
            () -> new MattockItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.STEEL, 0, -1.6f))));
    public static final DeferredItem<Item> STEEL_HALBERD = ITEMS.register("steel_halberd",
            () -> new HalberdItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.STEEL, 4, -2.7f))));
    public static final DeferredItem<Item> STEEL_POLEAXE = ITEMS.register("steel_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.STEEL, 4, -2.7f))));
    public static final DeferredItem<Item> STEEL_SCYTHE = ITEMS.register("steel_scythe",
            () -> new ScytheItem(DefensiveToolTiers.STEEL, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.STEEL, 4, -2.7f))));
    public static final DeferredItem<Item> STEEL_MORNINGSTAR = ITEMS.register("steel_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.STEEL, 4, -2.7f))));
    public static final DeferredItem<Item> STEEL_GREATAXE = ITEMS.register("steel_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.STEEL, 7, -3.6f))));
    public static final DeferredItem<Item> STEEL_GREATSWORD = ITEMS.register("steel_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.STEEL, 7, -3.6f))));
    public static final DeferredItem<Item> STEEL_ZWEIHANDER = ITEMS.register("steel_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.STEEL, 6, -2.8f))));
    public static final DeferredItem<Item> STEEL_HAMMER = ITEMS.register("steel_hammer",
            () -> new HammerItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.STEEL, 12, -3.7f))));
    public static final DeferredItem<Item> STEEL_EXCAVATOR = ITEMS.register("steel_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.STEEL, 1.5f, -3f))));
    public static final DeferredItem<Item> STEEL_SPEAR = ITEMS.register("steel_spear",
            () -> new SpearItem(new Item.Properties().durability(1800).attributes(SpearItem.createAttributes(7f)), DefensiveEntities.STEEL_SPEAR.get()));
    public static final DeferredItem<Item> STEEL_THROWING_STAR = ITEMS.register("steel_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(1800).attributes(ThrowingStarItem.createAttributes(4f)), DefensiveEntities.STEEL_THROWING_STAR.get()));
    public static final DeferredItem<Item> STEEL_GLAIVE = ITEMS.register("steel_glaive",
            () -> new SwordItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.STEEL, 4f, -2.7f))));
    public static final DeferredItem<Item> STEEL_DAGGER = ITEMS.register("steel_dagger",
            () -> new DaggerItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.STEEL, 2, -2))));
    public static final DeferredItem<Item> STEEL_STAFF = ITEMS.register("steel_staff",
            () -> new StaffItem(DefensiveToolTiers.STEEL, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.STEEL, 2, -2))));
    public static final DeferredItem<Item> STEEL_BOW = ITEMS.register("steel_bow",
            () -> new BowItem(new Item.Properties().durability(2765)));
    public static final DeferredItem<Item> STEEL_CROSSBOW = ITEMS.register("steel_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(2765)));

    public static final DeferredItem<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.COPPER, 3, -2.4f))));
    public static final DeferredItem<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.COPPER, 1, -2.8f))));
    public static final DeferredItem<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.COPPER, 6, -3.2f))));
    public static final DeferredItem<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.COPPER, 1.5f, -3.0f))));
    public static final DeferredItem<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.COPPER, 0f, -3.0f))));
    public static final DeferredItem<Item> COPPER_PAXEL = ITEMS.register("copper_paxel",
            () -> new PaxelItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.COPPER, 3, -2.7f))));
    public static final DeferredItem<Item> COPPER_MATTOCK = ITEMS.register("copper_mattock",
            () -> new MattockItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.COPPER, 0, -1.6f))));
    public static final DeferredItem<Item> COPPER_HALBERD = ITEMS.register("copper_halberd",
            () -> new HalberdItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.COPPER, 4, -2.7f))));
    public static final DeferredItem<Item> COPPER_POLEAXE = ITEMS.register("copper_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.COPPER, 4, -2.7f))));
    public static final DeferredItem<Item> COPPER_SCYTHE = ITEMS.register("copper_scythe",
            () -> new ScytheItem(DefensiveToolTiers.COPPER, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.COPPER, 4, -2.7f))));
    public static final DeferredItem<Item> COPPER_MORNINGSTAR = ITEMS.register("copper_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.COPPER, 4, -2.7f))));
    public static final DeferredItem<Item> COPPER_GREATAXE = ITEMS.register("copper_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.COPPER, 7, -3.6f))));
    public static final DeferredItem<Item> COPPER_GREATSWORD = ITEMS.register("copper_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.COPPER, 7, -3.6f))));
    public static final DeferredItem<Item> COPPER_ZWEIHANDER = ITEMS.register("copper_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.COPPER, 6, -2.8f))));
    public static final DeferredItem<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
            () -> new HammerItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.COPPER, 12, -3.7f))));
    public static final DeferredItem<Item> COPPER_EXCAVATOR = ITEMS.register("copper_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.COPPER, 1.5f, -3f))));
    public static final DeferredItem<Item> COPPER_SPEAR = ITEMS.register("copper_spear",
            () -> new SpearItem(new Item.Properties().durability(131).attributes(SpearItem.createAttributes(6)), DefensiveEntities.COPPER_SPEAR.get()));
    public static final DeferredItem<Item> COPPER_THROWING_STAR = ITEMS.register("copper_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(131).attributes(ThrowingStarItem.createAttributes(3f)), DefensiveEntities.COPPER_THROWING_STAR.get()));
    public static final DeferredItem<Item> COPPER_GLAIVE = ITEMS.register("copper_glaive",
            () -> new SwordItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.COPPER, 4f, -2.7f))));
    public static final DeferredItem<Item> COPPER_DAGGER = ITEMS.register("copper_dagger",
            () -> new DaggerItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.COPPER, 2, -2))));
    public static final DeferredItem<Item> COPPER_STAFF = ITEMS.register("copper_staff",
            () -> new StaffItem(DefensiveToolTiers.COPPER, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.COPPER, 2, -2))));
    public static final DeferredItem<Item> COPPER_BOW = ITEMS.register("copper_bow",
            () -> new BowItem(new Item.Properties().durability(201)));
    public static final DeferredItem<Item> COPPER_CROSSBOW = ITEMS.register("copper_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(201)));

    public static final DeferredItem<Item> ZINC_SWORD = ITEMS.register("zinc_sword",
            () -> new SwordItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.ZINC, 3, -2.4f))));
    public static final DeferredItem<Item> ZINC_PICKAXE = ITEMS.register("zinc_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.ZINC, 1, -2.8f))));
    public static final DeferredItem<Item> ZINC_AXE = ITEMS.register("zinc_axe",
            () -> new AxeItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.ZINC, 6, -3.2f))));
    public static final DeferredItem<Item> ZINC_SHOVEL = ITEMS.register("zinc_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.ZINC, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ZINC_HOE = ITEMS.register("zinc_hoe",
            () -> new HoeItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.ZINC, 0f, -3.0f))));
    public static final DeferredItem<Item> ZINC_PAXEL = ITEMS.register("zinc_paxel",
            () -> new PaxelItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.ZINC, 3, -2.7f))));
    public static final DeferredItem<Item> ZINC_MATTOCK = ITEMS.register("zinc_mattock",
            () -> new MattockItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.ZINC, 0, -1.6f))));
    public static final DeferredItem<Item> ZINC_HALBERD = ITEMS.register("zinc_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ZINC, 4, -2.7f))));
    public static final DeferredItem<Item> ZINC_POLEAXE = ITEMS.register("zinc_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ZINC, 4, -2.7f))));
    public static final DeferredItem<Item> ZINC_SCYTHE = ITEMS.register("zinc_scythe",
            () -> new ScytheItem(DefensiveToolTiers.ZINC, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.ZINC, 4, -2.7f))));
    public static final DeferredItem<Item> ZINC_MORNINGSTAR = ITEMS.register("zinc_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.ZINC, 4, -2.7f))));
    public static final DeferredItem<Item> ZINC_GREATAXE = ITEMS.register("zinc_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.ZINC, 7, -3.6f))));
    public static final DeferredItem<Item> ZINC_GREATSWORD = ITEMS.register("zinc_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.ZINC, 7, -3.6f))));
    public static final DeferredItem<Item> ZINC_ZWEIHANDER = ITEMS.register("zinc_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.ZINC, 6, -2.8f))));
    public static final DeferredItem<Item> ZINC_HAMMER = ITEMS.register("zinc_hammer",
            () -> new HammerItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.ZINC, 12, -3.7f))));
    public static final DeferredItem<Item> ZINC_EXCAVATOR = ITEMS.register("zinc_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.ZINC, 1.5f, -3f))));
    public static final DeferredItem<Item> ZINC_SPEAR = ITEMS.register("zinc_spear",
            () -> new SpearItem(new Item.Properties().durability(250).attributes(SpearItem.createAttributes(6)), DefensiveEntities.ZINC_SPEAR.get()));
    public static final DeferredItem<Item> ZINC_THROWING_STAR = ITEMS.register("zinc_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(250).attributes(ThrowingStarItem.createAttributes(3f)), DefensiveEntities.ZINC_THROWING_STAR.get()));
    public static final DeferredItem<Item> ZINC_GLAIVE = ITEMS.register("zinc_glaive",
            () -> new SwordItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.ZINC, 4f, -2.7f))));
    public static final DeferredItem<Item> ZINC_DAGGER = ITEMS.register("zinc_dagger",
            () -> new DaggerItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.ZINC, 2, -2))));
    public static final DeferredItem<Item> ZINC_STAFF = ITEMS.register("zinc_staff",
            () -> new StaffItem(DefensiveToolTiers.ZINC, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.ZINC, 2, -2))));
    public static final DeferredItem<Item> ZINC_BOW = ITEMS.register("zinc_bow",
            () -> new BowItem(new Item.Properties().durability(384)));
    public static final DeferredItem<Item> ZINC_CROSSBOW = ITEMS.register("zinc_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(384)));

    public static final DeferredItem<Item> BRASS_SWORD = ITEMS.register("brass_sword",
            () -> new SwordItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.BRASS, 3, -2.4f))));
    public static final DeferredItem<Item> BRASS_PICKAXE = ITEMS.register("brass_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.BRASS, 1, -2.8f))));
    public static final DeferredItem<Item> BRASS_AXE = ITEMS.register("brass_axe",
            () -> new AxeItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.BRASS, 6, -3.2f))));
    public static final DeferredItem<Item> BRASS_SHOVEL = ITEMS.register("brass_shovel",
            () -> new ShovelItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.BRASS, 1.5f, -3.0f))));
    public static final DeferredItem<Item> BRASS_HOE = ITEMS.register("brass_hoe",
            () -> new HoeItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.BRASS, 0f, -3.0f))));
    public static final DeferredItem<Item> BRASS_PAXEL = ITEMS.register("brass_paxel",
            () -> new PaxelItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.BRASS, 3, -2.7f))));
    public static final DeferredItem<Item> BRASS_MATTOCK = ITEMS.register("brass_mattock",
            () -> new MattockItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.BRASS, 0, -1.6f))));
    public static final DeferredItem<Item> BRASS_HALBERD = ITEMS.register("brass_halberd",
            () -> new HalberdItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.BRASS, 4, -2.7f))));
    public static final DeferredItem<Item> BRASS_POLEAXE = ITEMS.register("brass_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.BRASS, 4, -2.7f))));
    public static final DeferredItem<Item> BRASS_SCYTHE = ITEMS.register("brass_scythe",
            () -> new ScytheItem(DefensiveToolTiers.BRASS, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.BRASS, 4, -2.7f))));
    public static final DeferredItem<Item> BRASS_MORNINGSTAR = ITEMS.register("brass_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.BRASS, 4, -2.7f))));
    public static final DeferredItem<Item> BRASS_GREATAXE = ITEMS.register("brass_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.BRASS, 7, -3.6f))));
    public static final DeferredItem<Item> BRASS_GREATSWORD = ITEMS.register("brass_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.BRASS, 7, -3.6f))));
    public static final DeferredItem<Item> BRASS_ZWEIHANDER = ITEMS.register("brass_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.BRASS, 6, -2.8f))));
    public static final DeferredItem<Item> BRASS_HAMMER = ITEMS.register("brass_hammer",
            () -> new HammerItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.BRASS, 12, -3.7f))));
    public static final DeferredItem<Item> BRASS_EXCAVATOR = ITEMS.register("brass_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.BRASS, 1.5f, -3f))));
    public static final DeferredItem<Item> BRASS_SPEAR = ITEMS.register("brass_spear",
            () -> new SpearItem(new Item.Properties().durability(1561).attributes(SpearItem.createAttributes(7f)), DefensiveEntities.BRASS_SPEAR.get()));
    public static final DeferredItem<Item> BRASS_THROWING_STAR = ITEMS.register("brass_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(1561).attributes(ThrowingStarItem.createAttributes(4f)), DefensiveEntities.BRASS_THROWING_STAR.get()));
    public static final DeferredItem<Item> BRASS_GLAIVE = ITEMS.register("brass_glaive",
            () -> new SwordItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.BRASS, 4f, -2.7f))));
    public static final DeferredItem<Item> BRASS_DAGGER = ITEMS.register("brass_dagger",
            () -> new DaggerItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.BRASS, 2, -2))));
    public static final DeferredItem<Item> BRASS_STAFF = ITEMS.register("brass_staff",
            () -> new StaffItem(DefensiveToolTiers.BRASS, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.BRASS, 2, -2))));
    public static final DeferredItem<Item> BRASS_BOW = ITEMS.register("brass_bow",
            () -> new BowItem(new Item.Properties().durability(2398)));
    public static final DeferredItem<Item> BRASS_CROSSBOW = ITEMS.register("brass_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(2398)));

    public static final DeferredItem<Item> ROSE_QUARTZ_SWORD = ITEMS.register("rose_quartz_sword",
            () -> new SwordItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 3, -2.4f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_PICKAXE = ITEMS.register("rose_quartz_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 1, -2.8f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_AXE = ITEMS.register("rose_quartz_axe",
            () -> new AxeItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(AxeItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 6, -3.2f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_SHOVEL = ITEMS.register("rose_quartz_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(ShovelItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_HOE = ITEMS.register("rose_quartz_hoe",
            () -> new HoeItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(HoeItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 0f, -3.0f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_PAXEL = ITEMS.register("rose_quartz_paxel",
            () -> new PaxelItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(PaxelItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 3, -2.7f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_MATTOCK = ITEMS.register("rose_quartz_mattock",
            () -> new MattockItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(MattockItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 0, -1.6f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_HALBERD = ITEMS.register("rose_quartz_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 4, -2.7f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_POLEAXE = ITEMS.register("rose_quartz_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 4, -2.7f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_SCYTHE = ITEMS.register("rose_quartz_scythe",
            () -> new ScytheItem(DefensiveToolTiers.ROSE_QUARTZ, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 4, -2.7f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_MORNINGSTAR = ITEMS.register("rose_quartz_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 4, -2.7f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_GREATAXE = ITEMS.register("rose_quartz_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 7, -3.6f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_GREATSWORD = ITEMS.register("rose_quartz_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 7, -3.6f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_ZWEIHANDER = ITEMS.register("rose_quartz_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 6, -2.8f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_HAMMER = ITEMS.register("rose_quartz_hammer",
            () -> new HammerItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(HammerItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 12, -3.7f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_EXCAVATOR = ITEMS.register("rose_quartz_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 1.5f, -3f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_SPEAR = ITEMS.register("rose_quartz_spear",
            () -> new SpearItem(new Item.Properties().durability(1561).attributes(SpearItem.createAttributes(7f)), DefensiveEntities.ROSE_QUARTZ_SPEAR.get()));
    public static final DeferredItem<Item> ROSE_QUARTZ_THROWING_STAR = ITEMS.register("rose_quartz_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(1561).attributes(ThrowingStarItem.createAttributes(3f)), DefensiveEntities.ROSE_QUARTZ_THROWING_STAR.get()));
    public static final DeferredItem<Item> ROSE_QUARTZ_GLAIVE = ITEMS.register("rose_quartz_glaive",
            () -> new SwordItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(SwordItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 4f, -2.7f))));
    public static final DeferredItem<Item> ROSE_QUARTZ_DAGGER = ITEMS.register("rose_quartz_dagger",
            () -> new DaggerItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(DaggerItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 2, -2))));
    public static final DeferredItem<Item> ROSE_QUARTZ_STAFF = ITEMS.register("rose_quartz_staff",
            () -> new StaffItem(DefensiveToolTiers.ROSE_QUARTZ, new Item.Properties().attributes(StaffItem.createAttributes(DefensiveToolTiers.ROSE_QUARTZ, 2, -2))));
    public static final DeferredItem<Item> ROSE_QUARTZ_BOW = ITEMS.register("rose_quartz_bow",
            () -> new BowItem(new Item.Properties().durability(2398)));
    public static final DeferredItem<Item> ROSE_QUARTZ_CROSSBOW = ITEMS.register("rose_quartz_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(2398)));

    public static final DeferredItem<Item> ELECTRUM_SWORD = ITEMS.register("electrum_sword",
            () -> new SwordItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(DefensiveToolTiers.ELECTRUM, 3, -2.4f))));
    public static final DeferredItem<Item> ELECTRUM_PICKAXE = ITEMS.register("electrum_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.ELECTRUM, 1, -2.8f))));
    public static final DeferredItem<Item> ELECTRUM_AXE = ITEMS.register("electrum_axe",
            () -> new AxeItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(DefensiveToolTiers.ELECTRUM, 6, -3.2f))));
    public static final DeferredItem<Item> ELECTRUM_SHOVEL = ITEMS.register("electrum_shovel",
            () -> new ShovelItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(DefensiveToolTiers.ELECTRUM, 1.5f, -3.0f))));
    public static final DeferredItem<Item> ELECTRUM_HOE = ITEMS.register("electrum_hoe",
            () -> new HoeItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(DefensiveToolTiers.ELECTRUM, 0f, -3.0f))));
    public static final DeferredItem<Item> ELECTRUM_PAXEL = ITEMS.register("electrum_paxel",
            () -> new PaxelItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(PaxelItem.createAttributes(DefensiveToolTiers.ELECTRUM, 3, -2.7f))));
    public static final DeferredItem<Item> ELECTRUM_MATTOCK = ITEMS.register("electrum_mattock",
            () -> new MattockItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(MattockItem.createAttributes(DefensiveToolTiers.ELECTRUM, 0, -1.6f))));
    public static final DeferredItem<Item> ELECTRUM_HALBERD = ITEMS.register("electrum_halberd",
            () -> new HalberdItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ELECTRUM, 4, -2.7f))));
    public static final DeferredItem<Item> ELECTRUM_POLEAXE = ITEMS.register("electrum_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(DefensiveToolTiers.ELECTRUM, 4, -2.7f))));
    public static final DeferredItem<Item> ELECTRUM_SCYTHE = ITEMS.register("electrum_scythe",
            () -> new ScytheItem(DefensiveToolTiers.ELECTRUM, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().fireResistant().attributes(ScytheItem.createAttributes(DefensiveToolTiers.ELECTRUM, 4, -2.7f))));
    public static final DeferredItem<Item> ELECTRUM_MORNINGSTAR = ITEMS.register("electrum_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.ELECTRUM, 4, -2.7f))));
    public static final DeferredItem<Item> ELECTRUM_GREATAXE = ITEMS.register("electrum_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.ELECTRUM, 7, -3.6f))));
    public static final DeferredItem<Item> ELECTRUM_GREATSWORD = ITEMS.register("electrum_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.ELECTRUM, 7, -3.6f))));
    public static final DeferredItem<Item> ELECTRUM_ZWEIHANDER = ITEMS.register("electrum_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.ELECTRUM, 6, -2.8f))));
    public static final DeferredItem<Item> ELECTRUM_HAMMER = ITEMS.register("electrum_hammer",
            () -> new HammerItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(HammerItem.createAttributes(DefensiveToolTiers.ELECTRUM, 12, -3.7f))));
    public static final DeferredItem<Item> ELECTRUM_EXCAVATOR = ITEMS.register("electrum_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.ELECTRUM, 1.5f, -3f))));
    public static final DeferredItem<Item> ELECTRUM_SPEAR = ITEMS.register("electrum_spear",
            () -> new SpearItem(new Item.Properties().durability(4062).fireResistant().attributes(SpearItem.createAttributes(9f)), DefensiveEntities.ELECTRUM_SPEAR.get()));
    public static final DeferredItem<Item> ELECTRUM_THROWING_STAR = ITEMS.register("electrum_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(4062).fireResistant().attributes(ThrowingStarItem.createAttributes(7f)), DefensiveEntities.ELECTRUM_THROWING_STAR.get()));
    public static final DeferredItem<Item> ELECTRUM_GLAIVE = ITEMS.register("electrum_glaive",
            () -> new SwordItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(DefensiveToolTiers.ELECTRUM, 4f, -2.7f))));
    public static final DeferredItem<Item> ELECTRUM_DAGGER = ITEMS.register("electrum_dagger",
            () -> new DaggerItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(DaggerItem.createAttributes(DefensiveToolTiers.ELECTRUM, 2, -2))));
    public static final DeferredItem<Item> ELECTRUM_STAFF = ITEMS.register("electrum_staff",
            () -> new StaffItem(DefensiveToolTiers.ELECTRUM, new Item.Properties().fireResistant().attributes(StaffItem.createAttributes(DefensiveToolTiers.ELECTRUM, 2, -2))));
    public static final DeferredItem<Item> ELECTRUM_BOW = ITEMS.register("electrum_bow",
            () -> new BowItem(new Item.Properties().durability(6239)));
    public static final DeferredItem<Item> ELECTRUM_CROSSBOW = ITEMS.register("electrum_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(6239)));

    public static final DeferredItem<Item> STARDUST_SWORD = ITEMS.register("stardust_sword",
            () -> new SwordItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(DefensiveToolTiers.STARDUST, 3, -2.4f))));
    public static final DeferredItem<Item> STARDUST_PICKAXE = ITEMS.register("stardust_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.STARDUST, 1, -2.8f))));
    public static final DeferredItem<Item> STARDUST_AXE = ITEMS.register("stardust_axe",
            () -> new AxeItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(DefensiveToolTiers.STARDUST, 6, -3.2f))));
    public static final DeferredItem<Item> STARDUST_SHOVEL = ITEMS.register("stardust_shovel",
            () -> new ShovelItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(DefensiveToolTiers.STARDUST, 1.5f, -3.0f))));
    public static final DeferredItem<Item> STARDUST_HOE = ITEMS.register("stardust_hoe",
            () -> new HoeItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(DefensiveToolTiers.STARDUST, 0f, -3.0f))));
    public static final DeferredItem<Item> STARDUST_PAXEL = ITEMS.register("stardust_paxel",
            () -> new PaxelItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(PaxelItem.createAttributes(DefensiveToolTiers.STARDUST, 3, -2.7f))));
    public static final DeferredItem<Item> STARDUST_MATTOCK = ITEMS.register("stardust_mattock",
            () -> new MattockItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(MattockItem.createAttributes(DefensiveToolTiers.STARDUST, 0, -1.6f))));
    public static final DeferredItem<Item> STARDUST_HALBERD = ITEMS.register("stardust_halberd",
            () -> new HalberdItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(DefensiveToolTiers.STARDUST, 4, -2.7f))));
    public static final DeferredItem<Item> STARDUST_POLEAXE = ITEMS.register("stardust_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(DefensiveToolTiers.STARDUST, 4, -2.7f))));
    public static final DeferredItem<Item> STARDUST_SCYTHE = ITEMS.register("stardust_scythe",
            () -> new ScytheItem(DefensiveToolTiers.STARDUST, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(DefensiveToolTiers.STARDUST, 4, -2.7f))));
    public static final DeferredItem<Item> STARDUST_MORNINGSTAR = ITEMS.register("stardust_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.STARDUST, 4, -2.7f))));
    public static final DeferredItem<Item> STARDUST_GREATAXE = ITEMS.register("stardust_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.STARDUST, 7, -3.6f))));
    public static final DeferredItem<Item> STARDUST_GREATSWORD = ITEMS.register("stardust_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.STARDUST, 7, -3.6f))));
    public static final DeferredItem<Item> STARDUST_ZWEIHANDER = ITEMS.register("stardust_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.STARDUST, 6, -2.8f))));
    public static final DeferredItem<Item> STARDUST_HAMMER = ITEMS.register("stardust_hammer",
            () -> new HammerItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(HammerItem.createAttributes(DefensiveToolTiers.STARDUST, 12, -3.7f))));
    public static final DeferredItem<Item> STARDUST_EXCAVATOR = ITEMS.register("stardust_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.STARDUST, 1.5f, -3f))));
    public static final DeferredItem<Item> STARDUST_SPEAR = ITEMS.register("stardust_spear",
            () -> new SpearItem(new Item.Properties().durability(6092).fireResistant().attributes(SpearItem.createAttributes(11)), DefensiveEntities.STARDUST_SPEAR.get()));
    public static final DeferredItem<Item> STARDUST_THROWING_STAR = ITEMS.register("stardust_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(6092).fireResistant().attributes(ThrowingStarItem.createAttributes(9f)), DefensiveEntities.STARDUST_THROWING_STAR.get()));
    public static final DeferredItem<Item> STARDUST_GLAIVE = ITEMS.register("stardust_glaive",
            () -> new SwordItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(DefensiveToolTiers.STARDUST, 4f, -2.7f))));
    public static final DeferredItem<Item> STARDUST_DAGGER = ITEMS.register("stardust_dagger",
            () -> new DaggerItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(DaggerItem.createAttributes(DefensiveToolTiers.STARDUST, 2, -2))));
    public static final DeferredItem<Item> STARDUST_STAFF = ITEMS.register("stardust_staff",
            () -> new StaffItem(DefensiveToolTiers.STARDUST, new Item.Properties().fireResistant().attributes(StaffItem.createAttributes(DefensiveToolTiers.STARDUST, 2, -2))));
    public static final DeferredItem<Item> STARDUST_BOW = ITEMS.register("stardust_bow",
            () -> new BowItem(new Item.Properties().durability(9357)));
    public static final DeferredItem<Item> STARDUST_CROSSBOW = ITEMS.register("stardust_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(9357)));

    public static final DeferredItem<Item> PYRAEN_SWORD = ITEMS.register("pyraen_sword",
            () -> new SwordItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(DefensiveToolTiers.PYRAEN, 3, -2.4f))));
    public static final DeferredItem<Item> PYRAEN_PICKAXE = ITEMS.register("pyraen_pickaxe",
            () -> new PickaxeItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(PickaxeItem.createAttributes(DefensiveToolTiers.PYRAEN, 1, -2.8f))));
    public static final DeferredItem<Item> PYRAEN_AXE = ITEMS.register("pyraen_axe",
            () -> new AxeItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(AxeItem.createAttributes(DefensiveToolTiers.PYRAEN, 6, -3.2f))));
    public static final DeferredItem<Item> PYRAEN_SHOVEL = ITEMS.register("pyraen_shovel",
            () -> new ShovelItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(ShovelItem.createAttributes(DefensiveToolTiers.PYRAEN, 1.5f, -3.0f))));
    public static final DeferredItem<Item> PYRAEN_HOE = ITEMS.register("pyraen_hoe",
            () -> new HoeItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(HoeItem.createAttributes(DefensiveToolTiers.PYRAEN, 0f, -3.0f))));
    public static final DeferredItem<Item> PYRAEN_PAXEL = ITEMS.register("pyraen_paxel",
            () -> new PaxelItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(PaxelItem.createAttributes(DefensiveToolTiers.PYRAEN, 3, -2.7f))));
    public static final DeferredItem<Item> PYRAEN_MATTOCK = ITEMS.register("pyraen_mattock",
            () -> new MattockItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(MattockItem.createAttributes(DefensiveToolTiers.PYRAEN, 0, -1.6f))));
    public static final DeferredItem<Item> PYRAEN_HALBERD = ITEMS.register("pyraen_halberd",
            () -> new HalberdItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(DefensiveToolTiers.PYRAEN, 4, -2.7f))));
    public static final DeferredItem<Item> PYRAEN_POLEAXE = ITEMS.register("pyraen_poleaxe",
            () -> new HalberdItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(DefensiveToolTiers.PYRAEN, 4, -2.7f))));
    public static final DeferredItem<Item> PYRAEN_SCYTHE = ITEMS.register("pyraen_scythe",
            () -> new ScytheItem(DefensiveToolTiers.PYRAEN, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().fireResistant().attributes(ScytheItem.createAttributes(DefensiveToolTiers.PYRAEN, 4, -2.7f))));
    public static final DeferredItem<Item> PYRAEN_MORNINGSTAR = ITEMS.register("pyraen_morningstar",
            () -> new MorningstarItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(MorningstarItem.createAttributes(DefensiveToolTiers.PYRAEN, 4, -2.7f))));
    public static final DeferredItem<Item> PYRAEN_GREATAXE = ITEMS.register("pyraen_greataxe",
            () -> new GreataxeItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(GreataxeItem.createAttributes(DefensiveToolTiers.PYRAEN, 7, -3.6f))));
    public static final DeferredItem<Item> PYRAEN_GREATSWORD = ITEMS.register("pyraen_greatsword",
            () -> new GreatswordItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(GreatswordItem.createAttributes(DefensiveToolTiers.PYRAEN, 7, -3.6f))));
    public static final DeferredItem<Item> PYRAEN_ZWEIHANDER = ITEMS.register("pyraen_zweihander",
            () -> new ZweihanderItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(ZweihanderItem.createAttributes(DefensiveToolTiers.PYRAEN, 6, -2.8f))));
    public static final DeferredItem<Item> PYRAEN_HAMMER = ITEMS.register("pyraen_hammer",
            () -> new HammerItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(HammerItem.createAttributes(DefensiveToolTiers.PYRAEN, 12, -3.7f))));
    public static final DeferredItem<Item> PYRAEN_EXCAVATOR = ITEMS.register("pyraen_excavator",
            () -> new ExcavatorItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(ExcavatorItem.createAttributes(DefensiveToolTiers.PYRAEN, 1.5f, -3f))));
    public static final DeferredItem<Item> PYRAEN_SPEAR = ITEMS.register("pyraen_spear",
            () -> new SpearItem(new Item.Properties().durability(7310).attributes(SpearItem.createAttributes(13)), DefensiveEntities.PYRAEN_SPEAR.get()));
    public static final DeferredItem<Item> PYRAEN_THROWING_STAR = ITEMS.register("pyraen_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(7310).fireResistant().attributes(ThrowingStarItem.createAttributes(11f)), DefensiveEntities.PYRAEN_THROWING_STAR.get()));
    public static final DeferredItem<Item> PYRAEN_GLAIVE = ITEMS.register("pyraen_glaive",
            () -> new SwordItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(DefensiveToolTiers.PYRAEN, 4f, -2.7f))));
    public static final DeferredItem<Item> PYRAEN_DAGGER = ITEMS.register("pyraen_dagger",
            () -> new DaggerItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(DaggerItem.createAttributes(DefensiveToolTiers.PYRAEN, 2, -2))));
    public static final DeferredItem<Item> PYRAEN_STAFF = ITEMS.register("pyraen_staff",
            () -> new StaffItem(DefensiveToolTiers.PYRAEN, new Item.Properties().fireResistant().attributes(StaffItem.createAttributes(DefensiveToolTiers.PYRAEN, 2, -2))));
    public static final DeferredItem<Item> PYRAEN_BOW = ITEMS.register("pyraen_bow",
            () -> new BowItem(new Item.Properties().durability(11288)));
    public static final DeferredItem<Item> PYRAEN_CROSSBOW = ITEMS.register("pyraen_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(11288)));

    public static final DeferredItem<Item> WOODEN_PAXEL = ITEMS.register("wooden_paxel",
            () -> new PaxelItem(Tiers.WOOD, new Item.Properties().attributes(PaxelItem.createAttributes(Tiers.WOOD, 3, -2.7f))));
    public static final DeferredItem<Item> WOODEN_MATTOCK = ITEMS.register("wooden_mattock",
            () -> new MattockItem(Tiers.WOOD, new Item.Properties().attributes(MattockItem.createAttributes(Tiers.WOOD, 0, -1.6f))));
    public static final DeferredItem<Item> WOODEN_HALBERD = ITEMS.register("wooden_halberd",
            () -> new HalberdItem(Tiers.WOOD, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.WOOD, 4, -2.7f))));
    public static final DeferredItem<Item> WOODEN_POLEAXE = ITEMS.register("wooden_poleaxe",
            () -> new HalberdItem(Tiers.WOOD, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.WOOD, 4, -2.7f))));
    public static final DeferredItem<Item> WOODEN_SCYTHE = ITEMS.register("wooden_scythe",
            () -> new ScytheItem(Tiers.WOOD, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(Tiers.WOOD, 4, -2.7f))));
    public static final DeferredItem<Item> WOODEN_MORNINGSTAR = ITEMS.register("wooden_morningstar",
            () -> new MorningstarItem(Tiers.WOOD, new Item.Properties().attributes(MorningstarItem.createAttributes(Tiers.WOOD, 4, -2.7f))));
    public static final DeferredItem<Item> WOODEN_GREATAXE = ITEMS.register("wooden_greataxe",
            () -> new GreataxeItem(Tiers.WOOD, new Item.Properties().attributes(GreataxeItem.createAttributes(Tiers.WOOD, 7, -3.6f))));
    public static final DeferredItem<Item> WOODEN_GREATSWORD = ITEMS.register("wooden_greatsword",
            () -> new GreatswordItem(Tiers.WOOD, new Item.Properties().attributes(GreatswordItem.createAttributes(Tiers.WOOD, 7, -3.6f))));
    public static final DeferredItem<Item> WOODEN_ZWEIHANDER = ITEMS.register("wooden_zweihander",
            () -> new ZweihanderItem(Tiers.WOOD, new Item.Properties().attributes(ZweihanderItem.createAttributes(Tiers.WOOD, 6, -2.8f))));
    public static final DeferredItem<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new HammerItem(Tiers.WOOD, new Item.Properties().attributes(HammerItem.createAttributes(Tiers.WOOD, 12, -3.7f))));
    public static final DeferredItem<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new ExcavatorItem(Tiers.WOOD, new Item.Properties().attributes(ExcavatorItem.createAttributes(Tiers.WOOD, 1.5f, -3f))));
    public static final DeferredItem<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear",
            () -> new SpearItem(new Item.Properties().durability(59).attributes(SpearItem.createAttributes(4f)), DefensiveEntities.WOODEN_SPEAR.get()));
    public static final DeferredItem<Item> WOODEN_THROWING_STAR = ITEMS.register("wooden_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(59).attributes(ThrowingStarItem.createAttributes(1.5f)), DefensiveEntities.WOODEN_THROWING_STAR.get()));
    public static final DeferredItem<Item> WOODEN_GLAIVE = ITEMS.register("wooden_glaive",
            () -> new SwordItem(Tiers.WOOD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.WOOD, 4f, -2.7f))));
    public static final DeferredItem<Item> WOODEN_DAGGER = ITEMS.register("wooden_dagger",
            () -> new DaggerItem(Tiers.WOOD, new Item.Properties().attributes(DaggerItem.createAttributes(Tiers.WOOD, 2, -2))));
    public static final DeferredItem<Item> WOODEN_STAFF = ITEMS.register("wooden_staff",
            () -> new StaffItem(Tiers.WOOD, new Item.Properties().attributes(StaffItem.createAttributes(Tiers.WOOD, 2, -2))));
    public static final DeferredItem<Item> WOODEN_BOW = ITEMS.register("wooden_bow",
            () -> new BowItem(new Item.Properties().durability(91)));
    public static final DeferredItem<Item> WOODEN_CROSSBOW = ITEMS.register("wooden_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(91)));

    public static final DeferredItem<Item> STONE_PAXEL = ITEMS.register("stone_paxel",
            () -> new PaxelItem(Tiers.STONE, new Item.Properties().attributes(PaxelItem.createAttributes(Tiers.STONE, 3, -2.7f))));
    public static final DeferredItem<Item> STONE_MATTOCK = ITEMS.register("stone_mattock",
            () -> new MattockItem(Tiers.STONE, new Item.Properties().attributes(MattockItem.createAttributes(Tiers.STONE, 0, -1.6f))));
    public static final DeferredItem<Item> STONE_HALBERD = ITEMS.register("stone_halberd",
            () -> new HalberdItem(Tiers.STONE, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.STONE, 4, -2.7f))));
    public static final DeferredItem<Item> STONE_POLEAXE = ITEMS.register("stone_poleaxe",
            () -> new HalberdItem(Tiers.STONE, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.STONE, 4, -2.7f))));
    public static final DeferredItem<Item> STONE_SCYTHE = ITEMS.register("stone_scythe",
            () -> new ScytheItem(Tiers.STONE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(Tiers.STONE, 4, -2.7f))));
    public static final DeferredItem<Item> STONE_MORNINGSTAR = ITEMS.register("stone_morningstar",
            () -> new MorningstarItem(Tiers.STONE, new Item.Properties().attributes(MorningstarItem.createAttributes(Tiers.STONE, 4, -2.7f))));
    public static final DeferredItem<Item> STONE_GREATAXE = ITEMS.register("stone_greataxe",
            () -> new GreataxeItem(Tiers.STONE, new Item.Properties().attributes(GreataxeItem.createAttributes(Tiers.STONE, 7, -3.6f))));
    public static final DeferredItem<Item> STONE_GREATSWORD = ITEMS.register("stone_greatsword",
            () -> new GreatswordItem(Tiers.STONE, new Item.Properties().attributes(GreatswordItem.createAttributes(Tiers.STONE, 7, -3.6f))));
    public static final DeferredItem<Item> STONE_ZWEIHANDER = ITEMS.register("stone_zweihander",
            () -> new ZweihanderItem(Tiers.STONE, new Item.Properties().attributes(ZweihanderItem.createAttributes(Tiers.STONE, 6, -2.8f))));
    public static final DeferredItem<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(Tiers.STONE, new Item.Properties().attributes(HammerItem.createAttributes(Tiers.STONE, 12, -3.7f))));
    public static final DeferredItem<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new ExcavatorItem(Tiers.STONE, new Item.Properties().attributes(ExcavatorItem.createAttributes(Tiers.STONE, 1.5f, -3f))));
    public static final DeferredItem<Item> STONE_SPEAR = ITEMS.register("stone_spear",
            () -> new SpearItem(new Item.Properties().durability(131).attributes(SpearItem.createAttributes(5)), DefensiveEntities.STONE_SPEAR.get()));
    public static final DeferredItem<Item> STONE_THROWING_STAR = ITEMS.register("stone_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(131).attributes(ThrowingStarItem.createAttributes(2f)), DefensiveEntities.STONE_THROWING_STAR.get()));
    public static final DeferredItem<Item> STONE_GLAIVE = ITEMS.register("stone_glaive",
            () -> new SwordItem(Tiers.STONE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.STONE, 4f, -2.7f))));
    public static final DeferredItem<Item> STONE_DAGGER = ITEMS.register("stone_dagger",
            () -> new DaggerItem(Tiers.STONE, new Item.Properties().attributes(DaggerItem.createAttributes(Tiers.STONE, 2, -2))));
    public static final DeferredItem<Item> STONE_STAFF = ITEMS.register("stone_staff",
            () -> new StaffItem(Tiers.STONE, new Item.Properties().attributes(StaffItem.createAttributes(Tiers.STONE, 2, -2))));
    public static final DeferredItem<Item> STONE_BOW = ITEMS.register("stone_bow",
            () -> new BowItem(new Item.Properties().durability(201)));
    public static final DeferredItem<Item> STONE_CROSSBOW = ITEMS.register("stone_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(201)));

    public static final DeferredItem<Item> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new PaxelItem(Tiers.IRON, new Item.Properties().attributes(PaxelItem.createAttributes(Tiers.IRON, 3, -2.7f))));
    public static final DeferredItem<Item> IRON_MATTOCK = ITEMS.register("iron_mattock",
            () -> new MattockItem(Tiers.IRON, new Item.Properties().attributes(MattockItem.createAttributes(Tiers.IRON, 0, -1.6f))));
    public static final DeferredItem<Item> IRON_HALBERD = ITEMS.register("iron_halberd",
            () -> new HalberdItem(Tiers.IRON, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.IRON, 4, -2.7f))));
    public static final DeferredItem<Item> IRON_POLEAXE = ITEMS.register("iron_poleaxe",
            () -> new HalberdItem(Tiers.IRON, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.IRON, 4, -2.7f))));
    public static final DeferredItem<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new ScytheItem(Tiers.IRON, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(Tiers.IRON, 4, -2.7f))));
    public static final DeferredItem<Item> IRON_MORNINGSTAR = ITEMS.register("iron_morningstar",
            () -> new MorningstarItem(Tiers.IRON, new Item.Properties().attributes(MorningstarItem.createAttributes(Tiers.IRON, 4, -2.7f))));
    public static final DeferredItem<Item> IRON_GREATAXE = ITEMS.register("iron_greataxe",
            () -> new GreataxeItem(Tiers.IRON, new Item.Properties().attributes(GreataxeItem.createAttributes(Tiers.IRON, 7, -3.6f))));
    public static final DeferredItem<Item> IRON_GREATSWORD = ITEMS.register("iron_greatsword",
            () -> new GreatswordItem(Tiers.IRON, new Item.Properties().attributes(GreatswordItem.createAttributes(Tiers.IRON, 7, -3.6f))));
    public static final DeferredItem<Item> IRON_ZWEIHANDER = ITEMS.register("iron_zweihander",
            () -> new ZweihanderItem(Tiers.IRON, new Item.Properties().attributes(ZweihanderItem.createAttributes(Tiers.IRON, 6, -2.8f))));
    public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(Tiers.IRON, new Item.Properties().attributes(HammerItem.createAttributes(Tiers.IRON, 12, -3.7f))));
    public static final DeferredItem<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new ExcavatorItem(Tiers.IRON, new Item.Properties().attributes(ExcavatorItem.createAttributes(Tiers.IRON, 1.5f, -3f))));
    public static final DeferredItem<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new SpearItem(new Item.Properties().durability(250).attributes(SpearItem.createAttributes(6)), DefensiveEntities.IRON_SPEAR.get()));
    public static final DeferredItem<Item> IRON_THROWING_STAR = ITEMS.register("iron_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(250).attributes(ThrowingStarItem.createAttributes(3f)), DefensiveEntities.IRON_THROWING_STAR.get()));
    public static final DeferredItem<Item> IRON_GLAIVE = ITEMS.register("iron_glaive",
            () -> new SwordItem(Tiers.IRON, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.IRON, 4f, -2.7f))));
    public static final DeferredItem<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new DaggerItem(Tiers.IRON, new Item.Properties().attributes(DaggerItem.createAttributes(Tiers.IRON, 2, -2))));
    public static final DeferredItem<Item> IRON_STAFF = ITEMS.register("iron_staff",
            () -> new StaffItem(Tiers.IRON, new Item.Properties().attributes(StaffItem.createAttributes(Tiers.IRON, 2, -2))));
    public static final DeferredItem<Item> IRON_BOW = ITEMS.register("iron_bow",
            () -> new BowItem(new Item.Properties().durability(384)));
    public static final DeferredItem<Item> IRON_CROSSBOW = ITEMS.register("iron_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(384)));

    public static final DeferredItem<Item> GOLDEN_PAXEL = ITEMS.register("golden_paxel",
            () -> new PaxelItem(Tiers.GOLD, new Item.Properties().attributes(PaxelItem.createAttributes(Tiers.GOLD, 3, -2.7f))));
    public static final DeferredItem<Item> GOLDEN_MATTOCK = ITEMS.register("golden_mattock",
            () -> new MattockItem(Tiers.GOLD, new Item.Properties().attributes(MattockItem.createAttributes(Tiers.GOLD, 0, -1.6f))));
    public static final DeferredItem<Item> GOLDEN_HALBERD = ITEMS.register("golden_halberd",
            () -> new HalberdItem(Tiers.GOLD, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.GOLD, 4, -2.7f))));
    public static final DeferredItem<Item> GOLDEN_POLEAXE = ITEMS.register("golden_poleaxe",
            () -> new HalberdItem(Tiers.GOLD, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.GOLD, 4, -2.7f))));
    public static final DeferredItem<Item> GOLDEN_SCYTHE = ITEMS.register("golden_scythe",
            () -> new ScytheItem(Tiers.GOLD, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(Tiers.GOLD, 4, -2.7f))));
    public static final DeferredItem<Item> GOLDEN_MORNINGSTAR = ITEMS.register("golden_morningstar",
            () -> new MorningstarItem(Tiers.GOLD, new Item.Properties().attributes(MorningstarItem.createAttributes(Tiers.GOLD, 4, -2.7f))));
    public static final DeferredItem<Item> GOLDEN_GREATAXE = ITEMS.register("golden_greataxe",
            () -> new GreataxeItem(Tiers.GOLD, new Item.Properties().attributes(GreataxeItem.createAttributes(Tiers.GOLD, 7, -3.6f))));
    public static final DeferredItem<Item> GOLDEN_GREATSWORD = ITEMS.register("golden_greatsword",
            () -> new GreatswordItem(Tiers.GOLD, new Item.Properties().attributes(GreatswordItem.createAttributes(Tiers.GOLD, 7, -3.6f))));
    public static final DeferredItem<Item> GOLDEN_ZWEIHANDER = ITEMS.register("golden_zweihander",
            () -> new ZweihanderItem(Tiers.GOLD, new Item.Properties().attributes(ZweihanderItem.createAttributes(Tiers.GOLD, 6, -2.8f))));
    public static final DeferredItem<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer",
            () -> new HammerItem(Tiers.DIAMOND, new Item.Properties().attributes(HammerItem.createAttributes(Tiers.DIAMOND, 12, -3.7f))));
    public static final DeferredItem<Item> GOLDEN_EXCAVATOR = ITEMS.register("golden_excavator",
            () -> new ExcavatorItem(Tiers.GOLD, new Item.Properties().attributes(ExcavatorItem.createAttributes(Tiers.GOLD, 1.5f, -3f))));
    public static final DeferredItem<Item> GOLDEN_SPEAR = ITEMS.register("golden_spear",
            () -> new SpearItem(new Item.Properties().durability(32).attributes(SpearItem.createAttributes(4)), DefensiveEntities.GOLDEN_SPEAR.get()));
    public static final DeferredItem<Item> GOLDEN_THROWING_STAR = ITEMS.register("golden_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(32).attributes(ThrowingStarItem.createAttributes(1.5f)), DefensiveEntities.GOLDEN_THROWING_STAR.get()));
    public static final DeferredItem<Item> GOLDEN_GLAIVE = ITEMS.register("golden_glaive",
            () -> new SwordItem(Tiers.GOLD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.GOLD, 4f, -2.7f))));
    public static final DeferredItem<Item> GOLDEN_DAGGER = ITEMS.register("golden_dagger",
            () -> new DaggerItem(Tiers.GOLD, new Item.Properties().attributes(DaggerItem.createAttributes(Tiers.GOLD, 2, -2))));
    public static final DeferredItem<Item> GOLDEN_STAFF = ITEMS.register("golden_staff",
            () -> new StaffItem(Tiers.GOLD, new Item.Properties().attributes(StaffItem.createAttributes(Tiers.GOLD, 2, -2))));
    public static final DeferredItem<Item> GOLDEN_BOW = ITEMS.register("golden_bow",
            () -> new BowItem(new Item.Properties().durability(49)));
    public static final DeferredItem<Item> GOLDEN_CROSSBOW = ITEMS.register("golden_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(49)));

    public static final DeferredItem<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, new Item.Properties().attributes(PaxelItem.createAttributes(Tiers.DIAMOND, 3, -2.7f))));
    public static final DeferredItem<Item> DIAMOND_MATTOCK = ITEMS.register("diamond_mattock",
            () -> new MattockItem(Tiers.DIAMOND, new Item.Properties().attributes(MattockItem.createAttributes(Tiers.DIAMOND, 0, -1.6f))));
    public static final DeferredItem<Item> DIAMOND_HALBERD = ITEMS.register("diamond_halberd",
            () -> new HalberdItem(Tiers.DIAMOND, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.DIAMOND, 4, -2.7f))));
    public static final DeferredItem<Item> DIAMOND_POLEAXE = ITEMS.register("diamond_poleaxe",
            () -> new HalberdItem(Tiers.DIAMOND, new Item.Properties().attributes(HalberdItem.createAttributes(Tiers.DIAMOND, 4, -2.7f))));
    public static final DeferredItem<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new ScytheItem(Tiers.DIAMOND, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().attributes(ScytheItem.createAttributes(Tiers.DIAMOND, 4, -2.7f))));
    public static final DeferredItem<Item> DIAMOND_MORNINGSTAR = ITEMS.register("diamond_morningstar",
            () -> new MorningstarItem(Tiers.DIAMOND, new Item.Properties().attributes(MorningstarItem.createAttributes(Tiers.DIAMOND, 4, -2.7f))));
    public static final DeferredItem<Item> DIAMOND_GREATAXE = ITEMS.register("diamond_greataxe",
            () -> new GreataxeItem(Tiers.DIAMOND, new Item.Properties().attributes(GreataxeItem.createAttributes(Tiers.DIAMOND, 7, -3.6f))));
    public static final DeferredItem<Item> DIAMOND_GREATSWORD = ITEMS.register("diamond_greatsword",
            () -> new GreatswordItem(Tiers.DIAMOND, new Item.Properties().attributes(GreatswordItem.createAttributes(Tiers.DIAMOND, 7, -3.6f))));
    public static final DeferredItem<Item> DIAMOND_ZWEIHANDER = ITEMS.register("diamond_zweihander",
            () -> new ZweihanderItem(Tiers.DIAMOND, new Item.Properties().attributes(ZweihanderItem.createAttributes(Tiers.DIAMOND, 6, -2.8f))));
    public static final DeferredItem<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND, new Item.Properties().attributes(HammerItem.createAttributes(Tiers.DIAMOND, 12, -3.7f))));
    public static final DeferredItem<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new ExcavatorItem(Tiers.DIAMOND, new Item.Properties().attributes(ExcavatorItem.createAttributes(Tiers.DIAMOND, 1.5f, -3f))));
    public static final DeferredItem<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear",
            () -> new SpearItem(new Item.Properties().durability(1561).attributes(SpearItem.createAttributes(7)), DefensiveEntities.DIAMOND_SPEAR.get()));
    public static final DeferredItem<Item> DIAMOND_THROWING_STAR = ITEMS.register("diamond_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(1561).attributes(ThrowingStarItem.createAttributes(5f)), DefensiveEntities.DIAMOND_THROWING_STAR.get()));
    public static final DeferredItem<Item> DIAMOND_GLAIVE = ITEMS.register("diamond_glaive",
            () -> new SwordItem(Tiers.DIAMOND, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.DIAMOND, 4f, -2.7f))));
    public static final DeferredItem<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new DaggerItem(Tiers.DIAMOND, new Item.Properties().attributes(DaggerItem.createAttributes(Tiers.DIAMOND, 2, -2))));
    public static final DeferredItem<Item> DIAMOND_STAFF = ITEMS.register("diamond_staff",
            () -> new StaffItem(Tiers.DIAMOND, new Item.Properties().attributes(StaffItem.createAttributes(Tiers.DIAMOND, 2, -2))));
    public static final DeferredItem<Item> DIAMOND_BOW = ITEMS.register("diamond_bow",
            () -> new BowItem(new Item.Properties().durability(2398)));
    public static final DeferredItem<Item> DIAMOND_CROSSBOW = ITEMS.register("diamond_crossbow",
            () -> new CrossbowItem(new Item.Properties().durability(2398)));

    public static final DeferredItem<Item> NETHERITE_PAXEL = ITEMS.register("netherite_paxel",
            () -> new PaxelItem(Tiers.NETHERITE, new Item.Properties().attributes(PaxelItem.createAttributes(Tiers.NETHERITE, 3, -2.7f))));
    public static final DeferredItem<Item> NETHERITE_MATTOCK = ITEMS.register("netherite_mattock",
            () -> new MattockItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(MattockItem.createAttributes(Tiers.NETHERITE, 0, -1.6f))));
    public static final DeferredItem<Item> NETHERITE_HALBERD = ITEMS.register("netherite_halberd",
            () -> new HalberdItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(Tiers.NETHERITE, 4, -2.7f))));
    public static final DeferredItem<Item> NETHERITE_POLEAXE = ITEMS.register("netherite_poleaxe",
            () -> new HalberdItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(HalberdItem.createAttributes(Tiers.NETHERITE, 4, -2.7f))));
    public static final DeferredItem<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe",
            () -> new ScytheItem(Tiers.NETHERITE, BlockTags.MINEABLE_WITH_HOE, new Item.Properties().fireResistant().attributes(ScytheItem.createAttributes(Tiers.NETHERITE, 4, -2.7f))));
    public static final DeferredItem<Item> NETHERITE_MORNINGSTAR = ITEMS.register("netherite_morningstar",
            () -> new MorningstarItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(MorningstarItem.createAttributes(Tiers.NETHERITE, 4, -2.7f))));
    public static final DeferredItem<Item> NETHERITE_GREATAXE = ITEMS.register("netherite_greataxe",
            () -> new GreataxeItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(GreataxeItem.createAttributes(Tiers.NETHERITE, 7, -3.6f))));
    public static final DeferredItem<Item> NETHERITE_GREATSWORD = ITEMS.register("netherite_greatsword",
            () -> new GreatswordItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(GreatswordItem.createAttributes(Tiers.NETHERITE, 7, -3.6f))));
    public static final DeferredItem<Item> NETHERITE_ZWEIHANDER = ITEMS.register("netherite_zweihander",
            () -> new ZweihanderItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(ZweihanderItem.createAttributes(Tiers.NETHERITE, 6, -2.8f))));
    public static final DeferredItem<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(HammerItem.createAttributes(Tiers.NETHERITE, 12, -3.7f))));
    public static final DeferredItem<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new ExcavatorItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(ExcavatorItem.createAttributes(Tiers.NETHERITE, 1.5f, -3f))));
    public static final DeferredItem<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear",
            () -> new SpearItem(new Item.Properties().durability(2031).fireResistant().attributes(SpearItem.createAttributes(8)), DefensiveEntities.NETHERITE_SPEAR.get()));
    public static final DeferredItem<Item> NETHERITE_THROWING_STAR = ITEMS.register("netherite_throwing_star",
            () -> new ThrowingStarItem(new Item.Properties().durability(2031).fireResistant().attributes(ThrowingStarItem.createAttributes(6f)), DefensiveEntities.NETHERITE_THROWING_STAR.get()));
    public static final DeferredItem<Item> NETHERITE_GLAIVE = ITEMS.register("netherite_glaive",
            () -> new SwordItem(Tiers.NETHERITE, new Item.Properties().fireResistant().attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4f, -2.7f))));
    public static final DeferredItem<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            () -> new DaggerItem(Tiers.NETHERITE, new Item.Properties().attributes(DaggerItem.createAttributes(Tiers.NETHERITE, 2, -2))));
    public static final DeferredItem<Item> NETHERITE_STAFF = ITEMS.register("netherite_staff",
            () -> new StaffItem(Tiers.NETHERITE, new Item.Properties().attributes(StaffItem.createAttributes(Tiers.NETHERITE, 2, -2))));
    public static final DeferredItem<Item> NETHERITE_BOW = ITEMS.register("netherite_bow",
            () -> new BowItem(new Item.Properties().fireResistant().durability(3120)));
    public static final DeferredItem<Item> NETHERITE_CROSSBOW = ITEMS.register("netherite_crossbow",
            () -> new CrossbowItem(new Item.Properties().fireResistant().durability(3120)));


    public static final DeferredItem<Item> ALUMINUM_ARROW = ITEMS.register("aluminum_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2f, DefensiveEntities.ALUMINUM_ARROW.get()));
    public static final DeferredItem<Item> SILVER_ARROW = ITEMS.register("silver_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.2f, DefensiveEntities.SILVER_ARROW.get()));
    public static final DeferredItem<Item> PLATINUM_ARROW = ITEMS.register("platinum_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.4f, DefensiveEntities.PLATINUM_ARROW.get()));
    public static final DeferredItem<Item> STEEL_ARROW = ITEMS.register("steel_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.6f, DefensiveEntities.STEEL_ARROW.get()));
    public static final DeferredItem<Item> COPPER_ARROW = ITEMS.register("copper_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2f, DefensiveEntities.COPPER_ARROW.get()));
    public static final DeferredItem<Item> ZINC_ARROW = ITEMS.register("zinc_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.2f, DefensiveEntities.ZINC_ARROW.get()));
    public static final DeferredItem<Item> BRASS_ARROW = ITEMS.register("brass_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.4f, DefensiveEntities.BRASS_ARROW.get()));
    public static final DeferredItem<Item> ROSE_QUARTZ_ARROW = ITEMS.register("rose_quartz_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 3f, DefensiveEntities.ROSE_QUARTZ_ARROW.get()));
    public static final DeferredItem<Item> ELECTRUM_ARROW = ITEMS.register("electrum_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 4f, DefensiveEntities.ELECTRUM_ARROW.get()));
    public static final DeferredItem<Item> STARDUST_ARROW = ITEMS.register("stardust_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 4.4f, DefensiveEntities.STARDUST_ARROW.get()));
    public static final DeferredItem<Item> PYRAEN_ARROW = ITEMS.register("pyraen_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 4.8f, DefensiveEntities.PYRAEN_ARROW.get()));
    public static final DeferredItem<Item> WOODEN_ARROW = ITEMS.register("wooden_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 1.2f, DefensiveEntities.WOODEN_ARROW.get()));
    public static final DeferredItem<Item> STONE_ARROW = ITEMS.register("stone_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 1.4f, DefensiveEntities.STONE_ARROW.get()));
    public static final DeferredItem<Item> IRON_ARROW = ITEMS.register("iron_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.2f, DefensiveEntities.IRON_ARROW.get()));
    public static final DeferredItem<Item> GOLDEN_ARROW = ITEMS.register("golden_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 1.2f, DefensiveEntities.GOLDEN_ARROW.get()));
    public static final DeferredItem<Item> DIAMOND_ARROW = ITEMS.register("diamond_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.6f, DefensiveEntities.DIAMOND_ARROW.get()));
    public static final DeferredItem<Item> NETHERITE_ARROW = ITEMS.register("netherite_arrow", () -> new DefensiveArrowItem(new Item.Properties(), 2.8f, DefensiveEntities.NETHERITE_ARROW.get()));

    public static final DeferredItem<Item> ALUMINUM_ARROW_HEAD = ITEMS.register("aluminum_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_ARROW_HEAD = ITEMS.register("silver_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_ARROW_HEAD = ITEMS.register("platinum_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_ARROW_HEAD = ITEMS.register("steel_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_ARROW_HEAD = ITEMS.register("copper_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_ARROW_HEAD = ITEMS.register("zinc_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_ARROW_HEAD = ITEMS.register("brass_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_QUARTZ_ARROW_HEAD = ITEMS.register("rose_quartz_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_ARROW_HEAD = ITEMS.register("wooden_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_ARROW_HEAD = ITEMS.register("stone_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_ARROW_HEAD = ITEMS.register("iron_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_ARROW_HEAD = ITEMS.register("golden_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_ARROW_HEAD = ITEMS.register("diamond_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_ARROW_HEAD = ITEMS.register("netherite_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_ARROW_HEAD = ITEMS.register("electrum_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARDUST_ARROW_HEAD = ITEMS.register("stardust_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PYRAEN_ARROW_HEAD = ITEMS.register("pyraen_arrow_head", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALUMINUM_STRAIGHT_ARROW_HEAD = ITEMS.register("aluminum_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_STRAIGHT_ARROW_HEAD = ITEMS.register("silver_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_STRAIGHT_ARROW_HEAD = ITEMS.register("platinum_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_STRAIGHT_ARROW_HEAD = ITEMS.register("steel_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_STRAIGHT_ARROW_HEAD = ITEMS.register("copper_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_STRAIGHT_ARROW_HEAD = ITEMS.register("zinc_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_STRAIGHT_ARROW_HEAD = ITEMS.register("brass_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_QUARTZ_STRAIGHT_ARROW_HEAD = ITEMS.register("rose_quartz_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_STRAIGHT_ARROW_HEAD = ITEMS.register("wooden_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_STRAIGHT_ARROW_HEAD = ITEMS.register("stone_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_STRAIGHT_ARROW_HEAD = ITEMS.register("iron_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_STRAIGHT_ARROW_HEAD = ITEMS.register("golden_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_STRAIGHT_ARROW_HEAD = ITEMS.register("diamond_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_STRAIGHT_ARROW_HEAD = ITEMS.register("netherite_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_STRAIGHT_ARROW_HEAD = ITEMS.register("electrum_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARDUST_STRAIGHT_ARROW_HEAD = ITEMS.register("stardust_straight_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PYRAEN_STRAIGHT_ARROW_HEAD = ITEMS.register("pyraen_straight_arrow_head", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALUMINUM_HOOKED_ARROW_HEAD = ITEMS.register("aluminum_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_HOOKED_ARROW_HEAD = ITEMS.register("silver_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_HOOKED_ARROW_HEAD = ITEMS.register("platinum_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HOOKED_ARROW_HEAD = ITEMS.register("steel_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_HOOKED_ARROW_HEAD = ITEMS.register("copper_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_HOOKED_ARROW_HEAD = ITEMS.register("zinc_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_HOOKED_ARROW_HEAD = ITEMS.register("brass_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_QUARTZ_HOOKED_ARROW_HEAD = ITEMS.register("rose_quartz_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_HOOKED_ARROW_HEAD = ITEMS.register("wooden_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_HOOKED_ARROW_HEAD = ITEMS.register("stone_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_HOOKED_ARROW_HEAD = ITEMS.register("iron_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_HOOKED_ARROW_HEAD = ITEMS.register("golden_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_HOOKED_ARROW_HEAD = ITEMS.register("diamond_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_HOOKED_ARROW_HEAD = ITEMS.register("netherite_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_HOOKED_ARROW_HEAD = ITEMS.register("electrum_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARDUST_HOOKED_ARROW_HEAD = ITEMS.register("stardust_hooked_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PYRAEN_HOOKED_ARROW_HEAD = ITEMS.register("pyraen_hooked_arrow_head", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ALUMINUM_BARBED_ARROW_HEAD = ITEMS.register("aluminum_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_BARBED_ARROW_HEAD = ITEMS.register("silver_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_BARBED_ARROW_HEAD = ITEMS.register("platinum_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BARBED_ARROW_HEAD = ITEMS.register("steel_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_BARBED_ARROW_HEAD = ITEMS.register("copper_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_BARBED_ARROW_HEAD = ITEMS.register("zinc_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_BARBED_ARROW_HEAD = ITEMS.register("brass_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSE_QUARTZ_BARBED_ARROW_HEAD = ITEMS.register("rose_quartz_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WOODEN_BARBED_ARROW_HEAD = ITEMS.register("wooden_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STONE_BARBED_ARROW_HEAD = ITEMS.register("stone_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_BARBED_ARROW_HEAD = ITEMS.register("iron_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_BARBED_ARROW_HEAD = ITEMS.register("golden_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_BARBED_ARROW_HEAD = ITEMS.register("diamond_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_BARBED_ARROW_HEAD = ITEMS.register("netherite_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_BARBED_ARROW_HEAD = ITEMS.register("electrum_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STARDUST_BARBED_ARROW_HEAD = ITEMS.register("stardust_barbed_arrow_head", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PYRAEN_BARBED_ARROW_HEAD = ITEMS.register("pyraen_barbed_arrow_head", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SUPERHEATED_BLAZE_SPAWN_EGG = ITEMS.register("superheated_blaze_spawn_egg", () -> new DeferredSpawnEggItem(DefensiveEntities.SUPERHEATED_BLAZE, 4567512, 4567512, new Item.Properties()));
    public static final DeferredItem<Item> SUPERHEATED_BLAZE_ROD = ITEMS.register("superheated_blaze_rod", () -> new Item(new Item.Properties()));

//    public static final DeferredItem<Item> OIL_SCANNER = ITEMS.register("oil_scanner", () -> new OilScannerItem(new Item.Properties().durability(50)));
//    public static final DeferredItem<Item> NATURAL_GAS_SCANNER = ITEMS.register("natural_gas_scanner", () -> new NaturalGasScannerItem(new Item.Properties().durability(50)));

    public static final DeferredItem<Item> CRUDE_OIL_BUCKET = ITEMS.register("crude_oil_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_CRUDE_OIL.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> DIRTY_RAW_CRUDE_OIL_BUCKET = ITEMS.register("dirty_raw_crude_oil_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_DIRTY_RAW_CRUDE_OIL.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> RAW_CRUDE_OIL_BUCKET = ITEMS.register("raw_crude_oil_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_RAW_CRUDE_OIL.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> NATURAL_GAS_BUCKET = ITEMS.register("natural_gas_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_NATURAL_GAS.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> RAW_NATURAL_GAS_BUCKET = ITEMS.register("raw_natural_gas_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_RAW_NATURAL_GAS.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> GASOLINE_BUCKET = ITEMS.register("gasoline_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_GASOLINE.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> KEROSENE_BUCKET = ITEMS.register("kerosene_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_KEROSENE.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> DIESEL_BUCKET = ITEMS.register("diesel_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_DIESEL.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> BITUMEN_BUCKET = ITEMS.register("bitumen_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_BITUMEN.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> BUTANE_BUCKET = ITEMS.register("butane_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_BUTANE.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> PROPANE_BUCKET = ITEMS.register("propane_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_PROPANE.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> ETHANE_BUCKET = ITEMS.register("ethane_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_ETHANE.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> METHANE_BUCKET = ITEMS.register("methane_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_METHANE.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> CREOSOTE_BUCKET = ITEMS.register("creosote_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_CREOSOTE.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> STEAM_BUCKET = ITEMS.register("steam_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_STEAM.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> HYDROGEN_BUCKET = ITEMS.register("hydrogen_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_HYDROGEN.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> OXYGEN_BUCKET = ITEMS.register("oxygen_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_OXYGEN.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final DeferredItem<Item> MUSTARD_GAS_BUCKET = ITEMS.register("mustard_gas_bucket", () -> new BucketItem(DefensiveFluids.SOURCE_MUSTARD_GAS.value(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    public static final DeferredItem<Item> AMMONIA = ITEMS.register("ammonia", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FORMALDEHYDE = ITEMS.register("formaldehyde", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HEXAMINE = ITEMS.register("hexamine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> METHANOL = ITEMS.register("methanol", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CARBON_MONOXIDE = ITEMS.register("carbon_monoxide", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETHYLENE = ITEMS.register("ethylene", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR_DICHLORIDE = ITEMS.register("sulfur_dichloride", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHLORINE = ITEMS.register("chlorine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR = ITEMS.register("sulfur", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SALT = ITEMS.register("salt", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
