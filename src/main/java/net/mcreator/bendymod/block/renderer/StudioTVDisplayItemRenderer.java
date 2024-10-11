package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioTVDisplayModel;
import net.mcreator.bendymod.block.display.StudioTVDisplayItem;

public class StudioTVDisplayItemRenderer extends GeoItemRenderer<StudioTVDisplayItem> {
	public StudioTVDisplayItemRenderer() {
		super(new StudioTVDisplayModel());
	}

	@Override
	public RenderType getRenderType(StudioTVDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
