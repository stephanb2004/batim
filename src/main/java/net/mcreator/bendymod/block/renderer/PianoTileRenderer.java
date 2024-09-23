package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PianoBlockModel;
import net.mcreator.bendymod.block.entity.PianoTileEntity;

public class PianoTileRenderer extends GeoBlockRenderer<PianoTileEntity> {
	public PianoTileRenderer() {
		super(new PianoBlockModel());
	}

	@Override
	public RenderType getRenderType(PianoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
