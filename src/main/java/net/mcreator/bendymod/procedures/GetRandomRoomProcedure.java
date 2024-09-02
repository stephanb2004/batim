package net.mcreator.bendymod.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;

public class GetRandomRoomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double chance = 0;
		double result_x = 0;
		double result_z = 0;
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH) {
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
		}.getDirection(blockstate)) == Direction.EAST) {
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
		}.getDirection(blockstate)) == Direction.WEST) {
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
		}.getDirection(blockstate)) == Direction.SOUTH) {
			result_x = x;
			result_z = z + 1;
		}
		if ((world.getBlockState(new BlockPos(result_x, y, result_z))).getBlock() == Blocks.AIR) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get()) {
				chance = Mth.nextInt(RandomSource.create(), 1, 21);
				if (chance == 1) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 2) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 3) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 4) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 5) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 6) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 7) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 8) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 9) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 10) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 11) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "animatorsdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 12) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.DOWN) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 13) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 14) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_boarded"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_boarded"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_boarded"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "animatorsdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 15) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 16) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 17) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 18) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 19) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 20) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 21) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.RANDOM_ROOM_STRUCTURE_BLOCK.get()) {
				chance = Mth.nextInt(RandomSource.create(), 1, 30);
				if (chance == 1) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_0"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 2) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 3) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 4) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 5) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 6) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 7) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 8) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhalll_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 9) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 10) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 11) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_bori"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 12) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_cutout"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 13) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "lhallr_messages"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 14) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_boarded"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_boarded"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_boarded"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_boarded"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 15) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_ritual"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 16) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 17) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "thall_work"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 18) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_doorway"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 19) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_flood"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 20) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_sacrifice"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 21) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "xhall_storage"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 22) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "bendys_diner"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "bendys_diner"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "bendys_diner"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "bendys_diner"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 23) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "animatorsdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "animatorsdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "animatorsdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "animatorsdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 24) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "musicdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "musicdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "musicdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "musicdepartment_lobby"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
				if (chance == 25) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_animator"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_animator"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_animator"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_animator"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 26) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_basic"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 27) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_boris"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_boris"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_boris"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_boris"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 28) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_maze"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_maze"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_maze"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_maze"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 29) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_theater"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_theater"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_theater"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_theater"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (chance == 30) {
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
					}.getDirection(blockstate)) == Direction.NORTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_tiny"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.EAST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_tiny"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.WEST) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_tiny"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
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
					}.getDirection(blockstate)) == Direction.SOUTH) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "ritualroom_tiny"));
							if (template != null) {
								template.placeInWorld(_serverworld, new BlockPos(result_x, y, result_z), new BlockPos(result_x, y, result_z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
		}
	}
}
