package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WrenchRLTileEntity;

public class WrenchRLBlockModel extends AnimatedGeoModel<WrenchRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WrenchRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wrench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wrench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchRLTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wrench_batdr.png");
	}
}
