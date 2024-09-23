package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutBendyDiagBlockModel;
import net.mcreator.bendymod.block.entity.CutoutBendyDiagTileEntity;

public class CutoutBendyDiagTileRenderer extends GeoBlockRenderer<CutoutBendyDiagTileEntity> {
	public CutoutBendyDiagTileRenderer() {
		super(new CutoutBendyDiagBlockModel());
	}

	@Override
	public RenderType getRenderType(CutoutBendyDiagTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
