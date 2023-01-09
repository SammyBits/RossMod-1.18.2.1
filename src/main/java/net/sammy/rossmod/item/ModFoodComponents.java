package net.sammy.rossmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent PAN =
            new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).meat().build();
}
