package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingDownHereWereAllSinnersDisplayItem;

public class WritingDownHereWereAllSinnersDisplayModel extends GeoModel<WritingDownHereWereAllSinnersDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/wallwriting_downherewereallsinners.png");
	}
}
