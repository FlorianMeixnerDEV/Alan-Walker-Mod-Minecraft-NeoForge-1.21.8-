/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.florianmeixnerdev.alanwalkermusic.block.TischBlock;
import net.florianmeixnerdev.alanwalkermusic.AlanWalkerMusicMod;

import java.util.function.Function;

public class AlanWalkerMusicModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlanWalkerMusicMod.MODID);
	public static final DeferredBlock<Block> TISCH;
	static {
		TISCH = register("tisch", TischBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}