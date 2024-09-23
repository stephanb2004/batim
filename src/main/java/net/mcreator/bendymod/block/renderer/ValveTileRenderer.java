package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ValveBlockModel;
import net.mcreator.bendymod.block.entity.ValveTileEntity;

public class ValveTileRenderer extends GeoBlockRenderer<ValveTileEntity> {
	public ValveTileRenderer() {
		super(new ValveBlockModel());
	}

	@Override
	public RenderType getRenderType(ValveTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
