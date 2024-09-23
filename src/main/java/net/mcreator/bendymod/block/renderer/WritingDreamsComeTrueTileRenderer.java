package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingDreamsComeTrueBlockModel;
import net.mcreator.bendymod.block.entity.WritingDreamsComeTrueTileEntity;

public class WritingDreamsComeTrueTileRenderer extends GeoBlockRenderer<WritingDreamsComeTrueTileEntity> {
	public WritingDreamsComeTrueTileRenderer() {
		super(new WritingDreamsComeTrueBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingDreamsComeTrueTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
