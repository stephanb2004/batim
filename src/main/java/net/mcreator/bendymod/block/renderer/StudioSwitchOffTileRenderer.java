package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioSwitchOffBlockModel;
import net.mcreator.bendymod.block.entity.StudioSwitchOffTileEntity;

public class StudioSwitchOffTileRenderer extends GeoBlockRenderer<StudioSwitchOffTileEntity> {
	public StudioSwitchOffTileRenderer() {
		super(new StudioSwitchOffBlockModel());
	}

	@Override
	public RenderType getRenderType(StudioSwitchOffTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
