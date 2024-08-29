
package net.mcreator.bendymod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.bendymod.init.BendymodModFluids;

public class InkBlock extends LiquidBlock {
	public InkBlock() {
		super(() -> BendymodModFluids.INK.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}
}
