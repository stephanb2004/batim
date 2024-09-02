package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PunchInCardDisplayModel;
import net.mcreator.bendymod.block.display.PunchInCardDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PunchInCardDisplayItemRenderer extends GeoItemRenderer<PunchInCardDisplayItem> {
	public PunchInCardDisplayItemRenderer() {
		super(new PunchInCardDisplayModel());
	}

	@Override
	public RenderType getRenderType(PunchInCardDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
