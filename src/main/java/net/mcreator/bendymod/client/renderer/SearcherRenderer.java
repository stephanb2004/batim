
package net.mcreator.bendymod.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.entity.model.SearcherModel;
import net.mcreator.bendymod.entity.SearcherEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SearcherRenderer extends GeoEntityRenderer<SearcherEntity> {
	public SearcherRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SearcherModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(SearcherEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(SearcherEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
