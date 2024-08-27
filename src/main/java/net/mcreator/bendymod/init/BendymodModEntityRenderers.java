
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.client.renderer.SearcherRenderer;
import net.mcreator.bendymod.client.renderer.SammyLawrenceRenderer;
import net.mcreator.bendymod.client.renderer.InkBendyRenderer;
import net.mcreator.bendymod.client.renderer.BorisBuddyRenderer;
import net.mcreator.bendymod.client.renderer.BendyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BendymodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BendymodModEntities.BENDY.get(), BendyRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.BORIS_BUDDY.get(), BorisBuddyRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.SEARCHER.get(), SearcherRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.INK_BENDY.get(), InkBendyRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.SAMMY_LAWRENCE.get(), SammyLawrenceRenderer::new);
	}
}
