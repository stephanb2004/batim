package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalRLOnBlockModel;
import net.mcreator.bendymod.block.entity.PedestalRLOnTileEntity;

public class PedestalRLOnTileRenderer extends GeoBlockRenderer<PedestalRLOnTileEntity> {
	public PedestalRLOnTileRenderer() {
		super(new PedestalRLOnBlockModel());
	}

	@Override
	public RenderType getRenderType(PedestalRLOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
