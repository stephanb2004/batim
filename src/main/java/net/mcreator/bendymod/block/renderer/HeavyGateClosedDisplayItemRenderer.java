package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HeavyGateClosedDisplayModel;
import net.mcreator.bendymod.block.display.HeavyGateClosedDisplayItem;

public class HeavyGateClosedDisplayItemRenderer extends GeoItemRenderer<HeavyGateClosedDisplayItem> {
	public HeavyGateClosedDisplayItemRenderer() {
		super(new HeavyGateClosedDisplayModel());
	}

	@Override
	public RenderType getRenderType(HeavyGateClosedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
