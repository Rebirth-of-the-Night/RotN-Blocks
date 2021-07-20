package net.mcreator.rotnblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.rotnblocks.block.SlightlyWeatheredCopperBlockBlock;
import net.mcreator.rotnblocks.RotnBlocksModElements;
import net.mcreator.rotnblocks.RotnBlocksMod;

import java.util.Map;

@RotnBlocksModElements.ModElement.Tag
public class CopperBlockUpdateTickProcedure extends RotnBlocksModElements.ModElement {
	public CopperBlockUpdateTickProcedure(RotnBlocksModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency x for procedure CopperBlockUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency y for procedure CopperBlockUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency z for procedure CopperBlockUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency world for procedure CopperBlockUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SlightlyWeatheredCopperBlockBlock.block.getDefaultState(), 3);
	}
}
