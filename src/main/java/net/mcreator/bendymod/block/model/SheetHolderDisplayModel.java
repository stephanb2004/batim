package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.SheetHolderDisplayItem;

public class SheetHolderDisplayModel extends GeoModel<SheetHolderDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SheetHolderDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/sheetholder.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SheetHolderDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/sheetholder.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SheetHolderDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/sheetholder.png");
	}
}
