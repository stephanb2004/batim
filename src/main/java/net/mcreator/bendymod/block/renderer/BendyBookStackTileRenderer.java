package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyBookStackBlockModel;
import net.mcreator.bendymod.block.entity.BendyBookStackTileEntity;

public class BendyBookStackTileRenderer extends GeoBlockRenderer<BendyBookStackTileEntity> {
	public BendyBookStackTileRenderer() {
		super(new BendyBookStackBlockModel());
	}

	@Override
	public RenderType getRenderType(BendyBookStackTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
