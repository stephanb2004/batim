package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverPowerOnBlockModel;
import net.mcreator.bendymod.block.entity.LeverPowerOnTileEntity;

public class LeverPowerOnTileRenderer extends GeoBlockRenderer<LeverPowerOnTileEntity> {
	public LeverPowerOnTileRenderer() {
		super(new LeverPowerOnBlockModel());
	}

	@Override
	public RenderType getRenderType(LeverPowerOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
