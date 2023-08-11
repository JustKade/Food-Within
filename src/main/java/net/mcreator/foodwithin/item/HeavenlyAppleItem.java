
package net.mcreator.foodwithin.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.foodwithin.procedures.HeavenlyApplePlayerFinishesUsingItemProcedure;
import net.mcreator.foodwithin.procedures.HeavenlyAppleItemIsDroppedByPlayerProcedure;
import net.mcreator.foodwithin.init.FoodWithinModTabs;

public class HeavenlyAppleItem extends Item {
	public HeavenlyAppleItem() {
		super(new Item.Properties().tab(FoodWithinModTabs.TAB_FOOD_WITHIN).stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(20).saturationMod(1.5f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		HeavenlyApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		HeavenlyAppleItemIsDroppedByPlayerProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}
