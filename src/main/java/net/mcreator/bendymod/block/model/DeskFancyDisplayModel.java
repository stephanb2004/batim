package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.DeskFancyDisplayItem;

public class DeskFancyDisplayModel extends AnimatedGeoModel<DeskFancyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DeskFancyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/fancytable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskFancyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/fancytable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskFancyDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/fancytable.png");
	}
}
