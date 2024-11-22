package wiiu.mavity.bmnw.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import wiiu.mavity.bmnw.Constants;
import wiiu.mavity.bmnw.item.BMNWItems;

public class BMNWBlocks {

    public static <T extends Block> T registerBlock(String name, T block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Constants.MOD_ID, name), block);
    }

    @SuppressWarnings("UnusedReturnValue")
    public static <T extends Block> BlockItem registerBlockItem(String name, T block) {
        return BMNWItems.registerItem(name, new BlockItem(block, new FabricItemSettings()));
    }

    public static void init() {}
}