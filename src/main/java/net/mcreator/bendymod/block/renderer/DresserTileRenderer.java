package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DresserBlockModel;
import net.mcreator.bendymod.block.entity.DresserTileEntity;

public class DresserTileRenderer extends GeoBlockRenderer<DresserTileEntity> {
	public DresserTileRenderer() {
		super(new DresserBlockModel());
	}

	@Override
	public RenderType getRenderType(DresserTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
