
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.bendymod.client.renderer.SitEntityRenderer;
import net.mcreator.bendymod.client.renderer.SearcherRenderer;
import net.mcreator.bendymod.client.renderer.SammyLawrenceRenderer;
import net.mcreator.bendymod.client.renderer.LMSSitEntityRenderer;
import net.mcreator.bendymod.client.renderer.InkBendyRenderer;
import net.mcreator.bendymod.client.renderer.BorisBuddyRenderer;
import net.mcreator.bendymod.client.renderer.BendyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BendymodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BendymodModEntities.BENDY.get(), BendyRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.SAMMY_LAWRENCE.get(), SammyLawrenceRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.INK_BENDY.get(), InkBendyRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.SEARCHER.get(), SearcherRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.BORIS_BUDDY.get(), BorisBuddyRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.SIT_ENTITY.get(), SitEntityRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.BACON_SOUP_EMPTY_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.LMS_SIT_ENTITY.get(), LMSSitEntityRenderer::new);
	}
}
