package net.sammy.rossmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sammy.rossmod.RossMod;

public class ModItems {
    public static final Item ROSS_INGOT = registrarItem("ross_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item ROSS_NUGGET = registrarItem("ross_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registrarItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RossMod.MOD_ID,name), item);
    }

    public static void registrarModItem(){
        RossMod.LOGGER.info("Registro de Mod Items para " + RossMod.MOD_ID);
    }

}
