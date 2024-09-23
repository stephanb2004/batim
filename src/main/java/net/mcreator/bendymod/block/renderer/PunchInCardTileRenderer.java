package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.PunchInCardBlockModel;
import net.mcreator.bendymod.block.entity.PunchInCardTileEntity;

public class PunchInCardTileRenderer extends GeoBlockRenderer<PunchInCardTileEntity> {
	public PunchInCardTileRenderer() {
		super(new PunchInCardBlockModel());
	}

	@Override
	public RenderType getRenderType(PunchInCardTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
