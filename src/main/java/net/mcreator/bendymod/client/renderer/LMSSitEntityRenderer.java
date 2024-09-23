
package net.mcreator.bendymod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bendymod.entity.LMSSitEntityEntity;
import net.mcreator.bendymod.client.model.Modela;

public class LMSSitEntityRenderer extends MobRenderer<LMSSitEntityEntity, Modela<LMSSitEntityEntity>> {
	public LMSSitEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modela(context.bakeLayer(Modela.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LMSSitEntityEntity entity) {
		return new ResourceLocation("bendymod:textures/entities/seat.png");
	}
}
