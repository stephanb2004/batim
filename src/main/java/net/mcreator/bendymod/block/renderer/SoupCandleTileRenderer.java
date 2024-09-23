package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SoupCandleBlockModel;
import net.mcreator.bendymod.block.entity.SoupCandleTileEntity;

public class SoupCandleTileRenderer extends GeoBlockRenderer<SoupCandleTileEntity> {
	public SoupCandleTileRenderer() {
		super(new SoupCandleBlockModel());
	}

	@Override
	public RenderType getRenderType(SoupCandleTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
