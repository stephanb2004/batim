package net.mcreator.bendymod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.bendymod.block.model.MusicDepartmentSignBlockModel;
import net.mcreator.bendymod.block.entity.MusicDepartmentSignTileEntity;

public class MusicDepartmentSignTileRenderer extends GeoBlockRenderer<MusicDepartmentSignTileEntity> {
	public MusicDepartmentSignTileRenderer() {
		super(new MusicDepartmentSignBlockModel());
	}

	@Override
	public RenderType getRenderType(MusicDepartmentSignTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
