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
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModBlocks;

public class GetLevel0HallwaysProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		boolean done_choosing = false;
		double chance = 0;
		double result_z = 0;
		double result_x = 0;
		double top_y_level = 0;
		double room_variation1 = 0;
		double rarity = 0;
		double chance2 = 0;
		top_y_level = 304;
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
		if ((world.getBlockState(BlockPos.containing(result_x, y, result_z))).getBlock() == Blocks.AIR) {
			while (done_choosing == false) {
				rarity = GetRoomRarityProcedure.execute();
				if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get()) {
					room_variation1 = Mth.nextInt(RandomSource.create(), 1, 5);
					if (rarity == 1) {
						if (room_variation1 == 1) {
							chance = Mth.nextInt(RandomSource.create(), 1, 4);
							if (chance == 1) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 2) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 3) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 2 && BendymodModVariables.MapVariables.get(world).breakerroom_spawned == true && BendymodModVariables.MapVariables.get(world).inkmachine_spawned == true) {
							chance = Mth.nextInt(RandomSource.create(), 1, 2);
							if (chance == 2) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 3 && BendymodModVariables.MapVariables.get(world).breakerroom_spawned == true && BendymodModVariables.MapVariables.get(world).inkmachine_spawned == true) {
							chance = Mth.nextInt(RandomSource.create(), 1, 2);
							if (chance == 1) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 4) {
							chance = Mth.nextInt(RandomSource.create(), 1, 2);
							if (chance == 1) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 5) {
							chance = Mth.nextInt(RandomSource.create(), 1, 1);
							if (chance == 1) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						}
					} else if (rarity == 2) {
						if (room_variation1 == 1) {
							chance = Mth.nextInt(RandomSource.create(), 1, 4);
							if (chance == 4) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_7"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_7"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_7"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "hallway_7"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 2 && BendymodModVariables.MapVariables.get(world).breakerroom_spawned == true && BendymodModVariables.MapVariables.get(world).inkmachine_spawned == true) {
							chance = Mth.nextInt(RandomSource.create(), 1, 2);
							if (chance == 1) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 3 && BendymodModVariables.MapVariables.get(world).breakerroom_spawned == true && BendymodModVariables.MapVariables.get(world).inkmachine_spawned == true) {
							chance = Mth.nextInt(RandomSource.create(), 1, 2);
							if (chance == 2) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 4) {
							chance = Mth.nextInt(RandomSource.create(), 1, 2);
							if (chance == 2) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BendymodModBlocks.RANDOM_ROOM_STRUCTURE_BLOCK.get()) {
					room_variation1 = Mth.nextInt(RandomSource.create(), 1, 2);
					if (rarity == 1) {
						if (room_variation1 == 1) {
							chance = Mth.nextInt(RandomSource.create(), 1, 7);
							if (chance == 6) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_tiny"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_tiny"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_tiny"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_tiny"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 7) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 2) {
							chance = Mth.nextInt(RandomSource.create(), 1, 4);
						}
					} else if (rarity == 2) {
						if (room_variation1 == 1) {
							chance = Mth.nextInt(RandomSource.create(), 1, 7);
							if (chance == 1) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_basic"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_basic"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_basic"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_basic"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 2) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_animator"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_animator"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_animator"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_animator"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 4) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_theater"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_theater"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_theater"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_theater"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 5) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_boris"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_boris"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_boris"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_boris"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						} else if (room_variation1 == 2) {
							chance = Mth.nextInt(RandomSource.create(), 1, 4);
							if (chance == 1) {
								done_choosing = true;
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 2 && CheckIfCanSpawnBigRoomProcedure.execute(world, x, y, z, blockstate) == true && BendymodModVariables.MapVariables.get(world).inkmachine_spawned == false) {
								done_choosing = true;
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(((("ink machine spawned in X Y Z".replace("z", "" + z)).replace("Y", "" + y)).replace("X", "" + x))), false);
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "inkmachine_room1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "inkmachine_room1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "inkmachine_room1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "inkmachine_room1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
								BendymodModVariables.MapVariables.get(world).inkmachine_spawned = true;
								BendymodModVariables.MapVariables.get(world).syncData(world);
							} else if (chance == 3) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "borisroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "borisroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "borisroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "borisroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							} else if (chance == 4 && BendymodModVariables.MapVariables.get(world).breakerroom_spawned == false) {
								done_choosing = true;
								if (!world.isClientSide() && world.getServer() != null)
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(((("breaker room spawned in X Y Z".replace("z", "" + z)).replace("Y", "" + y)).replace("X", "" + x))), false);
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "breakroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "breakroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "breakroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "breakroom_1"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
								BendymodModVariables.MapVariables.get(world).breakerroom_spawned = true;
								BendymodModVariables.MapVariables.get(world).syncData(world);
							}
						}
					} else if (rarity == 3) {
						if (room_variation1 == 1) {
							chance = Mth.nextInt(RandomSource.create(), 1, 7);
							if (chance == 3) {
								done_choosing = true;
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_maze"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_maze"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_maze"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
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
										StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "preritualroom_maze"));
										if (template != null) {
											template.placeInWorld(_serverworld, BlockPos.containing(result_x, y, result_z), BlockPos.containing(result_x, y, result_z),
													new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
