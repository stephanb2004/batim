package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DeskFancyDisplayModel;
import net.mcreator.bendymod.block.display.DeskFancyDisplayItem;

public class DeskFancyDisplayItemRenderer extends GeoItemRenderer<DeskFancyDisplayItem> {
	public DeskFancyDisplayItemRenderer() {
		super(new DeskFancyDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeskFancyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
