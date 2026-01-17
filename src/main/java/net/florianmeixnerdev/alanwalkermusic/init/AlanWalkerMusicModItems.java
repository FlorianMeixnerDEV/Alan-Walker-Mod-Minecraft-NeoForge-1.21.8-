/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.florianmeixnerdev.alanwalkermusic.item.*;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicMod;

import java.util.function.Function;

public class AlanWalkerMusicModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AlanWalkerMusicMod.MODID);
	public static final DeferredItem<Item> ALAN_WALKER_135;
	public static final DeferredItem<Item> WELCOME_TO_LONELY_CLUB;
	public static final DeferredItem<Item> ALONE;
	public static final DeferredItem<Item> SAILING;
	public static final DeferredItem<Item> AVALON;
	public static final DeferredItem<Item> BELIEVERS;
	public static final DeferredItem<Item> BLUE;
	public static final DeferredItem<Item> CATCH_ME_IF_YOU_CAN;
	public static final DeferredItem<Item> CREATOR_CIRCLE;
	public static final DeferredItem<Item> DIAMOND_HEART;
	public static final DeferredItem<Item> DREAMER;
	public static final DeferredItem<Item> DUST;
	public static final DeferredItem<Item> EXTREMES;
	public static final DeferredItem<Item> FADED;
	public static final DeferredItem<Item> FIRE;
	public static final DeferredItem<Item> HEADLIGHTS;
	public static final DeferredItem<Item> HEARTBREAK_MELODY;
	public static final DeferredItem<Item> HELLO_WORLD;
	public static final DeferredItem<Item> INCOMMUNICADO;
	public static final DeferredItem<Item> JUMPSTART;
	public static final DeferredItem<Item> LOVESICK;
	public static final DeferredItem<Item> ME_MYSELF_AND_THE_NIGHT;
	public static final DeferredItem<Item> MOONSHINE;
	public static final DeferredItem<Item> OLD_HABITS;
	public static final DeferredItem<Item> PLAY;
	public static final DeferredItem<Item> SHUT_UP;
	public static final DeferredItem<Item> SING_ME_TO_SLEEP;
	public static final DeferredItem<Item> THE_DRUM;
	public static final DeferredItem<Item> THE_SPECTRE;
	public static final DeferredItem<Item> TIME;
	public static final DeferredItem<Item> SPACE_MELODY;
	public static final DeferredItem<Item> WECOME_TO_WALKERWORLD;
	public static final DeferredItem<Item> RISE_OF_THE_DRONES;
	public static final DeferredItem<Item> ALAN_WALKER_SPAWN_EGG;
	public static final DeferredItem<Item> BODYGUARD_SPAWN_EGG;
	public static final DeferredItem<Item> BAD_ALAN_SPAWN_EGG;
	public static final DeferredItem<Item> TISCH;
	public static final DeferredItem<Item> BROKEN_STRINGS;
	public static final DeferredItem<Item> NOT_HOME;
	public static final DeferredItem<Item> FADED_10TH_ANINIVERSARY;
	static {
		ALAN_WALKER_135 = register("alan_walker_135", AlanWalker135Item::new);
		WELCOME_TO_LONELY_CLUB = register("welcome_to_lonely_club", WelcomeToLonelyClubItem::new);
		ALONE = register("alone", AloneItem::new);
		SAILING = register("sailing", SailingItem::new);
		AVALON = register("avalon", AvalonItem::new);
		BELIEVERS = register("believers", BelieversItem::new);
		BLUE = register("blue", BlueItem::new);
		CATCH_ME_IF_YOU_CAN = register("catch_me_if_you_can", CatchMeIfYouCanItem::new);
		CREATOR_CIRCLE = register("creator_circle", CreatorCircleItem::new);
		DIAMOND_HEART = register("diamond_heart", DiamondHeartItem::new);
		DREAMER = register("dreamer", DreamerItem::new);
		DUST = register("dust", DustItem::new);
		EXTREMES = register("extremes", ExtremesItem::new);
		FADED = register("faded", FadedItem::new);
		FIRE = register("fire", FireItem::new);
		HEADLIGHTS = register("headlights", HeadlightsItem::new);
		HEARTBREAK_MELODY = register("heartbreak_melody", HeartbreakMelodyItem::new);
		HELLO_WORLD = register("hello_world", HelloWorldItem::new);
		INCOMMUNICADO = register("incommunicado", IncommunicadoItem::new);
		JUMPSTART = register("jumpstart", JumpstartItem::new);
		LOVESICK = register("lovesick", LovesickItem::new);
		ME_MYSELF_AND_THE_NIGHT = register("me_myself_and_the_night", MeMyselfAndTheNightItem::new);
		MOONSHINE = register("moonshine", MoonshineItem::new);
		OLD_HABITS = register("old_habits", OldHabitsItem::new);
		PLAY = register("play", PlayItem::new);
		SHUT_UP = register("shut_up", ShutUpItem::new);
		SING_ME_TO_SLEEP = register("sing_me_to_sleep", SingMeToSleepItem::new);
		THE_DRUM = register("the_drum", TheDrumItem::new);
		THE_SPECTRE = register("the_spectre", TheSpectreItem::new);
		TIME = register("time", TimeItem::new);
		SPACE_MELODY = register("space_melody", SpaceMelodyItem::new);
		WECOME_TO_WALKERWORLD = register("wecome_to_walkerworld", WecomeToWalkerworldItem::new);
		RISE_OF_THE_DRONES = register("rise_of_the_drones", RiseOfTheDronesItem::new);
		ALAN_WALKER_SPAWN_EGG = register("alan_walker_spawn_egg", properties -> new SpawnEggItem(AlanWalkerMusicModEntities.ALAN_WALKER.get(), properties));
		BODYGUARD_SPAWN_EGG = register("bodyguard_spawn_egg", properties -> new SpawnEggItem(AlanWalkerMusicModEntities.BODYGUARD.get(), properties));
		BAD_ALAN_SPAWN_EGG = register("bad_alan_spawn_egg", properties -> new SpawnEggItem(AlanWalkerMusicModEntities.BAD_ALAN.get(), properties));
		TISCH = block(AlanWalkerMusicModBlocks.TISCH);
		BROKEN_STRINGS = register("broken_strings", BrokenStringsItem::new);
		NOT_HOME = register("not_home", NotHomeItem::new);
		FADED_10TH_ANINIVERSARY = register("faded_10th_aniniversary", Faded10thAniniversaryItem::new);
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