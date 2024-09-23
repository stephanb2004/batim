package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LargeBoxDisplayModel;
import net.mcreator.bendymod.block.display.LargeBoxDisplayItem;

public class LargeBoxDisplayItemRenderer extends GeoItemRenderer<LargeBoxDisplayItem> {
	public LargeBoxDisplayItemRenderer() {
		super(new LargeBoxDisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeBoxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
