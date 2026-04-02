package net.aepherastudios.createdefensive.item.custom;

import net.aepherastudios.createdefensive.entity.custom.ArrowEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class DefensiveArrowItem extends ArrowItem {

    private float damage;
    private final EntityType<? extends ArrowEntity> entityType;

    public DefensiveArrowItem(Properties properties, float damage, EntityType<? extends ArrowEntity> entityType) {
        super(properties);
        this.damage = damage;
        this.entityType = entityType;
    }

    public AbstractArrow createArrow(Level level, ItemStack ammo, LivingEntity shooter, @Nullable ItemStack weapon) {
        ArrowEntity arrow = new ArrowEntity(entityType, shooter, level, ammo.copyWithCount(1), weapon);
        arrow.setBaseDamage(damage);
        return arrow;
    }
}
