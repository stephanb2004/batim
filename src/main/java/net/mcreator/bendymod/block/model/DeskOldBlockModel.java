package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DeskOldTileEntity;

public class DeskOldBlockModel extends GeoModel<DeskOldTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeskOldTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/desk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskOldTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/desk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskOldTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/desk_henry.png");
	}
}
