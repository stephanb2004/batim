package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.JDSSignTileEntity;

public class JDSSignBlockModel extends AnimatedGeoModel<JDSSignTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JDSSignTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/jds.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JDSSignTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/jds.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JDSSignTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/joeydrewstudios_sign.png");
	}
}
