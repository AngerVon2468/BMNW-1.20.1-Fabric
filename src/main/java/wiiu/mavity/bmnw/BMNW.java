package wiiu.mavity.bmnw;

import net.fabricmc.api.ModInitializer;

import wiiu.mavity.bmnw.block.BMNWBlocks;
import wiiu.mavity.bmnw.item.BMNWItems;
import wiiu.mavity.bmnw.tag.BMNWTags;

/** <a href="https://github.com/Siepert123/BMNW-1.21-neoforge">See original</a> **/
public class BMNW implements ModInitializer {

	@Override
	public void onInitialize() {
		wiiu.mavity.bmnw.Constants.LOGGER.info("");
		BMNWItems.init();
		BMNWBlocks.init();
		BMNWTags.init();
	}
}