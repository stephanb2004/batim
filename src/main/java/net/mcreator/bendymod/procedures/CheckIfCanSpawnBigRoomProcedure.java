package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class CheckIfCanSpawnBigRoomProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		boolean done_choosing = false;
		boolean big_room = false;
		double chance = 0;
		double result_z = 0;
		double room_variation2 = 0;
		double room_variation1 = 0;
		double result_x = 0;
		double top_y_level = 0;
		double rarity = 0;
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH) {
			if ((world.getBlockState(BlockPos.containing(result_x + 17, y + 16, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 16, result_z - 18))).getBlock() == Blocks.AIR
					&& (world.getBlockState(BlockPos.containing(result_x + 17, y + 16, result_z - 18))).getBlock() == Blocks.AIR) {
				big_room = true;
			} else {
				big_room = false;
			}
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.EAST) {
			if ((world.getBlockState(BlockPos.containing(x, y, result_z - 17))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(result_x - 17, y, z))).getBlock() == Blocks.AIR
					&& (world.getBlockState(BlockPos.containing(result_x - 17, y, result_z - 17))).getBlock() == Blocks.AIR) {
				big_room = true;
			} else {
				big_room = false;
			}
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.WEST) {
			if ((world.getBlockState(BlockPos.containing(x, y, result_z + 17))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(result_x + 17, y, z))).getBlock() == Blocks.AIR
					&& (world.getBlockState(BlockPos.containing(result_x + 17, y, result_z + 17))).getBlock() == Blocks.AIR) {
				big_room = true;
			} else {
				big_room = false;
			}
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.SOUTH) {
			if ((world.getBlockState(BlockPos.containing(result_x - 17, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y, result_z + 18))).getBlock() == Blocks.AIR
					&& (world.getBlockState(BlockPos.containing(result_x - 17, y, result_z + 18))).getBlock() == Blocks.AIR) {
				big_room = true;
			} else {
				big_room = false;
			}
		}
		return big_room;
	}
}
