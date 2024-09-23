package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WrenchTileEntity;

public class WrenchBlockModel extends GeoModel<WrenchTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WrenchTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wrench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wrench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wrench.png");
	}
}
