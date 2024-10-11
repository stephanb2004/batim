package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioToiletDisplayModel;
import net.mcreator.bendymod.block.display.StudioToiletDisplayItem;

public class StudioToiletDisplayItemRenderer extends GeoItemRenderer<StudioToiletDisplayItem> {
	public StudioToiletDisplayItemRenderer() {
		super(new StudioToiletDisplayModel());
	}

	@Override
	public RenderType getRenderType(StudioToiletDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
