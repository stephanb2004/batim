package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.FloorPipeDisplayModel;
import net.mcreator.bendymod.block.display.FloorPipeDisplayItem;

public class FloorPipeDisplayItemRenderer extends GeoItemRenderer<FloorPipeDisplayItem> {
	public FloorPipeDisplayItemRenderer() {
		super(new FloorPipeDisplayModel());
	}

	@Override
	public RenderType getRenderType(FloorPipeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
