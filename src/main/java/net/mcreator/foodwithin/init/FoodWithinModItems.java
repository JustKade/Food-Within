
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.foodwithin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.foodwithin.item.VoidAppleItem;
import net.mcreator.foodwithin.item.VirusAppleItem;
import net.mcreator.foodwithin.item.SicklyAppleItem;
import net.mcreator.foodwithin.item.PiglinAppleItem;
import net.mcreator.foodwithin.item.PathogenItem;
import net.mcreator.foodwithin.item.PartialLightAppleItem;
import net.mcreator.foodwithin.item.LightAppleItem;
import net.mcreator.foodwithin.item.IncompleteLightAppleItem;
import net.mcreator.foodwithin.item.HeavenlyAppleItem;
import net.mcreator.foodwithin.item.DragonAppleItem;
import net.mcreator.foodwithin.item.CrystalAppleItem;
import net.mcreator.foodwithin.item.AppleOfTheDeepItem;
import net.mcreator.foodwithin.FoodWithinMod;

public class FoodWithinModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FoodWithinMod.MODID);
	public static final RegistryObject<Item> PARTIAL_LIGHT_APPLE = REGISTRY.register("partial_light_apple", () -> new PartialLightAppleItem());
	public static final RegistryObject<Item> VOID_APPLE = REGISTRY.register("void_apple", () -> new VoidAppleItem());
	public static final RegistryObject<Item> LIGHT_APPLE = REGISTRY.register("light_apple", () -> new LightAppleItem());
	public static final RegistryObject<Item> INCOMPLETE_LIGHT_APPLE = REGISTRY.register("incomplete_light_apple", () -> new IncompleteLightAppleItem());
	public static final RegistryObject<Item> HEAVENLY_APPLE = REGISTRY.register("heavenly_apple", () -> new HeavenlyAppleItem());
	public static final RegistryObject<Item> SICKLY_APPLE = REGISTRY.register("sickly_apple", () -> new SicklyAppleItem());
	public static final RegistryObject<Item> VIRUS_APPLE = REGISTRY.register("virus_apple", () -> new VirusAppleItem());
	public static final RegistryObject<Item> PATHOGEN = REGISTRY.register("pathogen", () -> new PathogenItem());
	public static final RegistryObject<Item> DRAGON_APPLE = REGISTRY.register("dragon_apple", () -> new DragonAppleItem());
	public static final RegistryObject<Item> APPLE_OF_THE_DEEP = REGISTRY.register("apple_of_the_deep", () -> new AppleOfTheDeepItem());
	public static final RegistryObject<Item> PIGLIN_APPLE = REGISTRY.register("piglin_apple", () -> new PiglinAppleItem());
	public static final RegistryObject<Item> CRYSTAL_APPLE = REGISTRY.register("crystal_apple", () -> new CrystalAppleItem());
}
