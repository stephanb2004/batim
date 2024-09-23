package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LittleMiracleStationDisplayModel;
import net.mcreator.bendymod.block.display.LittleMiracleStationDisplayItem;

public class LittleMiracleStationDisplayItemRenderer extends GeoItemRenderer<LittleMiracleStationDisplayItem> {
	public LittleMiracleStationDisplayItemRenderer() {
		super(new LittleMiracleStationDisplayModel());
	}

	@Override
	public RenderType getRenderType(LittleMiracleStationDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
