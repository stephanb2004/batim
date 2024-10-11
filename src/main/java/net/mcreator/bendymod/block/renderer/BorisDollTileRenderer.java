package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BorisDollBlockModel;
import net.mcreator.bendymod.block.entity.BorisDollTileEntity;

public class BorisDollTileRenderer extends GeoBlockRenderer<BorisDollTileEntity> {
	public BorisDollTileRenderer() {
		super(new BorisDollBlockModel());
	}

	@Override
	public RenderType getRenderType(BorisDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
