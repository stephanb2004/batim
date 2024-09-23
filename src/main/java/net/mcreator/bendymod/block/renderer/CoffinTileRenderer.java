package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CoffinBlockModel;
import net.mcreator.bendymod.block.entity.CoffinTileEntity;

public class CoffinTileRenderer extends GeoBlockRenderer<CoffinTileEntity> {
	public CoffinTileRenderer() {
		super(new CoffinBlockModel());
	}

	@Override
	public RenderType getRenderType(CoffinTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
