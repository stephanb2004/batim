package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BorisCloneDisplayItem;

public class BorisCloneDisplayModel extends AnimatedGeoModel<BorisCloneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BorisCloneDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/boris_clone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BorisCloneDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/boris_clone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BorisCloneDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/boris_clone.png");
	}
}
