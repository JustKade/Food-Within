
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foodwithin.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class FoodWithinModTabs {
	public static CreativeModeTab TAB_FOOD_WITHIN;

	public static void load() {
		TAB_FOOD_WITHIN = new CreativeModeTab("tabfood_within") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(FoodWithinModItems.VOID_APPLE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
