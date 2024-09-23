
package net.mcreator.bendymod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class StudioFloorStairsBlock extends StairBlock {
	public StudioFloorStairsBlock() {
		super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).sound(SoundType.WOOD).strength(-1, 3600000));
	}

	@Override
	public float getExplosionResistance() {
		return 3f;
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return false;
	}
}
