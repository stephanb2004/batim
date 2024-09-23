package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ViolinDisplayModel;
import net.mcreator.bendymod.block.display.ViolinDisplayItem;

public class ViolinDisplayItemRenderer extends GeoItemRenderer<ViolinDisplayItem> {
	public ViolinDisplayItemRenderer() {
		super(new ViolinDisplayModel());
	}

	@Override
	public RenderType getRenderType(ViolinDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
