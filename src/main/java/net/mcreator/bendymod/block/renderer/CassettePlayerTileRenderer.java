package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CassettePlayerBlockModel;
import net.mcreator.bendymod.block.entity.CassettePlayerTileEntity;

public class CassettePlayerTileRenderer extends GeoBlockRenderer<CassettePlayerTileEntity> {
	public CassettePlayerTileRenderer() {
		super(new CassettePlayerBlockModel());
	}

	@Override
	public RenderType getRenderType(CassettePlayerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
