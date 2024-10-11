package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.GentValvesDisplayModel;
import net.mcreator.bendymod.block.display.GentValvesDisplayItem;

public class GentValvesDisplayItemRenderer extends GeoItemRenderer<GentValvesDisplayItem> {
	public GentValvesDisplayItemRenderer() {
		super(new GentValvesDisplayModel());
	}

	@Override
	public RenderType getRenderType(GentValvesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
