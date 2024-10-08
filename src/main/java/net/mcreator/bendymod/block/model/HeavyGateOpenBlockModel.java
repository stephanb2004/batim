package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.HeavyGateOpenTileEntity;

public class HeavyGateOpenBlockModel extends GeoModel<HeavyGateOpenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HeavyGateOpenTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/gate_open.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyGateOpenTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/gate_open.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyGateOpenTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/gate.png");
	}
}
