package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BookBendyDisplayItem;

public class BookBendyDisplayModel extends GeoModel<BookBendyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BookBendyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BookBendyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BookBendyDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/book_bendy.png");
	}
}
