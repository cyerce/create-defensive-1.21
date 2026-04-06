package net.aepherastudios.createdefensive.util;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record AimPacket(boolean aiming) implements CustomPacketPayload {
    public static final Type<AimPacket> TYPE = new Type<>(
            ResourceLocation.fromNamespaceAndPath("createdefensive", "aim")
    );
    public static final StreamCodec<ByteBuf, AimPacket> STREAM_CODEC =
            StreamCodec.composite(
                    ByteBufCodecs.BOOL, AimPacket::aiming,
                    AimPacket::new
            );

    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
