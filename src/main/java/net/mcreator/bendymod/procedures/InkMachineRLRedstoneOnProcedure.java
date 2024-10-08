package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;

public class InkMachineRLRedstoneOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 2, y + 1, z - 2))).getBlock() == BendymodModBlocks.GEAR_RL.get() && (world.getBlockState(BlockPos.containing(x + 4, y + 1, z - 2))).getBlock() == BendymodModBlocks.WRENCH_RL.get()
				&& (world.getBlockState(BlockPos.containing(x + 6, y + 1, z - 2))).getBlock() == BendymodModBlocks.ILLUSION_OF_LIVING_RL.get()
				&& (world.getBlockState(BlockPos.containing(x + 2, y + 1, z + 2))).getBlock() == BendymodModBlocks.INKWELL_RL.get() && (world.getBlockState(BlockPos.containing(x + 4, y + 1, z + 2))).getBlock() == BendymodModBlocks.RECORD_RL.get()
				&& (world.getBlockState(BlockPos.containing(x + 6, y + 1, z + 2))).getBlock() == BendymodModBlocks.BENDY_DOLL_RL.get()) {
			world.setBlock(BlockPos.containing(x, y, z + 1), BendymodModBlocks.INK_RL.get().defaultBlockState(), 3);
			if (world instanceof Level _level)
				_level.updateNeighborsAt(BlockPos.containing(x, y, z + 1), _level.getBlockState(BlockPos.containing(x, y, z + 1)).getBlock());
		}
	}
}
