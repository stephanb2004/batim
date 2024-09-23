package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.Cellbox2DisplayItem;

public class Cellbox2DisplayModel extends GeoModel<Cellbox2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox2DisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox2DisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox2DisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/cellbox.png");
	}
}
