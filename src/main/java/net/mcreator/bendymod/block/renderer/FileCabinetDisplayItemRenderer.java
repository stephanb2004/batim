package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.FileCabinetDisplayModel;
import net.mcreator.bendymod.block.display.FileCabinetDisplayItem;

public class FileCabinetDisplayItemRenderer extends GeoItemRenderer<FileCabinetDisplayItem> {
	public FileCabinetDisplayItemRenderer() {
		super(new FileCabinetDisplayModel());
	}

	@Override
	public RenderType getRenderType(FileCabinetDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
