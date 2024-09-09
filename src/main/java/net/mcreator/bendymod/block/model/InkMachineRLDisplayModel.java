package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.InkMachineRLDisplayItem;

public class InkMachineRLDisplayModel extends AnimatedGeoModel<InkMachineRLDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InkMachineRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/ink_machine_real.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkMachineRLDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/ink_machine_real.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkMachineRLDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/ink_machine_real.png");
	}
}
