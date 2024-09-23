package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.InkBarrelDisplayItem;

public class InkBarrelDisplayModel extends GeoModel<InkBarrelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InkBarrelDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/ink_barrel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkBarrelDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/ink_barrel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkBarrelDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/ink_barrel.png");
	}
}
