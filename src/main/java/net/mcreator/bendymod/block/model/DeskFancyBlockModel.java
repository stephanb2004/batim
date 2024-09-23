package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.DeskFancyTileEntity;

public class DeskFancyBlockModel extends GeoModel<DeskFancyTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(DeskFancyTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/fancytable.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DeskFancyTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/fancytable.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DeskFancyTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/fancytable.png");
	}
}
