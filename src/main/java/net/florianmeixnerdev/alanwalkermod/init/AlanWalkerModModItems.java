/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

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
	public static final DeferredItem<Item> STUHL;
	public static final DeferredItem<Item> TISCH;
	public static final DeferredItem<Item> SAILING;
	public static final DeferredItem<Item> LONELY_CLUB;
	public static final DeferredItem<Item> ALAN_GUARD_SPAWN_EGG;
	public static final DeferredItem<Item> BLUE;
	public static final DeferredItem<Item> CHATCH_ME_IF_YOU_CAN;
	public static final DeferredItem<Item> EXREMES;
	public static final DeferredItem<Item> HEADLIGHTS;
	public static final DeferredItem<Item> HELLO_WORLD;
	public static final DeferredItem<Item> LOVESICK;
	public static final DeferredItem<Item> SHUT_UP;
	public static final DeferredItem<Item> THE_DRUM;
	public static final DeferredItem<Item> FIRE;
	public static final DeferredItem<Item> PLAY;
	public static final DeferredItem<Item> ALONE;
	public static final DeferredItem<Item> SING_ME_TO_SLEEP;
	public static final DeferredItem<Item> HYM_FOR_THE_WEEKEND;
	public static final DeferredItem<Item> RUNNING_OUT_OF_ROSES;
	public static final DeferredItem<Item> JUMPSTART;
	public static final DeferredItem<Item> BAD_ALAN_SPAWN_EGG;
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
		STUHL = block(AlanWalkerModModBlocks.STUHL);
		TISCH = block(AlanWalkerModModBlocks.TISCH);
		SAILING = register("sailing", SailingItem::new);
		LONELY_CLUB = register("lonely_club", LonelyClubItem::new);
		ALAN_GUARD_SPAWN_EGG = register("alan_guard_spawn_egg", properties -> new SpawnEggItem(AlanWalkerModModEntities.ALAN_GUARD.get(), properties));
		BLUE = register("blue", BlueItem::new);
		CHATCH_ME_IF_YOU_CAN = register("chatch_me_if_you_can", ChatchMeIfYouCanItem::new);
		EXREMES = register("exremes", ExremesItem::new);
		HEADLIGHTS = register("headlights", HeadlightsItem::new);
		HELLO_WORLD = register("hello_world", HelloWorldItem::new);
		LOVESICK = register("lovesick", LovesickItem::new);
		SHUT_UP = register("shut_up", ShutUpItem::new);
		THE_DRUM = register("the_drum", TheDrumItem::new);
		FIRE = register("fire", FireItem::new);
		PLAY = register("play", PlayItem::new);
		ALONE = register("alone", AloneItem::new);
		SING_ME_TO_SLEEP = register("sing_me_to_sleep", SingMeToSleepItem::new);
		HYM_FOR_THE_WEEKEND = register("hym_for_the_weekend", HymForTheWeekendItem::new);
		RUNNING_OUT_OF_ROSES = register("running_out_of_roses", RunningOutOfRosesItem::new);
		JUMPSTART = register("jumpstart", JumpstartItem::new);
		BAD_ALAN_SPAWN_EGG = register("bad_alan_spawn_egg", properties -> new SpawnEggItem(AlanWalkerModModEntities.BAD_ALAN.get(), properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}