package net.florianmeixnerdev.alanwalkermod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

public class BelieversDiscItem extends Item {
	public BelieversDiscItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1).fireResistant().jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(AlanWalkerModMod.MODID, "believers_disc"))));
	}
}