package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BoardsDisplayItem;

public class BoardsDisplayModel extends GeoModel<BoardsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BoardsDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoardsDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoardsDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/boards.png");
	}
}
