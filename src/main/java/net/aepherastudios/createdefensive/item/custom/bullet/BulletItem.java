package net.aepherastudios.createdefensive.item.custom.bullet;

import net.minecraft.world.item.Item;

public abstract class BulletItem extends Item {

    private final float damage;

    public BulletItem(float damage, Properties properties) {
        super(properties);
        this.damage = damage;
    }

    public float getDamage() {
        return damage;
    }
}
