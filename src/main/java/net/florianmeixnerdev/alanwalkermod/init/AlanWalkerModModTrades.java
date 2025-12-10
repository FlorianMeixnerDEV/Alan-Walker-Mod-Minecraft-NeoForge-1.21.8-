/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class AlanWalkerModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ResourceKey.create(Registries.VILLAGER_PROFESSION, ResourceLocation.parse("alan_walker_mod:schallplatten_handel"))) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(AlanWalkerModModItems.AVALON_DISC.get()), 5, 500, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(AlanWalkerModModItems.BELIEVERS_DISC.get()), 4, 80, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(AlanWalkerModModItems.SAILING.get()), 4, 80, 0.05f));
		}
	}
}