package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingTheCreatorLiedToUsDisplayItem;

public class WritingTheCreatorLiedToUsDisplayModel extends AnimatedGeoModel<WritingTheCreatorLiedToUsDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingTheCreatorLiedToUsDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingTheCreatorLiedToUsDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingTheCreatorLiedToUsDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_thecreatorliedtous.png");
	}
}
