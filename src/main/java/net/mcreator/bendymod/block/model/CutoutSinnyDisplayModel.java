package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CutoutSinnyDisplayItem;

public class CutoutSinnyDisplayModel extends GeoModel<CutoutSinnyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutSinnyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutSinnyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutSinnyDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/cutout_sinny.png");
	}
}
