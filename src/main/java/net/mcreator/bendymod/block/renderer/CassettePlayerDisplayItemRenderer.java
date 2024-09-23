package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.CassettePlayerDisplayModel;
import net.mcreator.bendymod.block.display.CassettePlayerDisplayItem;

public class CassettePlayerDisplayItemRenderer extends GeoItemRenderer<CassettePlayerDisplayItem> {
	public CassettePlayerDisplayItemRenderer() {
		super(new CassettePlayerDisplayModel());
	}

	@Override
	public RenderType getRenderType(CassettePlayerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
