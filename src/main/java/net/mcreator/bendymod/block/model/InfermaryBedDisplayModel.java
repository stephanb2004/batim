package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.InfermaryBedDisplayItem;

public class InfermaryBedDisplayModel extends AnimatedGeoModel<InfermaryBedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InfermaryBedDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/infermary_bed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InfermaryBedDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/infermary_bed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InfermaryBedDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/infermary_bed.png");
	}
}
