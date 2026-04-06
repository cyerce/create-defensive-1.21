package net.aepherastudios.createdefensive.item.custom.bullet;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class ShotgunBulletItem extends BulletItem {

    private final int pelletCount;
    private float damagePerPellet;

    public ShotgunBulletItem(float damagePerPellet, int pelletCount, Properties properties) {
        super(damagePerPellet, properties);
        this.pelletCount = pelletCount;
        this.damagePerPellet = damagePerPellet;

    }

    public int getPelletCount() {
        return pelletCount;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.literal(this.damagePerPellet + " x " + this.pelletCount + " Damage")
                .withStyle(ChatFormatting.WHITE));

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
