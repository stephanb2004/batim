package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DresserDisplayModel;
import net.mcreator.bendymod.block.display.DresserDisplayItem;

public class DresserDisplayItemRenderer extends GeoItemRenderer<DresserDisplayItem> {
	public DresserDisplayItemRenderer() {
		super(new DresserDisplayModel());
	}

	@Override
	public RenderType getRenderType(DresserDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
