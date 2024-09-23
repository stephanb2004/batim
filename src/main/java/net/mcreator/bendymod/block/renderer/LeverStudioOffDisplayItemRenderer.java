package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverStudioOffDisplayModel;
import net.mcreator.bendymod.block.display.LeverStudioOffDisplayItem;

public class LeverStudioOffDisplayItemRenderer extends GeoItemRenderer<LeverStudioOffDisplayItem> {
	public LeverStudioOffDisplayItemRenderer() {
		super(new LeverStudioOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeverStudioOffDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
