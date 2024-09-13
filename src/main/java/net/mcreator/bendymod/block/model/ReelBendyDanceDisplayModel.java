package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ReelBendyDanceDisplayItem;

public class ReelBendyDanceDisplayModel extends AnimatedGeoModel<ReelBendyDanceDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ReelBendyDanceDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/reel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ReelBendyDanceDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/reel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ReelBendyDanceDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/reel.png");
	}
}
