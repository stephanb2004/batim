package net.mcreator.bendymod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.BendymodMod;

public class StudioPlayerEntersDimensionFirstTimeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BendymodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BendymodModVariables.PlayerVariables())).EnteredStudio == false) {
			world.setBlock(new BlockPos(-8, 304, -8), BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get().defaultBlockState(), 3);
			{
				Direction _dir = Direction.SOUTH;
				BlockPos _pos = new BlockPos(-8, 304, -8);
				BlockState _bs = world.getBlockState(_pos);
				Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
					world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
				} else {
					_property = _bs.getBlock().getStateDefinition().getProperty("axis");
					if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
						world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
				}
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(0, 307, 0);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(0, 307, 0, _ent.getYRot(), _ent.getXRot());
			}
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			BendymodMod.queueServerWork(15, () -> {
				{
					Entity _ent = entity;
					_ent.teleportTo(0, 307, 0);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(0, 307, 0, _ent.getYRot(), _ent.getXRot());
				}
			});
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.setRespawnPosition(_serverPlayer.level.dimension(), new BlockPos(0, 307, 0), _serverPlayer.getYRot(), true, false);
			{
				boolean _setval = true;
				entity.getCapability(BendymodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnteredStudio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
