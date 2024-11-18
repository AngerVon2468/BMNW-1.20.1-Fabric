package wiiu.mavity.bmnw;

import net.fabricmc.api.ModInitializer;
import wiiu.mavity.bmnw.tag.BMNWTags;

public class BMNW implements ModInitializer {

	@Override
	public void onInitialize() {
		wiiu.mavity.bmnw.Constants.LOGGER.info("");
		BMNWTags.init();
	}
}