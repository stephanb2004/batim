package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.CassettePlayerDisplayItem;

public class CassettePlayerDisplayModel extends AnimatedGeoModel<CassettePlayerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CassettePlayerDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/cassette_player.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CassettePlayerDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/cassette_player.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CassettePlayerDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/cassetteplayer.png");
	}
}
