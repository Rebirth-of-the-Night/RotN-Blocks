
package net.mcreator.rotnblocks.block;

import net.minecraft.block.material.Material;

@RotnBlocksModElements.ModElement.Tag
public class CaveMossBlock extends RotnBlocksModElements.ModElement {

	@ObjectHolder("rotn_blocks:cave_moss")
	public static final Block block = null;

	public CaveMossBlock(RotnBlocksModElements instance) {
		super(instance, 5);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.SLIME).hardnessAndResistance(1f, 2f).setLightLevel(s -> 0)
					.slipperiness(0.75f));

			setRegistryName("cave_moss");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.GRASS;
		}

		@Override
		public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
