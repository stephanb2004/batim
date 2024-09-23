package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.HeavyGateClosedTileEntity;

public class HeavyGateClosedBlockModel extends GeoModel<HeavyGateClosedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(HeavyGateClosedTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/gate_closed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyGateClosedTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/gate_closed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyGateClosedTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/gate.png");
	}
}
