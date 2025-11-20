/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

@EventBusSubscriber
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
			}).withSearchBar().build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SPAWNEIER = REGISTRY.register("spawneier",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_mod.spawneier")).icon(() -> new ItemStack(Items.SKELETON_SPAWN_EGG)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerModModItems.ALAN_WALKER_SPAWN_EGG.get());
				tabData.accept(AlanWalkerModModItems.ALAN_WALKER_ZOMBIE_SPAWN_EGG.get());
				tabData.accept(AlanWalkerModModItems.ALAN_GUARD_SPAWN_EGG.get());
			}).withSearchBar().withTabsBefore(SCHALLPLATTEN.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WAFFEN = REGISTRY.register("waffen",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.alan_walker_mod.waffen")).icon(() -> new ItemStack(Items.DIAMOND_SWORD)).displayItems((parameters, tabData) -> {
				tabData.accept(AlanWalkerModModItems.KATANA.get());
			}).withTabsBefore(SPAWNEIER.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(AlanWalkerModModItems.KATANA.get());
		}
	}
}