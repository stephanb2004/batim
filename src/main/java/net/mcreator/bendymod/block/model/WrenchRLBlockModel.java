package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WrenchRLTileEntity;

public class WrenchRLBlockModel extends GeoModel<WrenchRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WrenchRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wrench.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WrenchRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wrench.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WrenchRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/wrench_batdr.png");
	}
}
