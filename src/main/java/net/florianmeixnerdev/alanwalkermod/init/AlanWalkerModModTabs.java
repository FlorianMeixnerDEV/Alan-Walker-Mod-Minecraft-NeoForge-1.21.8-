/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

public class AlanWalkerModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlanWalkerModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SCHALLPLATTEN = REGISTRY.register("schallplatten",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_mod.schallplatten")).icon(() -> new ItemStack(Items.MUSIC_DISC_RELIC)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerModModItems.AVALON_DISC.get());
				tabData.accept(AlanWalkerModModItems.BELIEVERS_DISC.get());
				tabData.accept(AlanWalkerModModItems.CREATOR_CIRCLE_DISC.get());
				tabData.accept(AlanWalkerModModItems.DUST_DISC.get());
				tabData.accept(AlanWalkerModModItems.FADED_DISC.get());
				tabData.accept(AlanWalkerModModItems.INCOMMUNICADO.get());
				tabData.accept(AlanWalkerModModItems.MOONSHINE.get());
				tabData.accept(AlanWalkerModModItems.OLD_HABITS.get());
				tabData.accept(AlanWalkerModModItems.TIME.get());
				tabData.accept(AlanWalkerModModItems.WELCOME_TO_WALKERWORLD.get());
				tabData.accept(AlanWalkerModModItems.RISE_OF_THE_DRONES.get());
				tabData.accept(AlanWalkerModModItems.SAILING.get());
				tabData.accept(AlanWalkerModModItems.LONELY_CLUB.get());
				tabData.accept(AlanWalkerModModItems.BLUE.get());
				tabData.accept(AlanWalkerModModItems.CHATCH_ME_IF_YOU_CAN.get());
				tabData.accept(AlanWalkerModModItems.EXREMES.get());
				tabData.accept(AlanWalkerModModItems.HEADLIGHTS.get());
				tabData.accept(AlanWalkerModModItems.HELLO_WORLD.get());
				tabData.accept(AlanWalkerModModItems.LOVESICK.get());
				tabData.accept(AlanWalkerModModItems.SHUT_UP.get());
				tabData.accept(AlanWalkerModModItems.THE_DRUM.get());
				tabData.accept(AlanWalkerModModItems.FIRE.get());
				tabData.accept(AlanWalkerModModItems.PLAY.get());
				tabData.accept(AlanWalkerModModItems.ALONE.get());
				tabData.accept(AlanWalkerModModItems.SING_ME_TO_SLEEP.get());
				tabData.accept(AlanWalkerModModItems.HYM_FOR_THE_WEEKEND.get());
				tabData.accept(AlanWalkerModModItems.RUNNING_OUT_OF_ROSES.get());
				tabData.accept(AlanWalkerModModItems.JUMPSTART.get());
				tabData.accept(AlanWalkerModModItems.ALAN_WALKER_135_DISC.get());
				tabData.accept(AlanWalkerModModItems.SPACEMELODY_DISC.get());
				tabData.accept(AlanWalkerModModItems.BROKEN_ANGEL_DISC.get());
				tabData.accept(AlanWalkerModModItems.FANTASY_DISC.get());
				tabData.accept(AlanWalkerModModItems.KILLING_ME_SLOWLY_DISC.get());
			}).withSearchBar().build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SPAWNEIER = REGISTRY.register("spawneier",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_mod.spawneier")).icon(() -> new ItemStack(Items.SKELETON_SPAWN_EGG)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerModModItems.ALAN_WALKER_SPAWN_EGG.get());
				tabData.accept(AlanWalkerModModItems.ALAN_GUARD_SPAWN_EGG.get());
				tabData.accept(AlanWalkerModModItems.BAD_ALAN_SPAWN_EGG.get());
			}).withSearchBar().withTabsBefore(SCHALLPLATTEN.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DEKO = REGISTRY.register("deko",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_mod.deko")).icon(() -> new ItemStack(Blocks.GOLD_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerModModBlocks.TISCH.get().asItem());
			}).withTabsBefore(SPAWNEIER.getId()).build());
}