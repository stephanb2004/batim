package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.AliceAngelDollDisplayItem;

public class AliceAngelDollDisplayModel extends GeoModel<AliceAngelDollDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AliceAngelDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/alice_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AliceAngelDollDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/alice_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AliceAngelDollDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/alice_plush.png");
	}
}
