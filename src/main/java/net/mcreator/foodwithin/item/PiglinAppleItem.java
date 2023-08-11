
package net.mcreator.foodwithin.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.foodwithin.init.FoodWithinModTabs;

public class PiglinAppleItem extends Item {
	public PiglinAppleItem() {
		super(new Item.Properties().tab(FoodWithinModTabs.TAB_FOOD_WITHIN).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.6f)

				.build()));
	}
}
