package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;

public class NewStructureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double chance = 0;
		double result_x = 0;
		double result_z = 0;
		double time = 0;
		boolean finished_choosing = false;
		boolean start_choosing = false;
		boolean made_variable = false;
		if (made_variable == false) {
			finished_choosing = false;
			made_variable = true;
		}
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
			result_x = x;
			result_z = z - 1;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST) {
			result_x = x + 1;
			result_z = z;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
			result_x = x - 1;
			result_z = z;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
			result_x = x;
			result_z = z + 1;
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.RANDOM_ROOM_STRUCTURE_BLOCK.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.STAIRWAY_STRUCTURE_BLOCK.get()) {
			GetRandomStructureProcedure.execute(world, x, y, z, blockstate);
		}
		for (int index0 = 0; index0 < 1; index0++) {
			SetStructureBlocksProcedure.execute(world, x, y, z);
			SetStructureBlocksProcedure.execute(world, x, y, z + 17);
			SetStructureBlocksProcedure.execute(world, x, y, z - 17);
			SetStructureBlocksProcedure.execute(world, x, y, z + 16);
			SetStructureBlocksProcedure.execute(world, x, y, z - 16);
			SetStructureBlocksProcedure.execute(world, x - 17, y, z);
			SetStructureBlocksProcedure.execute(world, x + 17, y, z);
			SetStructureBlocksProcedure.execute(world, x - 16, y, z);
			SetStructureBlocksProcedure.execute(world, x + 16, y, z);
			SetStructureBlocksProcedure.execute(world, x - 17, y, z - 17);
			SetStructureBlocksProcedure.execute(world, x - 17, y, z + 17);
			SetStructureBlocksProcedure.execute(world, x - 16, y, z - 16);
			SetStructureBlocksProcedure.execute(world, x - 16, y, z + 16);
			SetStructureBlocksProcedure.execute(world, x + 17, y, z + 17);
			SetStructureBlocksProcedure.execute(world, x + 17, y, z - 17);
			SetStructureBlocksProcedure.execute(world, x + 16, y, z + 16);
			SetStructureBlocksProcedure.execute(world, x + 16, y, z - 16);
		}
	}
}
