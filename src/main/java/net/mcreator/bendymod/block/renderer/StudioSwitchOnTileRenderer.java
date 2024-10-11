package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.StudioSwitchOnBlockModel;
import net.mcreator.bendymod.block.entity.StudioSwitchOnTileEntity;

public class StudioSwitchOnTileRenderer extends GeoBlockRenderer<StudioSwitchOnTileEntity> {
	public StudioSwitchOnTileRenderer() {
		super(new StudioSwitchOnBlockModel());
	}

	@Override
	public RenderType getRenderType(StudioSwitchOnTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
