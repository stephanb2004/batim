package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ValveTileEntity;

public class ValveBlockModel extends GeoModel<ValveTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ValveTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/valve.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ValveTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/valve.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ValveTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/valve.png");
	}
}
