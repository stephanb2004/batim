package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.WritingSingWithMeBlockModel;
import net.mcreator.bendymod.block.entity.WritingSingWithMeTileEntity;

public class WritingSingWithMeTileRenderer extends GeoBlockRenderer<WritingSingWithMeTileEntity> {
	public WritingSingWithMeTileRenderer() {
		super(new WritingSingWithMeBlockModel());
	}

	@Override
	public RenderType getRenderType(WritingSingWithMeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
