package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DeskOldTileEntity;

public class DeskOldBlockModel extends AnimatedGeoModel<DeskOldTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeskOldTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/desk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskOldTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/desk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskOldTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/desk_henry.png");
	}
}
