package net.florianmeixnerdev.alanwalkermod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

public class MoonshineItem extends Item {
	public MoonshineItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(AlanWalkerModMod.MODID, "moonshine"))));
	}
}