package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverStudioOffBlockModel;
import net.mcreator.bendymod.block.entity.LeverStudioOffTileEntity;

public class LeverStudioOffTileRenderer extends GeoBlockRenderer<LeverStudioOffTileEntity> {
	public LeverStudioOffTileRenderer() {
		super(new LeverStudioOffBlockModel());
	}

	@Override
	public RenderType getRenderType(LeverStudioOffTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
