package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyClockBlockModel;
import net.mcreator.bendymod.block.entity.BendyClockTileEntity;

public class BendyClockTileRenderer extends GeoBlockRenderer<BendyClockTileEntity> {
	public BendyClockTileRenderer() {
		super(new BendyClockBlockModel());
	}

	@Override
	public RenderType getRenderType(BendyClockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
