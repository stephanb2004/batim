package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingDownHereWereAllSinnersDisplayModel;
import net.mcreator.bendymod.block.display.WritingDownHereWereAllSinnersDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WritingDownHereWereAllSinnersDisplayItemRenderer extends GeoItemRenderer<WritingDownHereWereAllSinnersDisplayItem> {
	public WritingDownHereWereAllSinnersDisplayItemRenderer() {
		super(new WritingDownHereWereAllSinnersDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingDownHereWereAllSinnersDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
