package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BendyDollRLDisplayItem;

public class BendyDollRLDisplayModel extends AnimatedGeoModel<BendyDollRLDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BendyDollRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bendydoll.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyDollRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bendydoll.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyDollRLDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/bendydoll_batdr.png");
	}
}
