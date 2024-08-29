package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.InkBarrelDisplayModel;
import net.mcreator.bendymod.block.display.InkBarrelDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class InkBarrelDisplayItemRenderer extends GeoItemRenderer<InkBarrelDisplayItem> {
	public InkBarrelDisplayItemRenderer() {
		super(new InkBarrelDisplayModel());
	}

	@Override
	public RenderType getRenderType(InkBarrelDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
