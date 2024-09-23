package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordingSignOnBlockModel;
import net.mcreator.bendymod.block.entity.RecordingSignOnTileEntity;

public class RecordingSignOnTileRenderer extends GeoBlockRenderer<RecordingSignOnTileEntity> {
	public RecordingSignOnTileRenderer() {
		super(new RecordingSignOnBlockModel());
	}

	@Override
	public RenderType getRenderType(RecordingSignOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
