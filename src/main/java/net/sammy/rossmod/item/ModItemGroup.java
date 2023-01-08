package net.sammy.rossmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.sammy.rossmod.RossMod;

public class ModItemGroup
{
    public static final ItemGroup ROSS = FabricItemGroupBuilder.build(new Identifier(RossMod.MOD_ID, "ross"),
            () -> new ItemStack(ModItems.ROSS));


}
