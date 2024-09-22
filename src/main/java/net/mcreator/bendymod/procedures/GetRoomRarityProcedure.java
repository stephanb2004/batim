package net.mcreator.bendymod.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GetRoomRarityProcedure {
	public static double execute() {
		double cur_rarity = 0;
		double rarity_result = 0;
		cur_rarity = Mth.nextInt(RandomSource.create(), 1, 100);
		if (cur_rarity < 41) {
			rarity_result = 1;
		} else if (cur_rarity > 40 && cur_rarity < 71) {
			rarity_result = 2;
		} else if (cur_rarity > 70 && cur_rarity < 91) {
			rarity_result = 3;
		} else if (cur_rarity > 90) {
			rarity_result = 4;
		}
		return rarity_result;
	}
}
