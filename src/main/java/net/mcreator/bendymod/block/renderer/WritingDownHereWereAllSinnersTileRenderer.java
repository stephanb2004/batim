package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingDownHereWereAllSinnersBlockModel;
import net.mcreator.bendymod.block.entity.WritingDownHereWereAllSinnersTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class WritingDownHereWereAllSinnersTileRenderer extends GeoBlockRenderer<WritingDownHereWereAllSinnersTileEntity> {
	public WritingDownHereWereAllSinnersTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new WritingDownHereWereAllSinnersBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingDownHereWereAllSinnersTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
