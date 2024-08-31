package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.WritingTheSheepWillComeToSlaughterTileEntity;

public class WritingTheSheepWillComeToSlaughterBlockModel extends AnimatedGeoModel<WritingTheSheepWillComeToSlaughterTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(WritingTheSheepWillComeToSlaughterTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/wall_writings.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WritingTheSheepWillComeToSlaughterTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/wall_writings.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WritingTheSheepWillComeToSlaughterTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/wallwriting_thesheepwillcometoslaughter.png");
	}
}
