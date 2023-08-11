package net.mcreator.foodwithin.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.foodwithin.FoodWithinMod;

public class PathogenPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 5));
		FoodWithinMod.queueServerWork(121, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("pathogen.exe").bypassArmor(), 1000);
		});
	}
}
