package net.aepherastudios.createdefensive.item.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
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
        if (entity.isInWaterRainOrBubble()) {
            Level level = entity.level();
            float rad = (float) (explosionRadius * Math.log(entity.getItem().getCount() + 1));
            level.explode(null, entity.getX(), entity.getY(), entity.getZ(), rad, true, Level.ExplosionInteraction.TNT);
            return true;
        }
        return false;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        if (entity instanceof Player player) {
            if (player.isHolding(stack.getItem()) && (level.isRaining() || player.isInWaterRainOrBubble() || player.isInPowderSnow)) {
                float rad = (float) (explosionRadius * Math.log(stack.getCount()+ 1));
                level.explode(null, entity.getX(), entity.getY(), entity.getZ(), rad, true, Level.ExplosionInteraction.TNT);
                stack.shrink(stack.getCount());
            }
        }
    }
}
