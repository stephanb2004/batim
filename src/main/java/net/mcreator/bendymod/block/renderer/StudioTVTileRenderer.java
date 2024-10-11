package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioTVBlockModel;
import net.mcreator.bendymod.block.entity.StudioTVTileEntity;

public class StudioTVTileRenderer extends GeoBlockRenderer<StudioTVTileEntity> {
	public StudioTVTileRenderer() {
		super(new StudioTVBlockModel());
	}

	@Override
	public RenderType getRenderType(StudioTVTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
