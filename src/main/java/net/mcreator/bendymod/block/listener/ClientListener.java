package net.mcreator.bendymod.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bendymod.init.BendymodModBlockEntities;
import net.mcreator.bendymod.block.renderer.WritingWhosLaughingNowTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingTheSheepWillComeToSlaughterTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingTheCreatorLiedToUsTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingSingWithMeTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingItsTimeToBelieveTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingDreamsComeTrueTileRenderer;
import net.mcreator.bendymod.block.renderer.WritingDownHereWereAllSinnersTileRenderer;
import net.mcreator.bendymod.block.renderer.WorkTableTileRenderer;
import net.mcreator.bendymod.block.renderer.ValveTileRenderer;
import net.mcreator.bendymod.block.renderer.TrashBinTileRenderer;
import net.mcreator.bendymod.block.renderer.ToolboxTileRenderer;
import net.mcreator.bendymod.block.renderer.StudioChairTileRenderer;
import net.mcreator.bendymod.block.renderer.SpeakerTileRenderer;
import net.mcreator.bendymod.block.renderer.SoupCandleTileRenderer;
import net.mcreator.bendymod.block.renderer.ShelfTileRenderer;
import net.mcreator.bendymod.block.renderer.ReelTileRenderer;
import net.mcreator.bendymod.block.renderer.RecordingSignOnTileRenderer;
import net.mcreator.bendymod.block.renderer.RecordingSignOffTileRenderer;
import net.mcreator.bendymod.block.renderer.RecordTileRenderer;
import net.mcreator.bendymod.block.renderer.RadioTileRenderer;
import net.mcreator.bendymod.block.renderer.ProjectorTileRenderer;
import net.mcreator.bendymod.block.renderer.MusicDepartmentSignTileRenderer;
import net.mcreator.bendymod.block.renderer.LeverStudioTileRenderer;
import net.mcreator.bendymod.block.renderer.LeverPowerTileRenderer;
import net.mcreator.bendymod.block.renderer.JumbledPaperTileRenderer;
import net.mcreator.bendymod.block.renderer.JDSSignTileRenderer;
import net.mcreator.bendymod.block.renderer.InkMachineTileRenderer;
import net.mcreator.bendymod.block.renderer.InkBarrelTileRenderer;
import net.mcreator.bendymod.block.renderer.HatRackTileRenderer;
import net.mcreator.bendymod.block.renderer.GearboxTileRenderer;
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
		event.registerBlockEntityRenderer(BendymodModBlockEntities.REEL.get(), ReelTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.SOUP_CANDLE.get(), SoupCandleTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.DESK_FANCY.get(), DeskFancyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.SHELF.get(), ShelfTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.JDS_SIGN.get(), JDSSignTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WORK_TABLE.get(), WorkTableTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.MUSIC_DEPARTMENT_SIGN.get(), MusicDepartmentSignTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.GEARBOX.get(), GearboxTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.TOOLBOX.get(), ToolboxTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.HAT_RACK.get(), HatRackTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_DREAMS_COME_TRUE.get(), WritingDreamsComeTrueTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_WHOS_LAUGHING_NOW.get(), WritingWhosLaughingNowTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_THE_CREATOR_LIED_TO_US.get(), WritingTheCreatorLiedToUsTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_ITS_TIME_TO_BELIEVE.get(), WritingItsTimeToBelieveTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_THE_SHEEP_WILL_COME_TO_SLAUGHTER.get(), WritingTheSheepWillComeToSlaughterTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_SING_WITH_ME.get(), WritingSingWithMeTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.WRITING_DOWN_HERE_WERE_ALL_SINNERS.get(), WritingDownHereWereAllSinnersTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.CUTOUT_SINNY.get(), CutoutSinnyTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.RECORDING_SIGN_OFF.get(), RecordingSignOffTileRenderer::new);
		event.registerBlockEntityRenderer(BendymodModBlockEntities.RECORDING_SIGN_ON.get(), RecordingSignOnTileRenderer::new);
	}
}
