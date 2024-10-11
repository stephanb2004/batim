package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.AliceAngelDollBlockModel;
import net.mcreator.bendymod.block.entity.AliceAngelDollTileEntity;

public class AliceAngelDollTileRenderer extends GeoBlockRenderer<AliceAngelDollTileEntity> {
	public AliceAngelDollTileRenderer() {
		super(new AliceAngelDollBlockModel());
	}

	@Override
	public RenderType getRenderType(AliceAngelDollTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
