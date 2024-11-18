package wiiu.mavity.bmnw.tag;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static wiiu.mavity.bmnw.Constants.MOD_ID;

@SuppressWarnings("unchecked")
public class BMNWTags {

    public static class Blocks {

        public static final TagKey<Block> RADIATION_SHIELDING = (TagKey<Block>) of(true, "radiation_shielding");
    }

    public static class Items {
    }

    public static TagKey<?> of(boolean blockOrItem, String path) {
        if (blockOrItem) return ofBlock(path);
        else return ofItem(path);
    }

    public static TagKey<Block> ofBlock(String path) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(MOD_ID, path));
    }

    public static TagKey<Item> ofItem(String path) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(MOD_ID, path));
    }

    public static void init() {}

}