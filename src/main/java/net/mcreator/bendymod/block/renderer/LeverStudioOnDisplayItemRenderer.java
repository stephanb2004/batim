package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverStudioOnDisplayModel;
import net.mcreator.bendymod.block.display.LeverStudioOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LeverStudioOnDisplayItemRenderer extends GeoItemRenderer<LeverStudioOnDisplayItem> {
	public LeverStudioOnDisplayItemRenderer() {
		super(new LeverStudioOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeverStudioOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
