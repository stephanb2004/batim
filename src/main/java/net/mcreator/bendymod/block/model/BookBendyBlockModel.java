package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BookBendyTileEntity;

public class BookBendyBlockModel extends AnimatedGeoModel<BookBendyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BookBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BookBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BookBendyTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/book_bendy.png");
	}
}
