package net.mcreator.rotnblocks.procedures;

@RotnBlocksModElements.ModElement.Tag
public class MushroomLamp0RedstoneOnProcedure extends RotnBlocksModElements.ModElement {

	public MushroomLamp0RedstoneOnProcedure(RotnBlocksModElements instance) {
		super(instance, 23);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MushroomLamp0RedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MushroomLamp0RedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MushroomLamp0RedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				RotnBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MushroomLamp0RedstoneOn!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = MushroomLamp1Block.block.getDefaultState();

			BlockState _bso = world.getBlockState(_bp);

			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}

			world.setBlockState(_bp, _bs, 3);

		}

	}

}
