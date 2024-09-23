package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.JumbledPaperTileEntity;

public class JumbledPaperBlockModel extends GeoModel<JumbledPaperTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JumbledPaperTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/paper_jumbled.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JumbledPaperTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/paper_jumbled.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JumbledPaperTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/paper.png");
	}
}
