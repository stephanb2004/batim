package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ReelBlockModel;
import net.mcreator.bendymod.block.entity.ReelTileEntity;

public class ReelTileRenderer extends GeoBlockRenderer<ReelTileEntity> {
	public ReelTileRenderer() {
		super(new ReelBlockModel());
	}

	@Override
	public RenderType getRenderType(ReelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
