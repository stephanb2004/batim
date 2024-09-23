package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordRLBlockModel;
import net.mcreator.bendymod.block.entity.RecordRLTileEntity;

public class RecordRLTileRenderer extends GeoBlockRenderer<RecordRLTileEntity> {
	public RecordRLTileRenderer() {
		super(new RecordRLBlockModel());
	}

	@Override
	public RenderType getRenderType(RecordRLTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
