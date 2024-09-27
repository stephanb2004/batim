package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.FileCabinetDisplayItem;

public class FileCabinetDisplayModel extends GeoModel<FileCabinetDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FileCabinetDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/filecabinet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FileCabinetDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/filecabinet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FileCabinetDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/filebacinet.png");
	}
}
