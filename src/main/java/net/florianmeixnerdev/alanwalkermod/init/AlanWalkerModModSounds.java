/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.florianmeixnerdev.alanwalkermod.AlanWalkerModMod;

public class AlanWalkerModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, AlanWalkerModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> AVALON = REGISTRY.register("avalon", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "avalon")));
	public static final DeferredHolder<SoundEvent, SoundEvent> OLDHABITS = REGISTRY.register("oldhabits", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "oldhabits")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WORLDOFWALKER_RISEOFTHEDRONES = REGISTRY.register("worldofwalker_riseofthedrones",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "worldofwalker_riseofthedrones")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BELIEVERS = REGISTRY.register("believers", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "believers")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CREATORCIRCLE = REGISTRY.register("creatorcircle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "creatorcircle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DUST = REGISTRY.register("dust", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "dust")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FADED = REGISTRY.register("faded", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "faded")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HEARTBREAKMELODY = REGISTRY.register("heartbreakmelody", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "heartbreakmelody")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TIME = REGISTRY.register("time", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "time")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MOONSHINE = REGISTRY.register("moonshine", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "moonshine")));
	public static final DeferredHolder<SoundEvent, SoundEvent> INCOMMUNICADO = REGISTRY.register("incommunicado", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "incommunicado")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WELCOMETOWALKERWORLD = REGISTRY.register("welcometowalkerworld",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "welcometowalkerworld")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HELLO = REGISTRY.register("hello", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("alan_walker_mod", "hello")));
}