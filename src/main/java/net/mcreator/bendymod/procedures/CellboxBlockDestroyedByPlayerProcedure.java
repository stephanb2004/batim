package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.mcreator.bendymod.init.BendymodModItems;
import net.mcreator.bendymod.init.BendymodModBlocks;

public class CellboxBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == BendymodModBlocks.CELLBOX_1.get()) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(BendymodModItems.DRY_CELL.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (blockstate.getBlock() == BendymodModBlocks.CELLBOX_2.get()) {
			for (int index0 = 0; index0 < 2; index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(BendymodModItems.DRY_CELL.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
