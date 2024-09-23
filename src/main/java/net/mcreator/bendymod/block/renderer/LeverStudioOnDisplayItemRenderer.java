package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverStudioOnDisplayModel;
import net.mcreator.bendymod.block.display.LeverStudioOnDisplayItem;

public class LeverStudioOnDisplayItemRenderer extends GeoItemRenderer<LeverStudioOnDisplayItem> {
	public LeverStudioOnDisplayItemRenderer() {
		super(new LeverStudioOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeverStudioOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
