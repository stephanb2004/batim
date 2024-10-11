package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.ProjectionDisplayModel;
import net.mcreator.bendymod.block.display.ProjectionDisplayItem;

public class ProjectionDisplayItemRenderer extends GeoItemRenderer<ProjectionDisplayItem> {
	public ProjectionDisplayItemRenderer() {
		super(new ProjectionDisplayModel());
	}

	@Override
	public RenderType getRenderType(ProjectionDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
