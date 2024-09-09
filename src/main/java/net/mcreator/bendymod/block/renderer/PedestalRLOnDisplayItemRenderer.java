package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalRLOnDisplayModel;
import net.mcreator.bendymod.block.display.PedestalRLOnDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PedestalRLOnDisplayItemRenderer extends GeoItemRenderer<PedestalRLOnDisplayItem> {
	public PedestalRLOnDisplayItemRenderer() {
		super(new PedestalRLOnDisplayModel());
	}

	@Override
	public RenderType getRenderType(PedestalRLOnDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
