package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SoupCandleDisplayModel;
import net.mcreator.bendymod.block.display.SoupCandleDisplayItem;

public class SoupCandleDisplayItemRenderer extends GeoItemRenderer<SoupCandleDisplayItem> {
	public SoupCandleDisplayItemRenderer() {
		super(new SoupCandleDisplayModel());
	}

	@Override
	public RenderType getRenderType(SoupCandleDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
