package net.mcreator.bendymod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.network.BendymodModVariables;
import net.mcreator.bendymod.init.BendymodModBlocks;
import net.mcreator.bendymod.BendymodMod;

import java.util.Map;

public class StudioPlayerEntersDimensionFirstTimeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BendymodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BendymodModVariables.PlayerVariables())).EnteredStudio == false) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("bendymod", "spawnroom_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(-8, 304, -8), new BlockPos(-8, 304, -8), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			BendymodMod.queueServerWork(15, () -> {
				{
					Entity _ent = entity;
					_ent.teleportTo(0, 318, 0);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(0, 318, 0, _ent.getYRot(), _ent.getXRot());
				}
			});
			SetStructureBlocksProcedure.execute(world, (-8), 304, (-9));
			{
				boolean _setval = true;
				entity.getCapability(BendymodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.EnteredStudio = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((world.getBlockState(new BlockPos(7, 304, -8))).getBlock() == BendymodModBlocks.INACTIVE_HALLWAYS_STRUCTURE_BLOCK.get()) {
				{
					BlockPos _bp = new BlockPos(7, 304, -8);
					BlockState _bs = BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get().defaultBlockState();
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
			} else if ((world.getBlockState(new BlockPos(7, 304, 7))).getBlock() == BendymodModBlocks.INACTIVE_HALLWAYS_STRUCTURE_BLOCK.get()) {
				{
					BlockPos _bp = new BlockPos(7, 304, 7);
					BlockState _bs = BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get().defaultBlockState();
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
			} else if ((world.getBlockState(new BlockPos(-8, 304, 7))).getBlock() == BendymodModBlocks.INACTIVE_HALLWAYS_STRUCTURE_BLOCK.get()) {
				{
					BlockPos _bp = new BlockPos(-8, 304, 7);
					BlockState _bs = BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get().defaultBlockState();
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
			} else if ((world.getBlockState(new BlockPos(8, 304, -8))).getBlock() == BendymodModBlocks.INACTIVE_HALLWAYS_STRUCTURE_BLOCK.get()) {
				{
					BlockPos _bp = new BlockPos(-8, 304, -8);
					BlockState _bs = BendymodModBlocks.HALLWAYS_STRUCTURE_BLOCK.get().defaultBlockState();
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
			}
		}
	}
}
