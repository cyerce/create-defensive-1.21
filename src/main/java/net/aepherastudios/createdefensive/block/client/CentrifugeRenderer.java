package net.aepherastudios.createdefensive.block.client;

import com.simibubi.create.content.kinetics.base.KineticBlockEntityRenderer;
import net.aepherastudios.createdefensive.CreateDefensive;
import net.aepherastudios.createdefensive.block.entity.machine.CentrifugeBlockEntity;
import net.createmod.catnip.render.CachedBuffers;
import net.createmod.catnip.render.SuperByteBuffer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.state.BlockState;

public class CentrifugeRenderer extends KineticBlockEntityRenderer<CentrifugeBlockEntity> {

    public CentrifugeRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected SuperByteBuffer getRotatedModel(CentrifugeBlockEntity be, BlockState state) {
        CreateDefensive.LOGGER.info("getRotatedModel called");
        SuperByteBuffer buf = CachedBuffers.partial(DefensivePartialModels.CENTRIFUGE_COG, state);
        CreateDefensive.LOGGER.info("Buffer null? {}", buf == null);
        return buf;
    }

}
