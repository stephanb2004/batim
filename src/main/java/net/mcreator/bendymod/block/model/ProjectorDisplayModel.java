package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.ProjectorDisplayItem;

public class ProjectorDisplayModel extends GeoModel<ProjectorDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ProjectorDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/projector.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ProjectorDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/projector.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ProjectorDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/projector.png");
	}
}
