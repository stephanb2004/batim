package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.FloorPipeBlockModel;
import net.mcreator.bendymod.block.entity.FloorPipeTileEntity;

public class FloorPipeTileRenderer extends GeoBlockRenderer<FloorPipeTileEntity> {
	public FloorPipeTileRenderer() {
		super(new FloorPipeBlockModel());
	}

	@Override
	public RenderType getRenderType(FloorPipeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
