package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CagedLampBlockModel;
import net.mcreator.bendymod.block.entity.CagedLampTileEntity;

public class CagedLampTileRenderer extends GeoBlockRenderer<CagedLampTileEntity> {
	public CagedLampTileRenderer() {
		super(new CagedLampBlockModel());
	}

	@Override
	public RenderType getRenderType(CagedLampTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
