package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingTheSheepWillComeToSlaughterBlockModel;
import net.mcreator.bendymod.block.entity.WritingTheSheepWillComeToSlaughterTileEntity;

public class WritingTheSheepWillComeToSlaughterTileRenderer extends GeoBlockRenderer<WritingTheSheepWillComeToSlaughterTileEntity> {
	public WritingTheSheepWillComeToSlaughterTileRenderer() {
		super(new WritingTheSheepWillComeToSlaughterBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingTheSheepWillComeToSlaughterTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
