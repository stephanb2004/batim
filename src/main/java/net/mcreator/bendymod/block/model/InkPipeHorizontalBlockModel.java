package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InkPipeHorizontalTileEntity;

public class InkPipeHorizontalBlockModel extends AnimatedGeoModel<InkPipeHorizontalTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InkPipeHorizontalTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/pipe_horizontal.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkPipeHorizontalTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/pipe_horizontal.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkPipeHorizontalTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/pipe_wall.png");
	}
}
