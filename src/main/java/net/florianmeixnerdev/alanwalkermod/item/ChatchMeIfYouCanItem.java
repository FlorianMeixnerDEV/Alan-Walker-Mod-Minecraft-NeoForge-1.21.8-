package net.florianmeixnerdev.alanwalkermod.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

public class ChatchMeIfYouCanItem extends Item {
	public ChatchMeIfYouCanItem(Item.Properties properties) {
		super(properties.jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(AlanWalkerModMod.MODID, "chatch_me_if_you_can"))));
	}
}