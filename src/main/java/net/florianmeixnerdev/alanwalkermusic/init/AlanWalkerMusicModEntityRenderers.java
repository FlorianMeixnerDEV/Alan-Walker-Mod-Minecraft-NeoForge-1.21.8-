/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.florianmeixnerdev.alanwalkermusic.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.florianmeixnerdev.alanwalkermusic.client.renderer.BodyguardRenderer;
import net.florianmeixnerdev.alanwalkermusic.client.renderer.BadAlanRenderer;
import net.florianmeixnerdev.alanwalkermusic.client.renderer.AlanWalkerRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class AlanWalkerMusicModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlanWalkerMusicModEntities.ALAN_WALKER.get(), AlanWalkerRenderer::new);
		event.registerEntityRenderer(AlanWalkerMusicModEntities.BODYGUARD.get(), BodyguardRenderer::new);
		event.registerEntityRenderer(AlanWalkerMusicModEntities.BAD_ALAN.get(), BadAlanRenderer::new);
	}
}