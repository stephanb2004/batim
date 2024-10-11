package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.GearshiftDisplayItem;

public class GearshiftDisplayModel extends GeoModel<GearshiftDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GearshiftDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/cog_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GearshiftDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/cog_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GearshiftDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/cog_box.png");
	}
}
