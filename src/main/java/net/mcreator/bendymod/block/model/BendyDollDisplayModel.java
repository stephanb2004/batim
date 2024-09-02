package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BendyDollDisplayItem;

public class BendyDollDisplayModel extends AnimatedGeoModel<BendyDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BendyDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bendydoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bendydoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyDollDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/bendydoll.png");
	}
}
