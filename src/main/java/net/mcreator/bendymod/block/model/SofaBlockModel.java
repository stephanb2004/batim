package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.SofaTileEntity;

public class SofaBlockModel extends GeoModel<SofaTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SofaTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/sofa.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SofaTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/sofa.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SofaTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/sofa.png");
	}
}
