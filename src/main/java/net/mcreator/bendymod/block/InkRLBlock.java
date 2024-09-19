
package net.mcreator.bendymod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.procedures.InkRLMobplayerCollidesBlockProcedure;
import net.mcreator.bendymod.init.BendymodModFluids;

public class InkRLBlock extends LiquidBlock {
	public InkRLBlock() {
		super(() -> BendymodModFluids.INK_RL.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		InkRLMobplayerCollidesBlockProcedure.execute(entity);
	}
}
