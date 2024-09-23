package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingTheCreatorLiedToUsBlockModel;
import net.mcreator.bendymod.block.entity.WritingTheCreatorLiedToUsTileEntity;

public class WritingTheCreatorLiedToUsTileRenderer extends GeoBlockRenderer<WritingTheCreatorLiedToUsTileEntity> {
	public WritingTheCreatorLiedToUsTileRenderer() {
		super(new WritingTheCreatorLiedToUsBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingTheCreatorLiedToUsTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
