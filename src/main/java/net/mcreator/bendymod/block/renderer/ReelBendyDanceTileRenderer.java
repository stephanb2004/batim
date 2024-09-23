package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ReelBendyDanceBlockModel;
import net.mcreator.bendymod.block.entity.ReelBendyDanceTileEntity;

public class ReelBendyDanceTileRenderer extends GeoBlockRenderer<ReelBendyDanceTileEntity> {
	public ReelBendyDanceTileRenderer() {
		super(new ReelBendyDanceBlockModel());
	}

	@Override
	public RenderType getRenderType(ReelBendyDanceTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
