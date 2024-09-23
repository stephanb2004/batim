package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalOnBlockModel;
import net.mcreator.bendymod.block.entity.PedestalOnTileEntity;

public class PedestalOnTileRenderer extends GeoBlockRenderer<PedestalOnTileEntity> {
	public PedestalOnTileRenderer() {
		super(new PedestalOnBlockModel());
	}

	@Override
	public RenderType getRenderType(PedestalOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
