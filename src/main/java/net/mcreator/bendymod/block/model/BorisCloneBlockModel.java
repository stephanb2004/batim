package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BorisCloneTileEntity;

public class BorisCloneBlockModel extends GeoModel<BorisCloneTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BorisCloneTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/boris_clone.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BorisCloneTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/boris_clone.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BorisCloneTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/boris_clone.png");
	}
}
