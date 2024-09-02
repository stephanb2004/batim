package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.Cellbox0DisplayModel;
import net.mcreator.bendymod.block.display.Cellbox0DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class Cellbox0DisplayItemRenderer extends GeoItemRenderer<Cellbox0DisplayItem> {
	public Cellbox0DisplayItemRenderer() {
		super(new Cellbox0DisplayModel());
	}

	@Override
	public RenderType getRenderType(Cellbox0DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
