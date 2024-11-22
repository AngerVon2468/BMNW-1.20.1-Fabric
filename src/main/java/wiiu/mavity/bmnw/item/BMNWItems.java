package wiiu.mavity.bmnw.item;

import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import wiiu.mavity.bmnw.Constants;

public class BMNWItems {

    public static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(Registries.ITEM, new Identifier(Constants.MOD_ID, name), item);
    }

    public static void init() {}
}