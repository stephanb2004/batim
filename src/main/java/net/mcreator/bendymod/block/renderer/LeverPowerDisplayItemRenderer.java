package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverPowerDisplayModel;
import net.mcreator.bendymod.block.display.LeverPowerDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class LeverPowerDisplayItemRenderer extends GeoItemRenderer<LeverPowerDisplayItem> {
	public LeverPowerDisplayItemRenderer() {
		super(new LeverPowerDisplayModel());
	}

	@Override
	public RenderType getRenderType(LeverPowerDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
