
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bendymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.bendymod.block.entity.CutoutSinnyTileEntity;
import net.mcreator.bendymod.block.entity.CutoutBendyTileEntity;
import net.mcreator.bendymod.BendymodMod;

public class BendymodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BendymodMod.MODID);
	public static final RegistryObject<BlockEntityType<CutoutBendyTileEntity>> CUTOUT_BENDY = REGISTRY.register("cutout_bendy", () -> BlockEntityType.Builder.of(CutoutBendyTileEntity::new, BendymodModBlocks.CUTOUT_BENDY.get()).build(null));
	public static final RegistryObject<BlockEntityType<CutoutSinnyTileEntity>> CUTOUT_SINNY = REGISTRY.register("cutout_sinny", () -> BlockEntityType.Builder.of(CutoutSinnyTileEntity::new, BendymodModBlocks.CUTOUT_SINNY.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
