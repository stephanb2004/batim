package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SofaBlockModel;
import net.mcreator.bendymod.block.entity.SofaTileEntity;

public class SofaTileRenderer extends GeoBlockRenderer<SofaTileEntity> {
	public SofaTileRenderer() {
		super(new SofaBlockModel());
	}

	@Override
	public RenderType getRenderType(SofaTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
