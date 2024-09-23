package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.PunchInCardTileEntity;

public class PunchInCardBlockModel extends GeoModel<PunchInCardTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(PunchInCardTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/punchin_card.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PunchInCardTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/punchin_card.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PunchInCardTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/punchin_card.png");
	}
}
