package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WritingTheCreatorLiedToUsDisplayItem;

public class WritingTheCreatorLiedToUsDisplayModel extends GeoModel<WritingTheCreatorLiedToUsDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/wallwriting_thecreatorliedtous.png");
	}
}
