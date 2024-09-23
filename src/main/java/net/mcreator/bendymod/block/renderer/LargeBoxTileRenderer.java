package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LargeBoxBlockModel;
import net.mcreator.bendymod.block.entity.LargeBoxTileEntity;

public class LargeBoxTileRenderer extends GeoBlockRenderer<LargeBoxTileEntity> {
	public LargeBoxTileRenderer() {
		super(new LargeBoxBlockModel());
	}

	@Override
	public RenderType getRenderType(LargeBoxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
