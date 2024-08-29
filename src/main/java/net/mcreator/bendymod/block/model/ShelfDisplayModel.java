package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ShelfDisplayItem;

public class ShelfDisplayModel extends AnimatedGeoModel<ShelfDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ShelfDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/shelf.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShelfDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/shelf.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShelfDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/shelf.png");
	}
}
