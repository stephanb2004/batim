package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyDollDisplayModel;
import net.mcreator.bendymod.block.display.BendyDollDisplayItem;

public class BendyDollDisplayItemRenderer extends GeoItemRenderer<BendyDollDisplayItem> {
	public BendyDollDisplayItemRenderer() {
		super(new BendyDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(BendyDollDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
