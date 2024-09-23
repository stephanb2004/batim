package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InkMachineTileEntity;

public class InkMachineBlockModel extends GeoModel<InkMachineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InkMachineTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/ink_machine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkMachineTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/ink_machine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkMachineTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/ink_machine.png");
	}
}
