package net.aepherastudios.createdefensive.particle.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class RadioactiveCloudParticles extends TextureSheetParticle {
    protected RadioactiveCloudParticles(ClientLevel level, double x, double y, double z, SpriteSet spriteSet, double xSpeed, double ySpeed, double zSpeed) {
        super(level, x, y, z, xSpeed, ySpeed, zSpeed);
        this.scale(20);
        this.setSize(2, 2);

        this.lifetime = 200;

        this.setSpriteFromAge(spriteSet);

        this.rCol = 41f / 255f;
        this.gCol = 113f / 255f;
        this.bCol = 49f / 255f;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel clientLevel,
                                                 double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
            return new RadioactiveCloudParticles(clientLevel, pX, pY, pZ, this.spriteSet, pXSpeed, pYSpeed, pZSpeed);
        }
    }
}
