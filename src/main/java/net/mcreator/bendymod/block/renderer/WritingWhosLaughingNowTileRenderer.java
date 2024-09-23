package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingWhosLaughingNowBlockModel;
import net.mcreator.bendymod.block.entity.WritingWhosLaughingNowTileEntity;

public class WritingWhosLaughingNowTileRenderer extends GeoBlockRenderer<WritingWhosLaughingNowTileEntity> {
	public WritingWhosLaughingNowTileRenderer() {
		super(new WritingWhosLaughingNowBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingWhosLaughingNowTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
