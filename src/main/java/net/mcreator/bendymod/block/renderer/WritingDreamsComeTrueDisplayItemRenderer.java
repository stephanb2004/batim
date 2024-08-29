package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingDreamsComeTrueDisplayModel;
import net.mcreator.bendymod.block.display.WritingDreamsComeTrueDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WritingDreamsComeTrueDisplayItemRenderer extends GeoItemRenderer<WritingDreamsComeTrueDisplayItem> {
	public WritingDreamsComeTrueDisplayItemRenderer() {
		super(new WritingDreamsComeTrueDisplayModel());
	}

	@Override
	public RenderType getRenderType(WritingDreamsComeTrueDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
