package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.TastyEatsMachineDisplayItem;

public class TastyEatsMachineDisplayModel extends GeoModel<TastyEatsMachineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TastyEatsMachineDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/tasty_eats.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TastyEatsMachineDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/tasty_eats.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TastyEatsMachineDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/tasty_eats.png");
	}
}
