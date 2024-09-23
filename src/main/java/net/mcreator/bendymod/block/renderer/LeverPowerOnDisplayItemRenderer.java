package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverPowerOnDisplayModel;
import net.mcreator.bendymod.block.display.LeverPowerOnDisplayItem;

public class LeverPowerOnDisplayItemRenderer extends GeoItemRenderer<LeverPowerOnDisplayItem> {
	public LeverPowerOnDisplayItemRenderer() {
		super(new LeverPowerOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeverPowerOnDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
