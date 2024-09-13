package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WallGash1DisplayModel;
import net.mcreator.bendymod.block.display.WallGash1DisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WallGash1DisplayItemRenderer extends GeoItemRenderer<WallGash1DisplayItem> {
	public WallGash1DisplayItemRenderer() {
		super(new WallGash1DisplayModel());
	}

	@Override
	public RenderType getRenderType(WallGash1DisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
