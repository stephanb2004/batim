package net.mcreator.bendymod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.block.display.MusicDepartmentSignDisplayItem;

public class MusicDepartmentSignDisplayModel extends GeoModel<MusicDepartmentSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MusicDepartmentSignDisplayItem animatable) {
		return new ResourceLocation("bendymod", "animations/sign_musicdepartment.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MusicDepartmentSignDisplayItem animatable) {
		return new ResourceLocation("bendymod", "geo/sign_musicdepartment.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MusicDepartmentSignDisplayItem entity) {
		return new ResourceLocation("bendymod", "textures/block/sign_musicdepartment.png");
	}
}
