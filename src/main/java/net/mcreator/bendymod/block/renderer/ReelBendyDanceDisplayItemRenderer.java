package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ReelBendyDanceDisplayModel;
import net.mcreator.bendymod.block.display.ReelBendyDanceDisplayItem;

public class ReelBendyDanceDisplayItemRenderer extends GeoItemRenderer<ReelBendyDanceDisplayItem> {
	public ReelBendyDanceDisplayItemRenderer() {
		super(new ReelBendyDanceDisplayModel());
	}

	@Override
	public RenderType getRenderType(ReelBendyDanceDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
