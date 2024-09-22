package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.DeskOldDisplayItem;

public class DeskOldDisplayModel extends AnimatedGeoModel<DeskOldDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeskOldDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/desk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskOldDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/desk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskOldDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/desk_henry.png");
	}
}
