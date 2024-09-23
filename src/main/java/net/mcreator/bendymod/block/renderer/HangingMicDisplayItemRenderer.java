package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HangingMicDisplayModel;
import net.mcreator.bendymod.block.display.HangingMicDisplayItem;

public class HangingMicDisplayItemRenderer extends GeoItemRenderer<HangingMicDisplayItem> {
	public HangingMicDisplayItemRenderer() {
		super(new HangingMicDisplayModel());
	}

	@Override
	public RenderType getRenderType(HangingMicDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
