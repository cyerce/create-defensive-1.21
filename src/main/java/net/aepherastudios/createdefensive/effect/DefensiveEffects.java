package net.aepherastudios.createdefensive.effect;

import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.effect.custom.*;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DefensiveEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, CreateDefensive.MOD_ID);

    public static final Holder<MobEffect> SILVER_ARMOR = MOB_EFFECTS.register("silver_armor",
            () -> new SilverArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> PLATINUM_ARMOR = MOB_EFFECTS.register("platinum_armor",
            () -> new PlatinumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> GOLD_ARMOR = MOB_EFFECTS.register("gold_armor",
            () -> new GoldArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> ROSE_GOLD_ARMOR = MOB_EFFECTS.register("rose_gold_armor",
            () -> new RoseGoldArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> VIOLET_GOLD_ARMOR = MOB_EFFECTS.register("violet_gold_armor",
            () -> new VioletGoldArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> ELECTRUM_ARMOR = MOB_EFFECTS.register("electrum_armor",
            () -> new ElectrumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> REDSTONE_ARMOR = MOB_EFFECTS.register("redstone_armor",
            () -> new ElectrumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> UNSTABLE_ROSE_GOLD_ARMOR = MOB_EFFECTS.register("unstable_rose_gold_armor",
            () -> new ElectrumArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> STEEL_ARMOR = MOB_EFFECTS.register("steel_armor",
            () -> new SteelArmorEffect(MobEffectCategory.BENEFICIAL, 25518819));

    public static final Holder<MobEffect> LACERATION = MOB_EFFECTS.register("laceration",
            () -> new LacerationEffect(MobEffectCategory.HARMFUL, 7208960));

    public static final Holder<MobEffect> CRYSTALLIZED_EXPERIENCE = MOB_EFFECTS.register("crystallized_experience",
            () -> new CrystallizedExperienceEffect(MobEffectCategory.HARMFUL, 10551193));

    public static final Holder<MobEffect> CRYSTALLIZED_REDSTONE = MOB_EFFECTS.register("crystallized_redstone",
            () -> new CrystallizedRedstoneEffect(MobEffectCategory.HARMFUL, 16711680));

    public static final Holder<MobEffect> ALUMINUM_POWER = MOB_EFFECTS.register("aluminum_power",
            () -> new AluminumPowerEffect(MobEffectCategory.BENEFICIAL, 16711680));

    public static final Holder<MobEffect> STEEL_POWER = MOB_EFFECTS.register("steel_power",
            () -> new SteelPowerEffect(MobEffectCategory.BENEFICIAL, 16711680));

    public static final Holder<MobEffect> NETHERITE_POWER = MOB_EFFECTS.register("netherite_power",
            () -> new NetheritePowerEffect(MobEffectCategory.BENEFICIAL, 16711680));

    public static final Holder<MobEffect> LEAD_POISONING = MOB_EFFECTS.register("lead_poisoning",
            () -> new LeadPoisoningEffect(MobEffectCategory.HARMFUL, 17637124));

    public static final Holder<MobEffect> TARRED = MOB_EFFECTS.register("tarred",
            () -> new TarredEffect(MobEffectCategory.HARMFUL, 1710618));

    public static final Holder<MobEffect> EXECUTION = MOB_EFFECTS.register("execution",
            () -> new BlankEffect(MobEffectCategory.HARMFUL, 10551193));

    public static final Holder<MobEffect> HALBERDSFURY = MOB_EFFECTS.register("halberdsfury",
            () -> new BlankEffect(MobEffectCategory.BENEFICIAL, 10551193));



    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
