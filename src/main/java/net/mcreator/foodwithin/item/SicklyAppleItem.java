
package net.mcreator.foodwithin.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.foodwithin.procedures.SicklyApplePlayerFinishesUsingItemProcedure;
import net.mcreator.foodwithin.init.FoodWithinModTabs;

public class SicklyAppleItem extends Item {
	public SicklyAppleItem() {
		super(new Item.Properties().tab(FoodWithinModTabs.TAB_FOOD_WITHIN).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(-10).saturationMod(0f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SicklyApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
