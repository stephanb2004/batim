package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.WorkTableDisplayItem;

public class WorkTableDisplayModel extends AnimatedGeoModel<WorkTableDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(WorkTableDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/worktable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WorkTableDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/worktable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WorkTableDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/worktable.png");
	}
}
