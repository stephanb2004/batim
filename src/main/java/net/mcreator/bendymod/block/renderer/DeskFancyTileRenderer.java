package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DeskFancyBlockModel;
import net.mcreator.bendymod.block.entity.DeskFancyTileEntity;

public class DeskFancyTileRenderer extends GeoBlockRenderer<DeskFancyTileEntity> {
	public DeskFancyTileRenderer() {
		super(new DeskFancyBlockModel());
	}

	@Override
	public RenderType getRenderType(DeskFancyTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
