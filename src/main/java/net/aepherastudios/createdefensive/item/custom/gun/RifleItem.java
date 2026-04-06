package net.aepherastudios.createdefensive.item.custom.gun;

import net.aepherastudios.createdefensive.item.custom.bullet.BulletItem;
import net.aepherastudios.createdefensive.item.custom.bullet.LargeBulletItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class RifleItem extends GunItem {

    private static final int MAGAZINE_SIZE = 1;
    private static final double RANGE = 100.0; // Long range

    public RifleItem(Properties properties) {
        super(
                MAGAZINE_SIZE,
                LargeBulletItem.class,
                SoundEvents.DRAGON_FIREBALL_EXPLODE,  // replace with your gun sound
                SoundEvents.VAULT_INSERT_ITEM, // replace with your reload sound
                SoundEvents.STONE_BUTTON_CLICK_OFF,    // replace with your empty click sound
                properties
        );
    }

    @Override
    protected void shoot(ServerLevel level, Player player, ItemStack stack, BulletItem bullet) {
        HitResult hit = raycast(level, player, RANGE);
        player.getCooldowns().addCooldown(this, 5);

        if (hit instanceof EntityHitResult entityHit) {
            if (entityHit.getEntity() instanceof LivingEntity target) {
                target.hurt(
                        level.damageSources().playerAttack(player),
                        bullet.getDamage()
                );
            }
        }
    }
}