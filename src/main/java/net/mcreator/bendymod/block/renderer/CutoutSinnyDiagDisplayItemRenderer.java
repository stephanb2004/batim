package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CutoutSinnyDiagDisplayModel;
import net.mcreator.bendymod.block.display.CutoutSinnyDiagDisplayItem;

public class CutoutSinnyDiagDisplayItemRenderer extends GeoItemRenderer<CutoutSinnyDiagDisplayItem> {
	public CutoutSinnyDiagDisplayItemRenderer() {
		super(new CutoutSinnyDiagDisplayModel());
	}

	@Override
	public RenderType getRenderType(CutoutSinnyDiagDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
