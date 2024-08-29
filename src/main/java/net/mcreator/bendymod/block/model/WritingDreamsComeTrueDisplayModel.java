package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingDreamsComeTrueDisplayItem;

public class WritingDreamsComeTrueDisplayModel extends AnimatedGeoModel<WritingDreamsComeTrueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingDreamsComeTrueDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingDreamsComeTrueDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingDreamsComeTrueDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_dreamscometrue.png");
	}
}
