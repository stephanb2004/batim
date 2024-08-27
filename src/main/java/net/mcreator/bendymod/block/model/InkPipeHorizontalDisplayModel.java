package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.InkPipeHorizontalDisplayItem;

public class InkPipeHorizontalDisplayModel extends AnimatedGeoModel<InkPipeHorizontalDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InkPipeHorizontalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/pipe_horizontal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkPipeHorizontalDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/pipe_horizontal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkPipeHorizontalDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pipe_wall.png");
	}
}
