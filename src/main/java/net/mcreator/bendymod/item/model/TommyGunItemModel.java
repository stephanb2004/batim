package net.mcreator.bendymod.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.item.TommyGunItem;

public class TommyGunItemModel extends GeoModel<TommyGunItem> {
	@Override
	public ResourceLocation getAnimationResource(TommyGunItem animatable) {
		return new ResourceLocation("bendymod", "animations/tommygun.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TommyGunItem animatable) {
		return new ResourceLocation("bendymod", "geo/tommygun.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TommyGunItem animatable) {
		return new ResourceLocation("bendymod", "textures/item/tommygun.png");
	}
}
