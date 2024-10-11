package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.FanBlockModel;
import net.mcreator.bendymod.block.entity.FanTileEntity;

public class FanTileRenderer extends GeoBlockRenderer<FanTileEntity> {
	public FanTileRenderer() {
		super(new FanBlockModel());
	}

	@Override
	public RenderType getRenderType(FanTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
