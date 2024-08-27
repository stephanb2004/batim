package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.InkPipeStraightDisplayItem;

public class InkPipeStraightDisplayModel extends AnimatedGeoModel<InkPipeStraightDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InkPipeStraightDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pipe_straight.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkPipeStraightDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pipe_straight.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkPipeStraightDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pipe_straight.png");
	}
}
