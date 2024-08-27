package net.mcreator.bendymod.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.InkMachineDisplayItem;

public class InkMachineDisplayModel extends AnimatedGeoModel<InkMachineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(InkMachineDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/ink_machine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(InkMachineDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/ink_machine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(InkMachineDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/blocks/ink_machine.png");
	}
}
