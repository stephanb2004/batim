package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutSinnyDiagBlockModel;
import net.mcreator.bendymod.block.entity.CutoutSinnyDiagTileEntity;

public class CutoutSinnyDiagTileRenderer extends GeoBlockRenderer<CutoutSinnyDiagTileEntity> {
	public CutoutSinnyDiagTileRenderer() {
		super(new CutoutSinnyDiagBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutSinnyDiagTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
