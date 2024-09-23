package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioChairDisplayModel;
import net.mcreator.bendymod.block.display.StudioChairDisplayItem;

public class StudioChairDisplayItemRenderer extends GeoItemRenderer<StudioChairDisplayItem> {
	public StudioChairDisplayItemRenderer() {
		super(new StudioChairDisplayModel());
	}

	@Override
	public RenderType getRenderType(StudioChairDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
