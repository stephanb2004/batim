package net.mcreator.bendymod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bendymod.entity.PiperEntity;

public class PiperModel extends GeoModel<PiperEntity> {
	@Override
	public ResourceLocation getAnimationResource(PiperEntity entity) {
		return new ResourceLocation("bendymod", "animations/piper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PiperEntity entity) {
		return new ResourceLocation("bendymod", "geo/piper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PiperEntity entity) {
		return new ResourceLocation("bendymod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(PiperEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
