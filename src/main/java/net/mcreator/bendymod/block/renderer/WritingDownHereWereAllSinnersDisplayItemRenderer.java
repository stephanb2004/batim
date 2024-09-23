package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingDownHereWereAllSinnersDisplayModel;
import net.mcreator.bendymod.block.display.WritingDownHereWereAllSinnersDisplayItem;

public class WritingDownHereWereAllSinnersDisplayItemRenderer extends GeoItemRenderer<WritingDownHereWereAllSinnersDisplayItem> {
	public WritingDownHereWereAllSinnersDisplayItemRenderer() {
		super(new WritingDownHereWereAllSinnersDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingDownHereWereAllSinnersDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
