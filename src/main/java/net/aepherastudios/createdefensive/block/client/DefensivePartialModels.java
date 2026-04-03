package net.aepherastudios.createdefensive.block.client;

import com.simibubi.create.AllPartialModels;
import com.simibubi.create.Create;
import com.simibubi.create.content.kinetics.millstone.MillstoneRenderer;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;
import net.aepherastudios.createdefensive.CreateDefensive;

public class DefensivePartialModels {

    public static final PartialModel CENTRIFUGE_COG = block("centrifuge_inner");

    private static PartialModel block(String path) {
        return PartialModel.of(CreateDefensive.asResource("block/" + path));
    }

    public static void init() {
        CreateDefensive.LOGGER.info("PartialModels init called, CENTRIFUGE_COG: {}", CENTRIFUGE_COG.toString());
    }
}