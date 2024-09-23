package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingWhosLaughingNowDisplayModel;
import net.mcreator.bendymod.block.display.WritingWhosLaughingNowDisplayItem;

public class WritingWhosLaughingNowDisplayItemRenderer extends GeoItemRenderer<WritingWhosLaughingNowDisplayItem> {
	public WritingWhosLaughingNowDisplayItemRenderer() {
		super(new WritingWhosLaughingNowDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingWhosLaughingNowDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
