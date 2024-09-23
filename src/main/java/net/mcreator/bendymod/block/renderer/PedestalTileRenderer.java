package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalBlockModel;
import net.mcreator.bendymod.block.entity.PedestalTileEntity;

public class PedestalTileRenderer extends GeoBlockRenderer<PedestalTileEntity> {
	public PedestalTileRenderer() {
		super(new PedestalBlockModel());
	}

	@Override
	public RenderType getRenderType(PedestalTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
