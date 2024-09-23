package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SpeakerBlockModel;
import net.mcreator.bendymod.block.entity.SpeakerTileEntity;

public class SpeakerTileRenderer extends GeoBlockRenderer<SpeakerTileEntity> {
	public SpeakerTileRenderer() {
		super(new SpeakerBlockModel());
	}

	@Override
	public RenderType getRenderType(SpeakerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
