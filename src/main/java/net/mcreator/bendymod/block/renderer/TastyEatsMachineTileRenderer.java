package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.TastyEatsMachineBlockModel;
import net.mcreator.bendymod.block.entity.TastyEatsMachineTileEntity;

public class TastyEatsMachineTileRenderer extends GeoBlockRenderer<TastyEatsMachineTileEntity> {
	public TastyEatsMachineTileRenderer() {
		super(new TastyEatsMachineBlockModel());
	}

	@Override
	public RenderType getRenderType(TastyEatsMachineTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
