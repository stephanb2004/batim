package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingTheSheepWillComeToSlaughterDisplayItem;

public class WritingTheSheepWillComeToSlaughterDisplayModel extends GeoModel<WritingTheSheepWillComeToSlaughterDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/wallwriting_thesheepwillcometoslaughter.png");
	}
}
