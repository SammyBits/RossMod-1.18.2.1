package net.sammy.rossmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sammy.rossmod.RossMod;

public class ModBlocks {

    public static final Block ROSS_BLOCK = registerBlock("ross_block",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(6F)),ItemGroup.MISC);

    public static final Block ROSS_METALBLOCK = registerBlock("ross_metalblock",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5F)),ItemGroup.MISC);

    private static Block registerBlock(String nombre, Block block, ItemGroup group){
        registerBlockItem(nombre,block,group);
        return Registry.register(Registry.BLOCK, new Identifier(RossMod.MOD_ID,nombre),block);
    }
    private static Item registerBlockItem(String nombre, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(RossMod.MOD_ID, nombre),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlock(){
        RossMod.LOGGER.info("Registrando Bloque del Mod para:" + RossMod.MOD_ID);
    }
}
