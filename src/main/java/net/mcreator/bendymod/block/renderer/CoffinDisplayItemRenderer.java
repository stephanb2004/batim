package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CoffinDisplayModel;
import net.mcreator.bendymod.block.display.CoffinDisplayItem;

public class CoffinDisplayItemRenderer extends GeoItemRenderer<CoffinDisplayItem> {
	public CoffinDisplayItemRenderer() {
		super(new CoffinDisplayModel());
	}

	@Override
	public RenderType getRenderType(CoffinDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
