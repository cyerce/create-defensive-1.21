package net.aepherastudios.createdefensive.item.custom;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SodiumItem extends Item {

    private final int explosionRadius;

    public SodiumItem(Properties properties, int explosionRadius) {
        super(properties);
        this.explosionRadius = explosionRadius;
    }

    @Override
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        if (entity.isInWaterRainOrBubble()){
            Level level = entity.level();
            level.explode(null, entity.getX(), entity.getY(), entity.getZ(), explosionRadius, true, Level.ExplosionInteraction.TNT);
            return true;
        }
        return false;
    }
}
