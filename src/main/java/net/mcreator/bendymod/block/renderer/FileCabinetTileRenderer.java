package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.FileCabinetBlockModel;
import net.mcreator.bendymod.block.entity.FileCabinetTileEntity;

public class FileCabinetTileRenderer extends GeoBlockRenderer<FileCabinetTileEntity> {
	public FileCabinetTileRenderer() {
		super(new FileCabinetBlockModel());
	}

	@Override
	public RenderType getRenderType(FileCabinetTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
