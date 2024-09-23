package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyDollRLBlockModel;
import net.mcreator.bendymod.block.entity.BendyDollRLTileEntity;

public class BendyDollRLTileRenderer extends GeoBlockRenderer<BendyDollRLTileEntity> {
	public BendyDollRLTileRenderer() {
		super(new BendyDollRLBlockModel());
	}

	@Override
	public RenderType getRenderType(BendyDollRLTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
