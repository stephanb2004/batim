package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordingSignOffBlockModel;
import net.mcreator.bendymod.block.entity.RecordingSignOffTileEntity;

public class RecordingSignOffTileRenderer extends GeoBlockRenderer<RecordingSignOffTileEntity> {
	public RecordingSignOffTileRenderer() {
		super(new RecordingSignOffBlockModel());
	}

	@Override
	public RenderType getRenderType(RecordingSignOffTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
