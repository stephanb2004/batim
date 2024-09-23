package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingDownHereWereAllSinnersBlockModel;
import net.mcreator.bendymod.block.entity.WritingDownHereWereAllSinnersTileEntity;

public class WritingDownHereWereAllSinnersTileRenderer extends GeoBlockRenderer<WritingDownHereWereAllSinnersTileEntity> {
	public WritingDownHereWereAllSinnersTileRenderer() {
		super(new WritingDownHereWereAllSinnersBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingDownHereWereAllSinnersTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
