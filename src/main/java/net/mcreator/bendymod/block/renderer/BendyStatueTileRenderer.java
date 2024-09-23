package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.BendyStatueBlockModel;
import net.mcreator.bendymod.block.entity.BendyStatueTileEntity;

public class BendyStatueTileRenderer extends GeoBlockRenderer<BendyStatueTileEntity> {
	public BendyStatueTileRenderer() {
		super(new BendyStatueBlockModel());
	}

	@Override
	public RenderType getRenderType(BendyStatueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
