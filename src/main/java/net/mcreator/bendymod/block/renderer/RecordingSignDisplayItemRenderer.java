package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordingSignDisplayModel;
import net.mcreator.bendymod.block.display.RecordingSignDisplayItem;

public class RecordingSignDisplayItemRenderer extends GeoItemRenderer<RecordingSignDisplayItem> {
	public RecordingSignDisplayItemRenderer() {
		super(new RecordingSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(RecordingSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
