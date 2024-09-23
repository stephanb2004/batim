package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectionBlankDisplayModel;
import net.mcreator.bendymod.block.display.ProjectionBlankDisplayItem;

public class ProjectionBlankDisplayItemRenderer extends GeoItemRenderer<ProjectionBlankDisplayItem> {
	public ProjectionBlankDisplayItemRenderer() {
		super(new ProjectionBlankDisplayModel());
	}

	@Override
	public RenderType getRenderType(ProjectionBlankDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
