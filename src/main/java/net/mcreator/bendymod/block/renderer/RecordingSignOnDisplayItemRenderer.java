package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordingSignOnDisplayModel;
import net.mcreator.bendymod.block.display.RecordingSignOnDisplayItem;

public class RecordingSignOnDisplayItemRenderer extends GeoItemRenderer<RecordingSignOnDisplayItem> {
	public RecordingSignOnDisplayItemRenderer() {
		super(new RecordingSignOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(RecordingSignOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
