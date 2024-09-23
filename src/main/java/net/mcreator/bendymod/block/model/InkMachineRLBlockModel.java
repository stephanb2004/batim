package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.entity.InkMachineRLTileEntity;

public class InkMachineRLBlockModel extends GeoModel<InkMachineRLTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(InkMachineRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "animations/ink_machine_real.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkMachineRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "geo/ink_machine_real.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkMachineRLTileEntity animatable) {
		return new ResourceLocation("bendymod", "textures/block/ink_machine_real.png");
	}
}
