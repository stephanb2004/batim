package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PunchInCardTileEntity;

public class PunchInCardBlockModel extends AnimatedGeoModel<PunchInCardTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PunchInCardTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/punchin_card.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PunchInCardTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/punchin_card.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PunchInCardTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/punchin_card.png");
	}
}
