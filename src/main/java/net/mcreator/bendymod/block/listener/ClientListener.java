package net.mcreator.bendymod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.init.BendymodModBlockEntities;
import net.mcreator.bendymod.block.renderer.CutoutSinnyTileRenderer;
import net.mcreator.bendymod.block.renderer.CutoutBendyTileRenderer;
import net.mcreator.bendymod.BendymodMod;

@Mod.EventBusSubscriber(modid = BendymodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CUTOUT_BENDY.get(), CutoutBendyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CUTOUT_SINNY.get(), CutoutSinnyTileRenderer::new);
	}
}
