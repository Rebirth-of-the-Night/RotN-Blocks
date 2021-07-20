
package net.mcreator.rotnblocks.block;

import net.minecraft.block.material.Material;

@RotnBlocksModElements.ModElement.Tag
public class WeatheredCopperBlockBlock extends RotnBlocksModElements.ModElement {

	@ObjectHolder("rotn_blocks:weathered_copper_block")
	public static final Block block = null;

	public WeatheredCopperBlockBlock(RotnBlocksModElements instance) {
		super(instance, 4);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(4.5f, 5f).setLightLevel(s -> 0));

			setRegistryName("weathered_copper_block");
		}

		@Override
		public float[] getBeaconColorMultiplier(BlockState state, IWorldReader world, BlockPos pos, BlockPos beaconPos) {
			return new float[]{1f, 0.4f, 0f};
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
