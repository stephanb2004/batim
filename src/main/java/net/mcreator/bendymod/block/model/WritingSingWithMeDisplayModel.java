package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingSingWithMeDisplayItem;

public class WritingSingWithMeDisplayModel extends AnimatedGeoModel<WritingSingWithMeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingSingWithMeDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingSingWithMeDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingSingWithMeDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_singwithme.png");
	}
}
