/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.florianmeixnerdev.alanwalkermod.block.TischBlock;
import net.florianmeixnerdev.alanwalkermod.block.MadeByFMDBlock;
import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

import java.util.function.Function;

public class AlanWalkerModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AlanWalkerModMod.MODID);
	public static final DeferredBlock<Block> MADE_BY_FMD;
	public static final DeferredBlock<Block> TISCH;
	static {
		MADE_BY_FMD = register("made_by_fmd", MadeByFMDBlock::new);
		TISCH = register("tisch", TischBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}