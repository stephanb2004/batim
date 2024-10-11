package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CagedLampDisplayModel;
import net.mcreator.bendymod.block.display.CagedLampDisplayItem;

public class CagedLampDisplayItemRenderer extends GeoItemRenderer<CagedLampDisplayItem> {
	public CagedLampDisplayItemRenderer() {
		super(new CagedLampDisplayModel());
	}

	@Override
	public RenderType getRenderType(CagedLampDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
