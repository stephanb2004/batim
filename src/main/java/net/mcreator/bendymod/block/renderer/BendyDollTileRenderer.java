package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyDollBlockModel;
import net.mcreator.bendymod.block.entity.BendyDollTileEntity;

public class BendyDollTileRenderer extends GeoBlockRenderer<BendyDollTileEntity> {
	public BendyDollTileRenderer() {
		super(new BendyDollBlockModel());
	}

	@Override
	public RenderType getRenderType(BendyDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
