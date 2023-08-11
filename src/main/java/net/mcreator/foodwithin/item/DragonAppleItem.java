
package net.mcreator.foodwithin.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.foodwithin.procedures.DragonApplePlayerFinishesUsingItemProcedure;
import net.mcreator.foodwithin.init.FoodWithinModTabs;

public class DragonAppleItem extends Item {
	public DragonAppleItem() {
		super(new Item.Properties().tab(FoodWithinModTabs.TAB_FOOD_WITHIN).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(21).saturationMod(1f)

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DragonApplePlayerFinishesUsingItemProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
