package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyClockDisplayModel;
import net.mcreator.bendymod.block.display.BendyClockDisplayItem;

public class BendyClockDisplayItemRenderer extends GeoItemRenderer<BendyClockDisplayItem> {
	public BendyClockDisplayItemRenderer() {
		super(new BendyClockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BendyClockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
