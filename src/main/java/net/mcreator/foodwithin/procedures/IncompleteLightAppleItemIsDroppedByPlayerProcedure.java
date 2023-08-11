package net.mcreator.foodwithin.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.foodwithin.init.FoodWithinModItems;
import net.mcreator.foodwithin.FoodWithinMod;

public class IncompleteLightAppleItemIsDroppedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) > 13) {
			FoodWithinMod.queueServerWork(120, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.NONE);
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(FoodWithinModItems.LIGHT_APPLE.get()));
					entityToSpawn.setPickUpDelay(10);
					entityToSpawn.setUnlimitedLifetime();
					_level.addFreshEntity(entityToSpawn);
				}
			});
		}
	}
}
