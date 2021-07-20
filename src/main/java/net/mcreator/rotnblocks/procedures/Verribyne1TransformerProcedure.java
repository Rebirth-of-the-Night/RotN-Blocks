package net.mcreator.rotnblocks.procedures;

@RotnBlocksModElements.ModElement.Tag
public class Verribyne1TransformerProcedure extends RotnBlocksModElements.ModElement {

	public Verribyne1TransformerProcedure(RotnBlocksModElements instance) {
		super(instance, 18);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency x for procedure Verribyne1Transformer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency y for procedure Verribyne1Transformer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency z for procedure Verribyne1Transformer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency world for procedure Verribyne1Transformer!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (((((!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.LEAVES))
				^ (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getMaterial() == net.minecraft.block.material.Material.ROCK)))
				^ (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
						.getMaterial() == net.minecraft.block.material.Material.EARTH)))
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock()))) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world,
						new BlockPos((int) x, (int) y, (int) z));

				world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Verribyne1Block.block.getDefaultState(), 3);
		}

	}

}
