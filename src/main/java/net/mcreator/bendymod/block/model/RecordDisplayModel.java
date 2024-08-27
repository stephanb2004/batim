package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.RecordDisplayItem;

public class RecordDisplayModel extends AnimatedGeoModel<RecordDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RecordDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/record.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/record.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/record.png");
	}
}
