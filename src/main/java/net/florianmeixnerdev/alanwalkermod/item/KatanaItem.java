package net.florianmeixnerdev.alanwalkermod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class KatanaItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 99999, 20f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("alan_walker_mod:katana_repair_items")));

	public KatanaItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 99998f, -4f));
	}
}