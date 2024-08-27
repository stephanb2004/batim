package net.mcreator.bendymod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.init.BendymodModBlockEntities;
import net.mcreator.bendymod.block.renderer.ValveTileRenderer;
import net.mcreator.bendymod.block.renderer.TrashBinTileRenderer;
import net.mcreator.bendymod.block.renderer.StudioLampTileRenderer;
import net.mcreator.bendymod.block.renderer.SpeakerTileRenderer;
import net.mcreator.bendymod.block.renderer.RecordTileRenderer;
import net.mcreator.bendymod.block.renderer.RadioTileRenderer;
import net.mcreator.bendymod.block.renderer.LeverStudioTileRenderer;
import net.mcreator.bendymod.block.renderer.LeverPowerTileRenderer;
import net.mcreator.bendymod.block.renderer.JumbledPaperTileRenderer;
import net.mcreator.bendymod.block.renderer.InkPipeVerticalTileRenderer;
import net.mcreator.bendymod.block.renderer.InkPipeStraightTileRenderer;
import net.mcreator.bendymod.block.renderer.InkPipeHorizontalTileRenderer;
import net.mcreator.bendymod.block.renderer.InkMachineTileRenderer;
import net.mcreator.bendymod.block.renderer.DresserTileRenderer;
import net.mcreator.bendymod.block.renderer.DeskTileRenderer;
import net.mcreator.bendymod.block.renderer.CutoutSinnyTileRenderer;
import net.mcreator.bendymod.block.renderer.CutoutBendyTileRenderer;
import net.mcreator.bendymod.block.renderer.CassettePlayerTileRenderer;
import net.mcreator.bendymod.block.renderer.BoardsTileRenderer;
import net.mcreator.bendymod.BendymodMod;

@Mod.EventBusSubscriber(modid = BendymodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CUTOUT_BENDY.get(), CutoutBendyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CUTOUT_SINNY.get(), CutoutSinnyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_MACHINE.get(), InkMachineTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.SPEAKER.get(), SpeakerTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.STUDIO_LAMP.get(), StudioLampTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.DRESSER.get(), DresserTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_PIPE_HORIZONTAL.get(), InkPipeHorizontalTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_PIPE_VERTICAL.get(), InkPipeVerticalTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_PIPE_STRAIGHT.get(), InkPipeStraightTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.LEVER_POWER.get(), LeverPowerTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.LEVER_STUDIO.get(), LeverStudioTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.VALVE.get(), ValveTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.RECORD.get(), RecordTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.TRASH_BIN.get(), TrashBinTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.JUMBLED_PAPER.get(), JumbledPaperTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.BOARDS.get(), BoardsTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.RADIO.get(), RadioTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CASSETTE_PLAYER.get(), CassettePlayerTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.DESK.get(), DeskTileRenderer::new);
	}
}
