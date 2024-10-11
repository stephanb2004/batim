package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StoveBlockModel;
import net.mcreator.bendymod.block.entity.StoveTileEntity;

public class StoveTileRenderer extends GeoBlockRenderer<StoveTileEntity> {
	public StoveTileRenderer() {
		super(new StoveBlockModel());
	}

	@Override
	public RenderType getRenderType(StoveTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
