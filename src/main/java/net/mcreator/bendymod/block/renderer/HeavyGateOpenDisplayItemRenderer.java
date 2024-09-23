package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HeavyGateOpenDisplayModel;
import net.mcreator.bendymod.block.display.HeavyGateOpenDisplayItem;

public class HeavyGateOpenDisplayItemRenderer extends GeoItemRenderer<HeavyGateOpenDisplayItem> {
	public HeavyGateOpenDisplayItemRenderer() {
		super(new HeavyGateOpenDisplayModel());
	}

	@Override
	public RenderType getRenderType(HeavyGateOpenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
