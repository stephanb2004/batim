package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.MusicDepartmentSignTileEntity;

public class MusicDepartmentSignBlockModel extends AnimatedGeoModel<MusicDepartmentSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MusicDepartmentSignTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/sign_musicdepartment.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicDepartmentSignTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/sign_musicdepartment.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicDepartmentSignTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/sign_musicdepartment.png");
	}
}
