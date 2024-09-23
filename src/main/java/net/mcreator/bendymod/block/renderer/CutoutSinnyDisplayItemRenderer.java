package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutSinnyDisplayModel;
import net.mcreator.bendymod.block.display.CutoutSinnyDisplayItem;

public class CutoutSinnyDisplayItemRenderer extends GeoItemRenderer<CutoutSinnyDisplayItem> {
	public CutoutSinnyDisplayItemRenderer() {
		super(new CutoutSinnyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutSinnyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
