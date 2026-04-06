package net.aepherastudios.createdefensive.item.custom.gun;

import net.aepherastudios.createdefensive.item.custom.bullet.BulletItem;
import net.aepherastudios.createdefensive.item.custom.bullet.ShotgunBulletItem;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

import java.util.List;

public class ShotgunItem extends GunItem {

    private static final int MAGAZINE_SIZE = 2;
    private static final double RANGE = 20.0;
    private static final float DEFAULT_SPREAD_DEGREES = 8.0f;

    public ShotgunItem(Properties properties) {
        super(
                MAGAZINE_SIZE,
                ShotgunBulletItem.class,
                SoundEvents.DRAGON_FIREBALL_EXPLODE,  // replace with your gun sound
                SoundEvents.VAULT_INSERT_ITEM, // replace with your reload sound
                SoundEvents.STONE_BUTTON_CLICK_OFF,    // replace with your empty click sound
                properties
        );
    }

    @Override
    protected void shoot(ServerLevel level, Player player, ItemStack stack, BulletItem bullet) {
        ShotgunBulletItem shotgunBullet = bullet instanceof ShotgunBulletItem s ? s : null;
        int pellets = shotgunBullet != null ? shotgunBullet.getPelletCount() : 8;
        player.getCooldowns().addCooldown(this, 5);

        List<HitResult> hits = raycastCone(level, player, RANGE, pellets, DEFAULT_SPREAD_DEGREES);

        for (HitResult hit : hits) {
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
}
