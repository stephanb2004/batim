package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.GearboxDisplayModel;
import net.mcreator.bendymod.block.display.GearboxDisplayItem;

public class GearboxDisplayItemRenderer extends GeoItemRenderer<GearboxDisplayItem> {
	public GearboxDisplayItemRenderer() {
		super(new GearboxDisplayModel());
	}

	@Override
	public RenderType getRenderType(GearboxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
