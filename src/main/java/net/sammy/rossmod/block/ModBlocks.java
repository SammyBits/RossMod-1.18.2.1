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
import net.sammy.rossmod.item.ModItemGroup;

public class ModBlocks {

    public static final Block ROSS_BLOCK = registerBlock("ross_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()),ItemGroup.MISC);

    public static final Block ROSS_ORE = registerBlock("ross_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.ROSS);

    public static final Block DEEPSLATE_ROSS_ORE = registerBlock("deepslate_ross_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()),
            ModItemGroup.ROSS);

    public static final Block RAW_ROSS_BLOCK = registerBlock("raw_ross_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()),
            ModItemGroup.ROSS);

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
