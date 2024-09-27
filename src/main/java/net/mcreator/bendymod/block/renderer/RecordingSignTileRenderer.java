package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordingSignBlockModel;
import net.mcreator.bendymod.block.entity.RecordingSignTileEntity;

public class RecordingSignTileRenderer extends GeoBlockRenderer<RecordingSignTileEntity> {
	public RecordingSignTileRenderer() {
		super(new RecordingSignBlockModel());
	}

	@Override
	public RenderType getRenderType(RecordingSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
