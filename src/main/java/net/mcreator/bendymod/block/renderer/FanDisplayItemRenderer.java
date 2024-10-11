package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.FanDisplayModel;
import net.mcreator.bendymod.block.display.FanDisplayItem;

public class FanDisplayItemRenderer extends GeoItemRenderer<FanDisplayItem> {
	public FanDisplayItemRenderer() {
		super(new FanDisplayModel());
	}

	@Override
	public RenderType getRenderType(FanDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
