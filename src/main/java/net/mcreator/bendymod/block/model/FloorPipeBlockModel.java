package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.FloorPipeTileEntity;

public class FloorPipeBlockModel extends GeoModel<FloorPipeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(FloorPipeTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/floor_pipe.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FloorPipeTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/floor_pipe.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FloorPipeTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/floor_pipe.png");
	}
}
