/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;

import net.florianmeixnerdev.alanwalkermod.item.*;
import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

import java.util.function.Function;

public class AlanWalkerModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlanWalkerModMod.MODID);
	public static final DeferredItem<Item> AVALON_DISC;
	public static final DeferredItem<Item> BELIEVERS_DISC;
	public static final DeferredItem<Item> CREATOR_CIRCLE_DISC;
	public static final DeferredItem<Item> DUST_DISC;
	public static final DeferredItem<Item> FADED_DISC;
	public static final DeferredItem<Item> INCOMMUNICADO;
	public static final DeferredItem<Item> MOONSHINE;
	public static final DeferredItem<Item> OLD_HABITS;
	public static final DeferredItem<Item> TIME;
	public static final DeferredItem<Item> WELCOME_TO_WALKERWORLD;
	public static final DeferredItem<Item> RISE_OF_THE_DRONES;
	public static final DeferredItem<Item> ALAN_WALKER_SPAWN_EGG;
	public static final DeferredItem<Item> ALAN_WALKER_ZOMBIE_SPAWN_EGG;
	public static final DeferredItem<Item> ALAN_GUARD_SPAWN_EGG;
	public static final DeferredItem<Item> KATANA;
	static {
		AVALON_DISC = register("avalon_disc", AvalonDiscItem::new);
		BELIEVERS_DISC = register("believers_disc", BelieversDiscItem::new);
		CREATOR_CIRCLE_DISC = register("creator_circle_disc", CreatorCircleDiscItem::new);
		DUST_DISC = register("dust_disc", DustDiscItem::new);
		FADED_DISC = register("faded_disc", FadedDiscItem::new);
		INCOMMUNICADO = register("incommunicado", IncommunicadoItem::new);
		MOONSHINE = register("moonshine", MoonshineItem::new);
		OLD_HABITS = register("old_habits", OldHabitsItem::new);
		TIME = register("time", TimeItem::new);
		WELCOME_TO_WALKERWORLD = register("welcome_to_walkerworld", WelcomeToWalkerworldItem::new);
		RISE_OF_THE_DRONES = register("rise_of_the_drones", RiseOfTheDronesItem::new);
		ALAN_WALKER_SPAWN_EGG = register("alan_walker_spawn_egg", properties -> new SpawnEggItem(AlanWalkerModModEntities.ALAN_WALKER.get(), properties));
		ALAN_WALKER_ZOMBIE_SPAWN_EGG = register("alan_walker_zombie_spawn_egg", properties -> new SpawnEggItem(AlanWalkerModModEntities.ALAN_WALKER_ZOMBIE.get(), properties));
		ALAN_GUARD_SPAWN_EGG = register("alan_guard_spawn_egg", properties -> new SpawnEggItem(AlanWalkerModModEntities.ALAN_GUARD.get(), properties));
		KATANA = register("katana", KatanaItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}