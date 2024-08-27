
package net.mcreator.bendymod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.entity.model.SammyLawrenceModel;
import net.mcreator.bendymod.entity.SammyLawrenceEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SammyLawrenceRenderer extends GeoEntityRenderer<SammyLawrenceEntity> {
	public SammyLawrenceRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SammyLawrenceModel());
		this.shadowRadius = 0.312f;
	}

	@Override
	public RenderType getRenderType(SammyLawrenceEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(SammyLawrenceEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
