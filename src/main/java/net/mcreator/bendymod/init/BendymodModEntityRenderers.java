
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.client.renderer.TommyBulletProjectileRenderer;
import net.mcreator.bendymod.client.renderer.StrikerRenderer;
import net.mcreator.bendymod.client.renderer.SitEntityRenderer;
import net.mcreator.bendymod.client.renderer.SearcherRenderer;
import net.mcreator.bendymod.client.renderer.SammyLawrenceRenderer;
import net.mcreator.bendymod.client.renderer.ProjectionistRenderer;
import net.mcreator.bendymod.client.renderer.PiperRenderer;
import net.mcreator.bendymod.client.renderer.LMSSitEntityRenderer;
import net.mcreator.bendymod.client.renderer.InkBendyRenderer;
import net.mcreator.bendymod.client.renderer.FisherRenderer;
import net.mcreator.bendymod.client.renderer.BorisBuddyRenderer;
import net.mcreator.bendymod.client.renderer.BendyRenderer;
import net.mcreator.bendymod.client.renderer.BaconSoupEmptyProjectileRenderer;

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
		event.registerEntityRenderer(BendymodModEntities.BACON_SOUP_EMPTY_PROJECTILE.get(), BaconSoupEmptyProjectileRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.LMS_SIT_ENTITY.get(), LMSSitEntityRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.FISHER.get(), FisherRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.PROJECTIONIST.get(), ProjectionistRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.PIPER.get(), PiperRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.STRIKER.get(), StrikerRenderer::new);
		event.registerEntityRenderer(BendymodModEntities.TOMMY_BULLET_PROJECTILE.get(), TommyBulletProjectileRenderer::new);
	}
}
