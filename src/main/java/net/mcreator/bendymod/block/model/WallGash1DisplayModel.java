package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WallGash1DisplayItem;

public class WallGash1DisplayModel extends AnimatedGeoModel<WallGash1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WallGash1DisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_gash1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WallGash1DisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_gash1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WallGash1DisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wall_gash1.png");
	}
}
