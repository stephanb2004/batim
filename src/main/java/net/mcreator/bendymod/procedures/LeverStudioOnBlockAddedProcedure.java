package net.mcreator.bendymod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.BendymodMod;

import java.util.Map;
import java.util.Comparator;

public class LeverStudioOnBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		Entity cur_entity = null;
		boolean can_tp = false;
		if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH && (world.getBlockState(BlockPos.containing(x + 4, y, z - 1))).getBlock() == BendymodModBlocks.INKWELL.get()
				&& (world.getBlockState(BlockPos.containing(x + 4, y, z - 3))).getBlock() == BendymodModBlocks.RECORD.get() && (world.getBlockState(BlockPos.containing(x + 4, y, z - 5))).getBlock() == BendymodModBlocks.BENDY_DOLL.get()
				&& (world.getBlockState(BlockPos.containing(x - 4, y, z - 1))).getBlock() == BendymodModBlocks.GEAR.get() && (world.getBlockState(BlockPos.containing(x - 4, y, z - 3))).getBlock() == BendymodModBlocks.WRENCH.get()
				&& (world.getBlockState(BlockPos.containing(x - 4, y, z - 5))).getBlock() == BendymodModBlocks.ILLUSION_OF_LIVING.get()) {
			can_tp = true;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.SOUTH && (world.getBlockState(BlockPos.containing(x - 4, y, z + 1))).getBlock() == BendymodModBlocks.INKWELL.get()
				&& (world.getBlockState(BlockPos.containing(x - 4, y, z + 3))).getBlock() == BendymodModBlocks.RECORD.get() && (world.getBlockState(BlockPos.containing(x - 4, y, z + 5))).getBlock() == BendymodModBlocks.BENDY_DOLL.get()
				&& (world.getBlockState(BlockPos.containing(x + 4, y, z + 1))).getBlock() == BendymodModBlocks.GEAR.get() && (world.getBlockState(BlockPos.containing(x + 4, y, z + 3))).getBlock() == BendymodModBlocks.WRENCH.get()
				&& (world.getBlockState(BlockPos.containing(x + 4, y, z + 5))).getBlock() == BendymodModBlocks.ILLUSION_OF_LIVING.get()) {
			can_tp = true;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.EAST && (world.getBlockState(BlockPos.containing(x + 1, y, z + 4))).getBlock() == BendymodModBlocks.INKWELL.get()
				&& (world.getBlockState(BlockPos.containing(x + 3, y, z + 4))).getBlock() == BendymodModBlocks.RECORD.get() && (world.getBlockState(BlockPos.containing(x + 5, y, z + 4))).getBlock() == BendymodModBlocks.BENDY_DOLL.get()
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 4))).getBlock() == BendymodModBlocks.GEAR.get() && (world.getBlockState(BlockPos.containing(x + 3, y, z - 4))).getBlock() == BendymodModBlocks.WRENCH.get()
				&& (world.getBlockState(BlockPos.containing(x + 5, y, z - 4))).getBlock() == BendymodModBlocks.ILLUSION_OF_LIVING.get()) {
			can_tp = true;
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.WEST && (world.getBlockState(BlockPos.containing(x - 1, y, z - 4))).getBlock() == BendymodModBlocks.INKWELL.get()
				&& (world.getBlockState(BlockPos.containing(x - 3, y, z - 4))).getBlock() == BendymodModBlocks.RECORD.get() && (world.getBlockState(BlockPos.containing(x - 5, y, z - 4))).getBlock() == BendymodModBlocks.BENDY_DOLL.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 4))).getBlock() == BendymodModBlocks.GEAR.get() && (world.getBlockState(BlockPos.containing(x - 3, y, z + 4))).getBlock() == BendymodModBlocks.WRENCH.get()
				&& (world.getBlockState(BlockPos.containing(x - 5, y, z + 4))).getBlock() == BendymodModBlocks.ILLUSION_OF_LIVING.get()) {
			can_tp = true;
		}
		if (can_tp == true) {
			if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity) {
				cur_entity = (Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null);
				if (cur_entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = Level.OVERWORLD;
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
				{
					Entity _ent = cur_entity;
					_ent.teleportTo(
							((cur_entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
									: 0),
							((cur_entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
									: 0),
							((cur_entity instanceof ServerPlayer _player && !_player.level().isClientSide())
									? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
									: 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(
								((cur_entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getXSpawn())
										: 0),
								((cur_entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getYSpawn())
										: 0),
								((cur_entity instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getZSpawn())
										: 0),
								_ent.getYRot(), _ent.getXRot());
				}
			}
			BendymodMod.queueServerWork(20, () -> {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = BendymodModBlocks.LEVER_POWER_OFF.get().defaultBlockState();
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
