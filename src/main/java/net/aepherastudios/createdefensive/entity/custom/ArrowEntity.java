package net.aepherastudios.createdefensive.entity.custom;

import net.aepherastudios.createdefensive.entity.DefensiveEntities;
import net.aepherastudios.createdefensive.item.DefensiveItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;

public class ArrowEntity extends AbstractArrow {
    public ArrowEntity(EntityType<? extends AbstractArrow> pArrow, Level pLevel) {
        super(pArrow, pLevel);
    }

    public ArrowEntity(EntityType<? extends AbstractArrow> arrow, LivingEntity owner, Level level, ItemStack pickupItemStack, @Nullable ItemStack firedFromWeapon){
        super(arrow, owner, level, pickupItemStack, firedFromWeapon);
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return new ItemStack(DefensiveItems.ALUMINUM_ARROW.get());
    }
}
