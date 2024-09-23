package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverPowerOffDisplayModel;
import net.mcreator.bendymod.block.display.LeverPowerOffDisplayItem;

public class LeverPowerOffDisplayItemRenderer extends GeoItemRenderer<LeverPowerOffDisplayItem> {
	public LeverPowerOffDisplayItemRenderer() {
		super(new LeverPowerOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeverPowerOffDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
