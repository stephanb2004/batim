package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.ToolboxTileEntity;

public class ToolboxBlockModel extends AnimatedGeoModel<ToolboxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ToolboxTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/toolbox.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToolboxTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/toolbox.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToolboxTileEntity entity) {
		return new ResourceLocation("bendymod", "textures/blocks/toolbox.png");
	}
}
