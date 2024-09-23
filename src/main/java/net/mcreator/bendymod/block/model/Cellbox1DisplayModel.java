package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.Cellbox1DisplayItem;

public class Cellbox1DisplayModel extends GeoModel<Cellbox1DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Cellbox1DisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/cellbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cellbox1DisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/cellbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cellbox1DisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/cellbox_1.png");
	}
}
