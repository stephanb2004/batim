package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.GentValvesBlockModel;
import net.mcreator.bendymod.block.entity.GentValvesTileEntity;

public class GentValvesTileRenderer extends GeoBlockRenderer<GentValvesTileEntity> {
	public GentValvesTileRenderer() {
		super(new GentValvesBlockModel());
	}

	@Override
	public RenderType getRenderType(GentValvesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
