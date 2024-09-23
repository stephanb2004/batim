package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HatRackBlockModel;
import net.mcreator.bendymod.block.entity.HatRackTileEntity;

public class HatRackTileRenderer extends GeoBlockRenderer<HatRackTileEntity> {
	public HatRackTileRenderer() {
		super(new HatRackBlockModel());
	}

	@Override
	public RenderType getRenderType(HatRackTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
