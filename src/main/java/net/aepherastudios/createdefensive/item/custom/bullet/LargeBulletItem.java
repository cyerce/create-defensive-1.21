package net.aepherastudios.createdefensive.item.custom.bullet;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;

public class LargeBulletItem extends BulletItem {

    private float damage;

    public LargeBulletItem(float damage, Properties properties) {
        super(damage, properties);
        this.damage = damage;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.literal("1 x " + this.damage + " Damage")
                .withStyle(ChatFormatting.WHITE));

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}
