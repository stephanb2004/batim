package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.HeavyGateClosedTileEntity;

public class HeavyGateClosedBlockModel extends AnimatedGeoModel<HeavyGateClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HeavyGateClosedTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/gate_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyGateClosedTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/gate_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyGateClosedTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/gate.png");
	}
}
