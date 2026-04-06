package net.aepherastudios.createdefensive.util;

import io.netty.buffer.ByteBuf;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record ShootPacket() implements CustomPacketPayload {
    public static final Type<ShootPacket> TYPE = new Type<>(
            ResourceLocation.fromNamespaceAndPath(CreateDefensive.MOD_ID, "shoot")
    );
    public static final StreamCodec<ByteBuf, ShootPacket> STREAM_CODEC =
            StreamCodec.unit(new ShootPacket());

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
