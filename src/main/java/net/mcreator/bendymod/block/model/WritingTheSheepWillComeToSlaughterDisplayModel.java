package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingTheSheepWillComeToSlaughterDisplayItem;

public class WritingTheSheepWillComeToSlaughterDisplayModel extends AnimatedGeoModel<WritingTheSheepWillComeToSlaughterDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WritingTheSheepWillComeToSlaughterDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingTheSheepWillComeToSlaughterDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingTheSheepWillComeToSlaughterDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_thesheepwillcometoslaughter.png");
	}
}
