package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.GearshiftDisplayModel;
import net.mcreator.bendymod.block.display.GearshiftDisplayItem;

public class GearshiftDisplayItemRenderer extends GeoItemRenderer<GearshiftDisplayItem> {
	public GearshiftDisplayItemRenderer() {
		super(new GearshiftDisplayModel());
	}

	@Override
	public RenderType getRenderType(GearshiftDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
