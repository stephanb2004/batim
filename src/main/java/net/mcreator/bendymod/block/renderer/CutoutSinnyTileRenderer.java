package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutSinnyBlockModel;
import net.mcreator.bendymod.block.entity.CutoutSinnyTileEntity;

public class CutoutSinnyTileRenderer extends GeoBlockRenderer<CutoutSinnyTileEntity> {
	public CutoutSinnyTileRenderer() {
		super(new CutoutSinnyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutSinnyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
