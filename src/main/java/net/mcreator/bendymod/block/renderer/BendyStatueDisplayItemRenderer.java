package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyStatueDisplayModel;
import net.mcreator.bendymod.block.display.BendyStatueDisplayItem;

public class BendyStatueDisplayItemRenderer extends GeoItemRenderer<BendyStatueDisplayItem> {
	public BendyStatueDisplayItemRenderer() {
		super(new BendyStatueDisplayModel());
	}

	@Override
	public RenderType getRenderType(BendyStatueDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
