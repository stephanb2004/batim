package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingDownHereWereAllSinnersDisplayItem;

public class WritingDownHereWereAllSinnersDisplayModel extends AnimatedGeoModel<WritingDownHereWereAllSinnersDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingDownHereWereAllSinnersDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingDownHereWereAllSinnersDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingDownHereWereAllSinnersDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_downherewereallsinners.png");
	}
}
