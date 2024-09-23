package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DeskBlockModel;
import net.mcreator.bendymod.block.entity.DeskTileEntity;

public class DeskTileRenderer extends GeoBlockRenderer<DeskTileEntity> {
	public DeskTileRenderer() {
		super(new DeskBlockModel());
	}

	@Override
	public RenderType getRenderType(DeskTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
