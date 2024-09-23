package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordingSignOffDisplayModel;
import net.mcreator.bendymod.block.display.RecordingSignOffDisplayItem;

public class RecordingSignOffDisplayItemRenderer extends GeoItemRenderer<RecordingSignOffDisplayItem> {
	public RecordingSignOffDisplayItemRenderer() {
		super(new RecordingSignOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(RecordingSignOffDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
