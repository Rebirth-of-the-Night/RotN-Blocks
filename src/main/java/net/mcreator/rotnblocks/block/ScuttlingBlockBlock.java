
package net.mcreator.rotnblocks.block;

import net.minecraft.block.material.Material;

@RotnBlocksModElements.ModElement.Tag
public class ScuttlingBlockBlock extends RotnBlocksModElements.ModElement {

	@ObjectHolder("rotn_blocks:scuttling_block")
	public static final Block block = null;

	public ScuttlingBlockBlock(RotnBlocksModElements instance) {
		super(instance, 24);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.MISCELLANEOUS).sound(SoundType.SLIME).hardnessAndResistance(1.5999999999999999f, 3f)
					.setLightLevel(s -> 0).harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().slipperiness(0.55f));

			setRegistryName("scuttling_block");
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.MAGENTA;
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
