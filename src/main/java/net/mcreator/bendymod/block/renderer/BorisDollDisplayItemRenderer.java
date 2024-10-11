package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BorisDollDisplayModel;
import net.mcreator.bendymod.block.display.BorisDollDisplayItem;

public class BorisDollDisplayItemRenderer extends GeoItemRenderer<BorisDollDisplayItem> {
	public BorisDollDisplayItemRenderer() {
		super(new BorisDollDisplayModel());
	}

	@Override
	public RenderType getRenderType(BorisDollDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
