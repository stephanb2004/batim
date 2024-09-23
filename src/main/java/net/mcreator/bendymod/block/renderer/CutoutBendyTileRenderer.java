package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutBendyBlockModel;
import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;

public class CutoutBendyTileRenderer extends GeoBlockRenderer<CutoutBendyTileEntity> {
	public CutoutBendyTileRenderer() {
		super(new CutoutBendyBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutBendyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
