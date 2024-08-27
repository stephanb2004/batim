
package net.mcreator.bendymod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.entity.model.BendyModel;
import net.mcreator.bendymod.entity.BendyEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BendyRenderer extends GeoEntityRenderer<BendyEntity> {
	public BendyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BendyModel());
		this.shadowRadius = 0.312f;
	}

	@Override
	public RenderType getRenderType(BendyEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.875f, 0.875f, 0.875f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
