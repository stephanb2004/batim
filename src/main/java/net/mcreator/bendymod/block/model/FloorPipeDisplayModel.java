package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.FloorPipeDisplayItem;

public class FloorPipeDisplayModel extends GeoModel<FloorPipeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FloorPipeDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/floor_pipe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FloorPipeDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/floor_pipe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FloorPipeDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/floor_pipe.png");
	}
}
