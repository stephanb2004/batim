package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.RadioTileEntity;

public class RadioBlockModel extends GeoModel<RadioTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RadioTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/radio.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RadioTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/radio.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RadioTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/radio.png");
	}
}
