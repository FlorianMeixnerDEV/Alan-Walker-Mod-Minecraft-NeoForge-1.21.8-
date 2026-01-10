/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicMod;

@EventBusSubscriber
public class AlanWalkerMusicModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlanWalkerMusicMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DISC = REGISTRY.register("disc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_music.disc")).icon(() -> new ItemStack(Items.MUSIC_DISC_13)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerMusicModItems.WELCOME_TO_LONELY_CLUB.get());
				tabData.accept(AlanWalkerMusicModItems.ALONE.get());
				tabData.accept(AlanWalkerMusicModItems.SAILING.get());
				tabData.accept(AlanWalkerMusicModItems.AVALON.get());
				tabData.accept(AlanWalkerMusicModItems.BELIEVERS.get());
				tabData.accept(AlanWalkerMusicModItems.BLUE.get());
				tabData.accept(AlanWalkerMusicModItems.CATCH_ME_IF_YOU_CAN.get());
				tabData.accept(AlanWalkerMusicModItems.CREATOR_CIRCLE.get());
				tabData.accept(AlanWalkerMusicModItems.DREAMER.get());
				tabData.accept(AlanWalkerMusicModItems.DUST.get());
				tabData.accept(AlanWalkerMusicModItems.EXTREMES.get());
				tabData.accept(AlanWalkerMusicModItems.FADED.get());
				tabData.accept(AlanWalkerMusicModItems.FIRE.get());
				tabData.accept(AlanWalkerMusicModItems.HEADLIGHTS.get());
				tabData.accept(AlanWalkerMusicModItems.HEARTBREAK_MELODY.get());
				tabData.accept(AlanWalkerMusicModItems.HELLO_WORLD.get());
				tabData.accept(AlanWalkerMusicModItems.INCOMMUNICADO.get());
				tabData.accept(AlanWalkerMusicModItems.JUMPSTART.get());
				tabData.accept(AlanWalkerMusicModItems.LOVESICK.get());
				tabData.accept(AlanWalkerMusicModItems.ME_MYSELF_AND_THE_NIGHT.get());
				tabData.accept(AlanWalkerMusicModItems.MOONSHINE.get());
				tabData.accept(AlanWalkerMusicModItems.OLD_HABITS.get());
				tabData.accept(AlanWalkerMusicModItems.PLAY.get());
				tabData.accept(AlanWalkerMusicModItems.SHUT_UP.get());
				tabData.accept(AlanWalkerMusicModItems.SING_ME_TO_SLEEP.get());
				tabData.accept(AlanWalkerMusicModItems.THE_DRUM.get());
				tabData.accept(AlanWalkerMusicModItems.THE_SPECTRE.get());
				tabData.accept(AlanWalkerMusicModItems.TIME.get());
				tabData.accept(AlanWalkerMusicModItems.SPACE_MELODY.get());
				tabData.accept(AlanWalkerMusicModItems.WECOME_TO_WALKERWORLD.get());
				tabData.accept(AlanWalkerMusicModItems.RISE_OF_THE_DRONES.get());
			}).withSearchBar().build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOBS = REGISTRY.register("mobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_music.mobs")).icon(() -> new ItemStack(Items.BLUE_EGG)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerMusicModItems.ALAN_WALKER_SPAWN_EGG.get());
				tabData.accept(AlanWalkerMusicModItems.BODYGUARD_SPAWN_EGG.get());
				tabData.accept(AlanWalkerMusicModItems.BAD_ALAN_SPAWN_EGG.get());
			}).withSearchBar().withTabsBefore(DISC.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DEKO = REGISTRY.register("deko",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_music.deko")).icon(() -> new ItemStack(Blocks.GOLD_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerMusicModBlocks.TISCH.get().asItem());
			}).withSearchBar().withTabsBefore(MOBS.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(AlanWalkerMusicModItems.DIAMOND_HEART.get());
		}
	}
}