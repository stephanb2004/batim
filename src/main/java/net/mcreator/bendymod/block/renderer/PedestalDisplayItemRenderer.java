package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalDisplayModel;
import net.mcreator.bendymod.block.display.PedestalDisplayItem;

public class PedestalDisplayItemRenderer extends GeoItemRenderer<PedestalDisplayItem> {
	public PedestalDisplayItemRenderer() {
		super(new PedestalDisplayModel());
	}

	@Override
	public RenderType getRenderType(PedestalDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
