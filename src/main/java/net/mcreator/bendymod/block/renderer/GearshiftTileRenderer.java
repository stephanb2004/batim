package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.GearshiftBlockModel;
import net.mcreator.bendymod.block.entity.GearshiftTileEntity;

public class GearshiftTileRenderer extends GeoBlockRenderer<GearshiftTileEntity> {
	public GearshiftTileRenderer() {
		super(new GearshiftBlockModel());
	}

	@Override
	public RenderType getRenderType(GearshiftTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
