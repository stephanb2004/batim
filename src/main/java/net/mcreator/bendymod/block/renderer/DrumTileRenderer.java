package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.DrumBlockModel;
import net.mcreator.bendymod.block.entity.DrumTileEntity;

public class DrumTileRenderer extends GeoBlockRenderer<DrumTileEntity> {
	public DrumTileRenderer() {
		super(new DrumBlockModel());
	}

	@Override
	public RenderType getRenderType(DrumTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
