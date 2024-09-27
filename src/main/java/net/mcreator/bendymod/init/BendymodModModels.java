
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.client.model.Modelbendy_mask;
import net.mcreator.bendymod.client.model.Modelbaconsoup;
import net.mcreator.bendymod.client.model.Modela;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BendymodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modela.LAYER_LOCATION, Modela::createBodyLayer);
		event.registerLayerDefinition(Modelbendy_mask.LAYER_LOCATION, Modelbendy_mask::createBodyLayer);
		event.registerLayerDefinition(Modelbaconsoup.LAYER_LOCATION, Modelbaconsoup::createBodyLayer);
	}
}
