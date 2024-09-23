package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutBendyDisplayModel;
import net.mcreator.bendymod.block.display.CutoutBendyDisplayItem;

public class CutoutBendyDisplayItemRenderer extends GeoItemRenderer<CutoutBendyDisplayItem> {
	public CutoutBendyDisplayItemRenderer() {
		super(new CutoutBendyDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutBendyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
