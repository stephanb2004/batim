package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.RecordBlockModel;
import net.mcreator.bendymod.block.entity.RecordTileEntity;

public class RecordTileRenderer extends GeoBlockRenderer<RecordTileEntity> {
	public RecordTileRenderer() {
		super(new RecordBlockModel());
	}

	@Override
	public RenderType getRenderType(RecordTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
