package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutBendyDiagDisplayModel;
import net.mcreator.bendymod.block.display.CutoutBendyDiagDisplayItem;

public class CutoutBendyDiagDisplayItemRenderer extends GeoItemRenderer<CutoutBendyDiagDisplayItem> {
	public CutoutBendyDiagDisplayItemRenderer() {
		super(new CutoutBendyDiagDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutBendyDiagDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
