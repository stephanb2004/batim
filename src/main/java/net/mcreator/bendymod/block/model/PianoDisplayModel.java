package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.PianoDisplayItem;

public class PianoDisplayModel extends GeoModel<PianoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(PianoDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/piano.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PianoDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/piano.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PianoDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/piano.png");
	}
}
