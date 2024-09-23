package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BookBendyTileEntity;

public class BookBendyBlockModel extends GeoModel<BookBendyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BookBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/illusionofliving.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BookBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/illusionofliving.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BookBendyTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/book_bendy.png");
	}
}
