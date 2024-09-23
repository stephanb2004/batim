package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WorkTableTileEntity;

public class WorkTableBlockModel extends GeoModel<WorkTableTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WorkTableTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/worktable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WorkTableTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/worktable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WorkTableTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/worktable.png");
	}
}
