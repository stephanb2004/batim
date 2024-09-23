package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.HeavyGateClosedBlockModel;
import net.mcreator.bendymod.block.entity.HeavyGateClosedTileEntity;

public class HeavyGateClosedTileRenderer extends GeoBlockRenderer<HeavyGateClosedTileEntity> {
	public HeavyGateClosedTileRenderer() {
		super(new HeavyGateClosedBlockModel());
	}

	@Override
	public RenderType getRenderType(HeavyGateClosedTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
