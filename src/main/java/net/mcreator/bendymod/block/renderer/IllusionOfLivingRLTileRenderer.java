package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.IllusionOfLivingRLBlockModel;
import net.mcreator.bendymod.block.entity.IllusionOfLivingRLTileEntity;

public class IllusionOfLivingRLTileRenderer extends GeoBlockRenderer<IllusionOfLivingRLTileEntity> {
	public IllusionOfLivingRLTileRenderer() {
		super(new IllusionOfLivingRLBlockModel());
	}

	@Override
	public RenderType getRenderType(IllusionOfLivingRLTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
