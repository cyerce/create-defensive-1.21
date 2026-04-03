package net.aepherastudios.createdefensive.block.client;

import com.simibubi.create.content.kinetics.base.KineticBlockEntityVisual;
import com.simibubi.create.content.kinetics.base.RotatingInstance;
import com.simibubi.create.foundation.render.AllInstanceTypes;
import dev.engine_room.flywheel.api.instance.Instance;
import dev.engine_room.flywheel.api.visualization.VisualizationContext;
import dev.engine_room.flywheel.lib.model.Models;
import net.aepherastudios.createdefensive.block.entity.CentrifugeBlockEntity;

import java.util.function.Consumer;

public class CentrifugeVisual extends KineticBlockEntityVisual<CentrifugeBlockEntity> {

    protected final RotatingInstance cog;

    public CentrifugeVisual(VisualizationContext context, CentrifugeBlockEntity blockEntity, float partialTick) {
        super(context, blockEntity, partialTick);

        cog = instancerProvider().instancer(AllInstanceTypes.ROTATING, Models.partial(DefensivePartialModels.CENTRIFUGE_COG))
                .createInstance();

        cog.setup(blockEntity)
                .setPosition(getVisualPosition())
                .setChanged();
    }

    @Override
    public void update(float pt) {
        cog.setup(blockEntity)
                .setChanged();
    }

    @Override
    public void updateLight(float partialTick) {
        relight(pos, cog);
    }

    @Override
    protected void _delete() {
        cog.delete();
    }

    @Override
    public void collectCrumblingInstances(Consumer<Instance> consumer) {
        consumer.accept(cog);
    }
}
