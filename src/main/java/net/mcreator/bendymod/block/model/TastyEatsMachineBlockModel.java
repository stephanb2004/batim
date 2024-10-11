package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.TastyEatsMachineTileEntity;

public class TastyEatsMachineBlockModel extends GeoModel<TastyEatsMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TastyEatsMachineTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/tasty_eats.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TastyEatsMachineTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/tasty_eats.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TastyEatsMachineTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/tasty_eats.png");
	}
}
