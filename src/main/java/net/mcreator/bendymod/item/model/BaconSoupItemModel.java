package net.mcreator.bendymod.item.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.item.BaconSoupItem;

public class BaconSoupItemModel extends AnimatedGeoModel<BaconSoupItem> {
	@Override
	public ResourceLocation getAnimationResource(BaconSoupItem animatable) {
		return new ResourceLocation("bendymod", "animations/baconsoup.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BaconSoupItem animatable) {
		return new ResourceLocation("bendymod", "geo/baconsoup.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BaconSoupItem animatable) {
		return new ResourceLocation("bendymod", "textures/items/baconsoup.png");
	}
}
