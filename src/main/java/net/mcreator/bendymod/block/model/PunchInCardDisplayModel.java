package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PunchInCardDisplayItem;

public class PunchInCardDisplayModel extends GeoModel<PunchInCardDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PunchInCardDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/punchin_card.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PunchInCardDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/punchin_card.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PunchInCardDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/punchin_card.png");
	}
}
