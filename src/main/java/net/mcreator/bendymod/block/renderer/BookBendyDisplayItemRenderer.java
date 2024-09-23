package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BookBendyDisplayModel;
import net.mcreator.bendymod.block.display.BookBendyDisplayItem;

public class BookBendyDisplayItemRenderer extends GeoItemRenderer<BookBendyDisplayItem> {
	public BookBendyDisplayItemRenderer() {
		super(new BookBendyDisplayModel());
	}

	@Override
	public RenderType getRenderType(BookBendyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
