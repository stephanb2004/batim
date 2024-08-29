
package net.mcreator.bendymod.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.bendymod.init.BendymodModItems;
import net.mcreator.bendymod.init.BendymodModFluids;
import net.mcreator.bendymod.init.BendymodModFluidTypes;
import net.mcreator.bendymod.init.BendymodModBlocks;

public abstract class InkFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> BendymodModFluidTypes.INK_TYPE.get(), () -> BendymodModFluids.INK.get(), () -> BendymodModFluids.FLOWING_INK.get()).explosionResistance(100f)
			.bucket(() -> BendymodModItems.INK_BUCKET.get()).block(() -> (LiquidBlock) BendymodModBlocks.INK.get());

	private InkFluid() {
		super(PROPERTIES);
	}

	public static class Source extends InkFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends InkFluid {
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
