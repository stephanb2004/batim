package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BookBendyDisplayItem;

public class BookBendyDisplayModel extends AnimatedGeoModel<BookBendyDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/blocks/book_bendy.png");
	}
}
