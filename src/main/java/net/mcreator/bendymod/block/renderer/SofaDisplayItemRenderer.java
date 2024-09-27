package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SofaDisplayModel;
import net.mcreator.bendymod.block.display.SofaDisplayItem;

public class SofaDisplayItemRenderer extends GeoItemRenderer<SofaDisplayItem> {
	public SofaDisplayItemRenderer() {
		super(new SofaDisplayModel());
	}

	@Override
	public RenderType getRenderType(SofaDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
