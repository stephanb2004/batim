package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.TrashBinBlockModel;
import net.mcreator.bendymod.block.entity.TrashBinTileEntity;

public class TrashBinTileRenderer extends GeoBlockRenderer<TrashBinTileEntity> {
	public TrashBinTileRenderer() {
		super(new TrashBinBlockModel());
	}

	@Override
	public RenderType getRenderType(TrashBinTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
