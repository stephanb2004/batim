package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StoveDisplayModel;
import net.mcreator.bendymod.block.display.StoveDisplayItem;

public class StoveDisplayItemRenderer extends GeoItemRenderer<StoveDisplayItem> {
	public StoveDisplayItemRenderer() {
		super(new StoveDisplayModel());
	}

	@Override
	public RenderType getRenderType(StoveDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
