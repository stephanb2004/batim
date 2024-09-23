package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverPowerOffBlockModel;
import net.mcreator.bendymod.block.entity.LeverPowerOffTileEntity;

public class LeverPowerOffTileRenderer extends GeoBlockRenderer<LeverPowerOffTileEntity> {
	public LeverPowerOffTileRenderer() {
		super(new LeverPowerOffBlockModel());
	}

	@Override
	public RenderType getRenderType(LeverPowerOffTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
