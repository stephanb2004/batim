package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BassBlockModel;
import net.mcreator.bendymod.block.entity.BassTileEntity;

public class BassTileRenderer extends GeoBlockRenderer<BassTileEntity> {
	public BassTileRenderer() {
		super(new BassBlockModel());
	}

	@Override
	public RenderType getRenderType(BassTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
