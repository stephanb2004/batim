package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.IllusionOfLivingRLDisplayModel;
import net.mcreator.bendymod.block.display.IllusionOfLivingRLDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class IllusionOfLivingRLDisplayItemRenderer extends GeoItemRenderer<IllusionOfLivingRLDisplayItem> {
	public IllusionOfLivingRLDisplayItemRenderer() {
		super(new IllusionOfLivingRLDisplayModel());
	}

	@Override
	public RenderType getRenderType(IllusionOfLivingRLDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
