package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WrenchDisplayModel;
import net.mcreator.bendymod.block.display.WrenchDisplayItem;

public class WrenchDisplayItemRenderer extends GeoItemRenderer<WrenchDisplayItem> {
	public WrenchDisplayItemRenderer() {
		super(new WrenchDisplayModel());
	}

	@Override
	public RenderType getRenderType(WrenchDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
