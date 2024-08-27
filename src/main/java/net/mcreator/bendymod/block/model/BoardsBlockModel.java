package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BoardsTileEntity;

public class BoardsBlockModel extends AnimatedGeoModel<BoardsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoardsTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoardsTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoardsTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/boards.png");
	}
}
