package net.aepherastudios.createdefensive.block.entity.trap;

import net.aepherastudios.createdefensive.block.DefensiveBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LightningTrapBlockEntity extends BlockEntity {

    private long lastFireTime = 0;
    private static final long COOLDOWN_TICKS = 60;

    public LightningTrapBlockEntity(BlockPos pos, BlockState state) {
        super(DefensiveBlockEntities.LIGHTNING_TRAP_BE.get(), pos, state);
    }

    public boolean canShoot(Level level) {
        long gameTime = level.getGameTime();
        if (gameTime - lastFireTime >= COOLDOWN_TICKS) {
            lastFireTime = gameTime;
            return true;
        }
        return false;
    }
}
