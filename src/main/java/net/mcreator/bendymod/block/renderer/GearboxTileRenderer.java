package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.GearboxBlockModel;
import net.mcreator.bendymod.block.entity.GearboxTileEntity;

public class GearboxTileRenderer extends GeoBlockRenderer<GearboxTileEntity> {
	public GearboxTileRenderer() {
		super(new GearboxBlockModel());
	}

	@Override
	public RenderType getRenderType(GearboxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
