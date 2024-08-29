package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BendyStatueDisplayItem;

public class BendyStatueDisplayModel extends AnimatedGeoModel<BendyStatueDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BendyStatueDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bendy_statue.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyStatueDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bendy_statue.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyStatueDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/bendy_statue.png");
	}
}
