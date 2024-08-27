package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.InkPipeVerticalDisplayItem;

public class InkPipeVerticalDisplayModel extends AnimatedGeoModel<InkPipeVerticalDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InkPipeVerticalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pipe_vertical.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkPipeVerticalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pipe_vertical.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkPipeVerticalDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pipe_wall.png");
	}
}
