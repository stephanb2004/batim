package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PedestalRLBlockModel;
import net.mcreator.bendymod.block.entity.PedestalRLTileEntity;

public class PedestalRLTileRenderer extends GeoBlockRenderer<PedestalRLTileEntity> {
	public PedestalRLTileRenderer() {
		super(new PedestalRLBlockModel());
	}

	@Override
	public RenderType getRenderType(PedestalRLTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
