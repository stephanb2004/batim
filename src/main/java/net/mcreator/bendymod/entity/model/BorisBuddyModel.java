package net.mcreator.bendymod.entity.model;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.bendymod.entity.BorisBuddyEntity;

public class BorisBuddyModel extends AnimatedGeoModel<BorisBuddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BorisBuddyEntity entity) {
		return new ResourceLocation("bendymod", "animations/boris_buddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BorisBuddyEntity entity) {
		return new ResourceLocation("bendymod", "geo/boris_buddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BorisBuddyEntity entity) {
		return new ResourceLocation("bendymod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BorisBuddyEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("Head");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
