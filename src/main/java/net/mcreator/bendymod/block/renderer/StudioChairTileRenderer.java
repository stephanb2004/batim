package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioChairBlockModel;
import net.mcreator.bendymod.block.entity.StudioChairTileEntity;

public class StudioChairTileRenderer extends GeoBlockRenderer<StudioChairTileEntity> {
	public StudioChairTileRenderer() {
		super(new StudioChairBlockModel());
	}

	@Override
	public RenderType getRenderType(StudioChairTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
