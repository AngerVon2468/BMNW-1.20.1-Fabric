package wiiu.mavity.bmnw;

import net.fabricmc.api.ModInitializer;

import org.slf4j.*;

public class BMNW implements ModInitializer {

	public static final String
			MOD_ID = "bmnw",
			NAME = "Bunkers, Machines & Nuclear Weapons";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BMNW.LOGGER.info("");
	}
}