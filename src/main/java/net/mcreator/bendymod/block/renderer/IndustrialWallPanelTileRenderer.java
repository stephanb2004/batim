package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.IndustrialWallPanelBlockModel;
import net.mcreator.bendymod.block.entity.IndustrialWallPanelTileEntity;

public class IndustrialWallPanelTileRenderer extends GeoBlockRenderer<IndustrialWallPanelTileEntity> {
	public IndustrialWallPanelTileRenderer() {
		super(new IndustrialWallPanelBlockModel());
	}

	@Override
	public RenderType getRenderType(IndustrialWallPanelTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
