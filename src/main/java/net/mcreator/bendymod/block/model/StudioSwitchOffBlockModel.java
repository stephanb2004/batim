package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.StudioSwitchOffTileEntity;

public class StudioSwitchOffBlockModel extends GeoModel<StudioSwitchOffTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StudioSwitchOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/slide_lever_up.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StudioSwitchOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/slide_lever_up.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StudioSwitchOffTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/slide_lever.png");
	}
}
