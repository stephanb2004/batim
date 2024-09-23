package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.BoardsTileEntity;

public class BoardsBlockModel extends GeoModel<BoardsTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BoardsTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/boards.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BoardsTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/boards.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BoardsTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/boards.png");
	}
}
