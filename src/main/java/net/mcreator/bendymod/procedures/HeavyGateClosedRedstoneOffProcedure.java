package net.mcreator.bendymod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.BendymodMod;

import java.util.Map;

public class HeavyGateClosedRedstoneOffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level0 && _level0.hasNeighborSignal(BlockPos.containing(x, y, z))) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("animation") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			BendymodMod.queueServerWork(20, () -> {
				if (!world.isClientSide()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
				if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST || (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
					if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
						world.setBlock(BlockPos.containing(x, y, z - 2), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z - 2), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z - 2), Blocks.AIR.defaultBlockState(), 3);
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
						world.setBlock(BlockPos.containing(x, y, z + 2), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 1, z + 2), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y + 2, z + 2), Blocks.AIR.defaultBlockState(), 3);
					}
				}
				if ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH || (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
					if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
						world.setBlock(BlockPos.containing(x - 2, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x - 2, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x - 2, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
					} else if ((new Object() {
						public Direction getDirection(BlockState _bs) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp)
								return _bs.getValue(_dp);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
									? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
									: Direction.NORTH;
						}
					}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
						world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x + 2, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x + 2, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = BendymodModBlocks.HEAVY_GATE_OPEN.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			});
		}
	}
}
