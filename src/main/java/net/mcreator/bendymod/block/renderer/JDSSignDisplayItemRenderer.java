package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.JDSSignDisplayModel;
import net.mcreator.bendymod.block.display.JDSSignDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JDSSignDisplayItemRenderer extends GeoItemRenderer<JDSSignDisplayItem> {
	public JDSSignDisplayItemRenderer() {
		super(new JDSSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(JDSSignDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
