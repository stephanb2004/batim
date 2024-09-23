package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.BorisCloneDisplayItem;

public class BorisCloneDisplayModel extends GeoModel<BorisCloneDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BorisCloneDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/boris_clone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BorisCloneDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/boris_clone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BorisCloneDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/boris_clone.png");
	}
}
