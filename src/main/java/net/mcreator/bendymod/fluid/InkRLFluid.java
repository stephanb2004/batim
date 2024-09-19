
package net.mcreator.bendymod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.bendymod.init.BendymodModFluids;
import net.mcreator.bendymod.init.BendymodModFluidTypes;
import net.mcreator.bendymod.init.BendymodModBlocks;

public abstract class InkRLFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BendymodModFluidTypes.INK_RL_TYPE.get(), () -> BendymodModFluids.INK_RL.get(), () -> BendymodModFluids.FLOWING_INK_RL.get())
			.explosionResistance(100f).block(() -> (LiquidBlock) BendymodModBlocks.INK_RL.get());

	private InkRLFluid() {
		super(PROPERTIES);
	}

	public static class Source extends InkRLFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends InkRLFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
