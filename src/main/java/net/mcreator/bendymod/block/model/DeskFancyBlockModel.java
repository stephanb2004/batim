package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DeskFancyTileEntity;

public class DeskFancyBlockModel extends AnimatedGeoModel<DeskFancyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeskFancyTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/fancytable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskFancyTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/fancytable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskFancyTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/fancytable.png");
	}
}
