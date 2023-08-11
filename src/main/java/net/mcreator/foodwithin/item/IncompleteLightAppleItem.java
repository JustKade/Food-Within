
package net.mcreator.foodwithin.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

import net.mcreator.foodwithin.procedures.IncompleteLightAppleItemIsDroppedByPlayerProcedure;
import net.mcreator.foodwithin.init.FoodWithinModTabs;

import java.util.List;

public class IncompleteLightAppleItem extends Item {
	public IncompleteLightAppleItem() {
		super(new Item.Properties().tab(FoodWithinModTabs.TAB_FOOD_WITHIN).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Need... Sun...."));
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		IncompleteLightAppleItemIsDroppedByPlayerProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
		return true;
	}
}
