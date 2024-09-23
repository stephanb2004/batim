package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DeskDisplayModel;
import net.mcreator.bendymod.block.display.DeskDisplayItem;

public class DeskDisplayItemRenderer extends GeoItemRenderer<DeskDisplayItem> {
	public DeskDisplayItemRenderer() {
		super(new DeskDisplayModel());
	}

	@Override
	public RenderType getRenderType(DeskDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
