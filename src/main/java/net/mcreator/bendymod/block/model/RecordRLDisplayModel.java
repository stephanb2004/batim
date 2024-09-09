package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.RecordRLDisplayItem;

public class RecordRLDisplayModel extends AnimatedGeoModel<RecordRLDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RecordRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/record.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RecordRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/record.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RecordRLDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/record_batdr.png");
	}
}
