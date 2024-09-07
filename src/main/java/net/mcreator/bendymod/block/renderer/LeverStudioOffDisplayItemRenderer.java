package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverStudioOffDisplayModel;
import net.mcreator.bendymod.block.display.LeverStudioOffDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LeverStudioOffDisplayItemRenderer extends GeoItemRenderer<LeverStudioOffDisplayItem> {
	public LeverStudioOffDisplayItemRenderer() {
		super(new LeverStudioOffDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeverStudioOffDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
