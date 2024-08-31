package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingTheSheepWillComeToSlaughterDisplayModel;
import net.mcreator.bendymod.block.display.WritingTheSheepWillComeToSlaughterDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WritingTheSheepWillComeToSlaughterDisplayItemRenderer extends GeoItemRenderer<WritingTheSheepWillComeToSlaughterDisplayItem> {
	public WritingTheSheepWillComeToSlaughterDisplayItemRenderer() {
		super(new WritingTheSheepWillComeToSlaughterDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingTheSheepWillComeToSlaughterDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
