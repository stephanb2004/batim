package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HeavyGateOpenBlockModel;
import net.mcreator.bendymod.block.entity.HeavyGateOpenTileEntity;

public class HeavyGateOpenTileRenderer extends GeoBlockRenderer<HeavyGateOpenTileEntity> {
	public HeavyGateOpenTileRenderer() {
		super(new HeavyGateOpenBlockModel());
	}

	@Override
	public RenderType getRenderType(HeavyGateOpenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
