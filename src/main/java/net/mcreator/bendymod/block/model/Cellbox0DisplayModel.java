package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.Cellbox0DisplayItem;

public class Cellbox0DisplayModel extends GeoModel<Cellbox0DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox0DisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox0DisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox0DisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/cellbox_0.png");
	}
}
