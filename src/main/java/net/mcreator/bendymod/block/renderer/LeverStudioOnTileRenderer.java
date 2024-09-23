package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LeverStudioOnBlockModel;
import net.mcreator.bendymod.block.entity.LeverStudioOnTileEntity;

public class LeverStudioOnTileRenderer extends GeoBlockRenderer<LeverStudioOnTileEntity> {
	public LeverStudioOnTileRenderer() {
		super(new LeverStudioOnBlockModel());
	}

	@Override
	public RenderType getRenderType(LeverStudioOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
