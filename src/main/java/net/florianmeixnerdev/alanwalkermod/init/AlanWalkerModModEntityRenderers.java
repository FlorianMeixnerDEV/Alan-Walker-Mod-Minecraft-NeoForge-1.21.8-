/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.florianmeixnerdev.alanwalkermod.client.renderer.AlanWalkerZombieRenderer;
import net.florianmeixnerdev.alanwalkermod.client.renderer.AlanWalkerRenderer;
import net.florianmeixnerdev.alanwalkermod.client.renderer.AlanGuardRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class AlanWalkerModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlanWalkerModModEntities.ALAN_WALKER.get(), AlanWalkerRenderer::new);
		event.registerEntityRenderer(AlanWalkerModModEntities.ALAN_WALKER_ZOMBIE.get(), AlanWalkerZombieRenderer::new);
		event.registerEntityRenderer(AlanWalkerModModEntities.ALAN_GUARD.get(), AlanGuardRenderer::new);
	}
}