package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BassDisplayModel;
import net.mcreator.bendymod.block.display.BassDisplayItem;

public class BassDisplayItemRenderer extends GeoItemRenderer<BassDisplayItem> {
	public BassDisplayItemRenderer() {
		super(new BassDisplayModel());
	}

	@Override
	public RenderType getRenderType(BassDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
