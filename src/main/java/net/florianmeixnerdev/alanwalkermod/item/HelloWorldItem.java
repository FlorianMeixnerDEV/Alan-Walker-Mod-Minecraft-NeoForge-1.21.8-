package net.florianmeixnerdev.alanwalkermod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

public class HelloWorldItem extends Item {
	public HelloWorldItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(AlanWalkerModMod.MODID, "hello_world"))));
	}
}