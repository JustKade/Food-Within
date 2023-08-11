
package net.mcreator.foodwithin.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.foodwithin.procedures.VirusApplePlayerFinishesUsingItemProcedure;
import net.mcreator.foodwithin.init.FoodWithinModTabs;

import java.util.List;

public class VirusAppleItem extends Item {
	public VirusAppleItem() {
		super(new Item.Properties().tab(FoodWithinModTabs.TAB_FOOD_WITHIN).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(-11).saturationMod(0f)

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Will Make You Sick"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		VirusApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
