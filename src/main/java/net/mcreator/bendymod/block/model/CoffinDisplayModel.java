package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CoffinDisplayItem;

public class CoffinDisplayModel extends GeoModel<CoffinDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CoffinDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/coffin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CoffinDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/coffin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CoffinDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/coffin.png");
	}
}
