package running_redenvelope.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

import running_redenvelope.block.BlockLoader;
import running_redenvelope.item.ItemLoader;

public class CraftingLoader 
{
	public CraftingLoader()
	{
		registerRecipe();
	}
	
	private static void registerRecipe()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.redEnvelope), new Object[]
				{
						"# #", "#X#", "###", '#', Items.paper, 'X', new ItemStack(Items.dye, 1, 1)
				});
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.pennyNote), new Object[]
				{
						"#X#", '#', Items.paper, 'X', Items.gold_nugget
				});
		GameRegistry.addShapedRecipe(new ItemStack(Items.gold_ingot), new Object[]
				{
						"###", "###", "###", '#', ItemLoader.pennyNote
				});
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.castingStation), new Object[]
				{
						" # ", "XYX", "ZNZ", '#', Items.bucket, 'X', Items.iron_ingot, 'Y', Blocks.hopper, 'Z', Blocks.iron_block, 'N', Blocks.cauldron
				});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemLoader.twoDimensionalFoilForRedEnvelope), ItemLoader.singerFormSinger);
	}
}