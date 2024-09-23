package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.SheetHolderDisplayModel;
import net.mcreator.bendymod.block.display.SheetHolderDisplayItem;

public class SheetHolderDisplayItemRenderer extends GeoItemRenderer<SheetHolderDisplayItem> {
	public SheetHolderDisplayItemRenderer() {
		super(new SheetHolderDisplayModel());
	}

	@Override
	public RenderType getRenderType(SheetHolderDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
