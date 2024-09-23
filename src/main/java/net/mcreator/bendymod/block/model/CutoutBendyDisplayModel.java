package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CutoutBendyDisplayItem;

public class CutoutBendyDisplayModel extends GeoModel<CutoutBendyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CutoutBendyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/cutout_bendy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CutoutBendyDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/cutout_bendy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CutoutBendyDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/cutout_bendy.png");
	}
}
