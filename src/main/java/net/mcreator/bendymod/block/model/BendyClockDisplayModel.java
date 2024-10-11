package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BendyClockDisplayItem;

public class BendyClockDisplayModel extends GeoModel<BendyClockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BendyClockDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/bendyclock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BendyClockDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/bendyclock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BendyClockDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/bendyclock.png");
	}
}
