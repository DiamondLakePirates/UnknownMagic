package dlp.unknownmagic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class is used to register and create all of the Unknown
 * Magic Blocks that are not unique, but rater are static blocks that
 * don't have any sort of special properties.
 */
public class UMBlocks 
{
	
	public static Block ancientBrick;
	
	/**
	 * This method will instantiate the UnknownMagic Base Blocks for use
	 * within the game.
	 */
	public static void createUMBlocks() 
	{
		ancientBrick = register (new BaseBlock (Material.ROCK, "ancient_brick").setCreativeTab (CreativeTabs.BUILDING_BLOCKS));
	}

	/**
	 * This method will register the Block and the ItemBlock of the Block
	 * we want to instantiate.
	 *
	 * @param block The block to register
	 *
	 * @param itemBlock The item version of the Block to register
	 *
	 * @return The BaseBlock that was created.
	 */
	private static < T extends Block> T register (T block, ItemBlock itemBlock)
	{
		GameRegistry.register (block);
		GameRegistry.register (itemBlock);

		if (block instanceof BaseBlock)
		{
			((BaseBlock) block).registerItemModel (itemBlock);
		}

		return block;
	}

	/**
	 * This method will take a singular block passed into its arguments and
	 * then setup the ItemBlock on the fly and then register both items which
	 * will then return the BaseBlock.
	 *
	 * @param block The block to register and create an ItemBlock out of
	 *
	 * @return The new BaseBlock.
	 */
	private static < T extends Block> T register (T block)
	{
		ItemBlock itemBlock = new ItemBlock (block);
		itemBlock.setRegistryName (block.getRegistryName ());
		return register (block, itemBlock);
	}
}
