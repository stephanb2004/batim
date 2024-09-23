package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.LittleMiracleStationBlockModel;
import net.mcreator.bendymod.block.entity.LittleMiracleStationTileEntity;

public class LittleMiracleStationTileRenderer extends GeoBlockRenderer<LittleMiracleStationTileEntity> {
	public LittleMiracleStationTileRenderer() {
		super(new LittleMiracleStationBlockModel());
	}

	@Override
	public RenderType getRenderType(LittleMiracleStationTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
