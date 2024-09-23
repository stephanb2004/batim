package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.IllusionOfLivingBlockModel;
import net.mcreator.bendymod.block.entity.IllusionOfLivingTileEntity;

public class IllusionOfLivingTileRenderer extends GeoBlockRenderer<IllusionOfLivingTileEntity> {
	public IllusionOfLivingTileRenderer() {
		super(new IllusionOfLivingBlockModel());
	}

	@Override
	public RenderType getRenderType(IllusionOfLivingTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
