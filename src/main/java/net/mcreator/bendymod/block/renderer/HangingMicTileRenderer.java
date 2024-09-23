package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HangingMicBlockModel;
import net.mcreator.bendymod.block.entity.HangingMicTileEntity;

public class HangingMicTileRenderer extends GeoBlockRenderer<HangingMicTileEntity> {
	public HangingMicTileRenderer() {
		super(new HangingMicBlockModel());
	}

	@Override
	public RenderType getRenderType(HangingMicTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
