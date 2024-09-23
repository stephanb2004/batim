package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ViolinBlockModel;
import net.mcreator.bendymod.block.entity.ViolinTileEntity;

public class ViolinTileRenderer extends GeoBlockRenderer<ViolinTileEntity> {
	public ViolinTileRenderer() {
		super(new ViolinBlockModel());
	}

	@Override
	public RenderType getRenderType(ViolinTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
