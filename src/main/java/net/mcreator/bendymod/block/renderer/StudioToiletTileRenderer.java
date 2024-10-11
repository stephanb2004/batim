package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioToiletBlockModel;
import net.mcreator.bendymod.block.entity.StudioToiletTileEntity;

public class StudioToiletTileRenderer extends GeoBlockRenderer<StudioToiletTileEntity> {
	public StudioToiletTileRenderer() {
		super(new StudioToiletBlockModel());
	}

	@Override
	public RenderType getRenderType(StudioToiletTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
