package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ShelfDisplayModel;
import net.mcreator.bendymod.block.display.ShelfDisplayItem;

public class ShelfDisplayItemRenderer extends GeoItemRenderer<ShelfDisplayItem> {
	public ShelfDisplayItemRenderer() {
		super(new ShelfDisplayModel());
	}

	@Override
	public RenderType getRenderType(ShelfDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
