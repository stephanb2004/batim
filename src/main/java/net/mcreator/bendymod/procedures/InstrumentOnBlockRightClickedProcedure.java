package net.mcreator.bendymod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.bendymod.init.BendymodModBlocks;

public class InstrumentOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isClientSide()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.PIANO.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.harp")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.harp")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2), false);
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.BASS.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bass")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.bass")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2), false);
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.DRUM.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.basedrum")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.basedrum")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2), false);
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.BANJO.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.banjo")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2), false);
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.VIOLIN.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bendymod:violin_note")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2));
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bendymod:violin_note")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 1, 2), false);
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.BENDY_DOLL.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == BendymodModBlocks.BENDY_DOLL_RL.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bendymod:bendydoll_squeak")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bendymod:bendydoll_squeak")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
