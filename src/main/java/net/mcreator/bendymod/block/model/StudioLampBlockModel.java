package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.StudioLampTileEntity;

public class StudioLampBlockModel extends AnimatedGeoModel<StudioLampTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StudioLampTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/studio_lamp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioLampTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/studio_lamp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioLampTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/studio_lamp.png");
	}
}
