package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.MusicDepartmentSignDisplayModel;
import net.mcreator.bendymod.block.display.MusicDepartmentSignDisplayItem;

public class MusicDepartmentSignDisplayItemRenderer extends GeoItemRenderer<MusicDepartmentSignDisplayItem> {
	public MusicDepartmentSignDisplayItemRenderer() {
		super(new MusicDepartmentSignDisplayModel());
	}

	@Override
	public RenderType getRenderType(MusicDepartmentSignDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
