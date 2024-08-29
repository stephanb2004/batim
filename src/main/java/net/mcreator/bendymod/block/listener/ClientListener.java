package net.mcreator.bendymod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.init.BendymodModBlockEntities;
import net.mcreator.bendymod.block.renderer.WritingWhosLaughingNowTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingTheCreatorLiedToUsTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingDreamsComeTrueTileRenderer;
import net.mcreator.bendymod.block.renderer.ValveTileRenderer;
import net.mcreator.bendymod.block.renderer.TrashBinTileRenderer;
import net.mcreator.bendymod.block.renderer.StudioChairTileRenderer;
import net.mcreator.bendymod.block.renderer.SpeakerTileRenderer;
import net.mcreator.bendymod.block.renderer.SoupCandleTileRenderer;
import net.mcreator.bendymod.block.renderer.ShelfTileRenderer;
import net.mcreator.bendymod.block.renderer.ReelTileRenderer;
import net.mcreator.bendymod.block.renderer.RecordTileRenderer;
import net.mcreator.bendymod.block.renderer.RadioTileRenderer;
import net.mcreator.bendymod.block.renderer.ProjectorTileRenderer;
import net.mcreator.bendymod.block.renderer.LeverStudioTileRenderer;
import net.mcreator.bendymod.block.renderer.LeverPowerTileRenderer;
import net.mcreator.bendymod.block.renderer.JumbledPaperTileRenderer;
import net.mcreator.bendymod.block.renderer.JDSSignTileRenderer;
import net.mcreator.bendymod.block.renderer.InkPipeVerticalTileRenderer;
import net.mcreator.bendymod.block.renderer.InkPipeStraightTileRenderer;
import net.mcreator.bendymod.block.renderer.InkPipeHorizontalTileRenderer;
import net.mcreator.bendymod.block.renderer.InkMachineTileRenderer;
import net.mcreator.bendymod.block.renderer.InkBarrelTileRenderer;
import net.mcreator.bendymod.block.renderer.DresserTileRenderer;
import net.mcreator.bendymod.block.renderer.DeskTileRenderer;
import net.mcreator.bendymod.block.renderer.DeskFancyTileRenderer;
import net.mcreator.bendymod.block.renderer.CutoutSinnyTileRenderer;
import net.mcreator.bendymod.block.renderer.CutoutBendyTileRenderer;
import net.mcreator.bendymod.block.renderer.CoffinTileRenderer;
import net.mcreator.bendymod.block.renderer.CassettePlayerTileRenderer;
import net.mcreator.bendymod.block.renderer.BorisCloneTileRenderer;
import net.mcreator.bendymod.block.renderer.BoardsTileRenderer;
import net.mcreator.bendymod.block.renderer.BendyStatueTileRenderer;
import net.mcreator.bendymod.BendymodMod;

@Mod.EventBusSubscriber(modid = BendymodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CUTOUT_BENDY.get(), CutoutBendyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.PROJECTOR.get(), ProjectorTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.DESK.get(), DeskTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.STUDIO_CHAIR.get(), StudioChairTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.DRESSER.get(), DresserTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_BARREL.get(), InkBarrelTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.TRASH_BIN.get(), TrashBinTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.RADIO.get(), RadioTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.SPEAKER.get(), SpeakerTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CASSETTE_PLAYER.get(), CassettePlayerTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_PIPE_HORIZONTAL.get(), InkPipeHorizontalTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_PIPE_VERTICAL.get(), InkPipeVerticalTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_PIPE_STRAIGHT.get(), InkPipeStraightTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.LEVER_POWER.get(), LeverPowerTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.LEVER_STUDIO.get(), LeverStudioTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.VALVE.get(), ValveTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.INK_MACHINE.get(), InkMachineTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.RECORD.get(), RecordTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.JUMBLED_PAPER.get(), JumbledPaperTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.BOARDS.get(), BoardsTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.BORIS_CLONE.get(), BorisCloneTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.BENDY_STATUE.get(), BendyStatueTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.COFFIN.get(), CoffinTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_DREAMS_COME_TRUE.get(), WritingDreamsComeTrueTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_WHOS_LAUGHING_NOW.get(), WritingWhosLaughingNowTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_THE_CREATOR_LIED_TO_US.get(), WritingTheCreatorLiedToUsTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.REEL.get(), ReelTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.SOUP_CANDLE.get(), SoupCandleTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CUTOUT_SINNY.get(), CutoutSinnyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.DESK_FANCY.get(), DeskFancyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.SHELF.get(), ShelfTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.JDS_SIGN.get(), JDSSignTileRenderer::new);
	}
}
