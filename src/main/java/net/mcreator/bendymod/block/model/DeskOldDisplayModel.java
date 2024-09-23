package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.DeskOldDisplayItem;

public class DeskOldDisplayModel extends GeoModel<DeskOldDisplayItem> {
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
		return new ResourceLocation("bendymod", "textures/block/desk_henry.png");
	}
}
