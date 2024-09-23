package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.HatRackDisplayItem;

public class HatRackDisplayModel extends GeoModel<HatRackDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HatRackDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/hatrack.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HatRackDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/hatrack.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HatRackDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/hatrack.png");
	}
}
