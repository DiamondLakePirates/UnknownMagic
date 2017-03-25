package dlp.unknownmagic.blocks;

import dlp.unknownmagic.UnknownMagic;
import dlp.unknownmagic.lib.LibBlockNames;
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
	
	public static Block mAncientBrick;
	public static Block mMineralDeposit;
	
	/**
	 * This method will instantiate the UnknownMagic Base Blocks for use
	 * within the game.
	 */
	public static void createUMBlocks() 
	{
		mAncientBrick = register (new BaseBlock (Material.ROCK, LibBlockNames.ANCIENT_BRICKS).setCreativeTab (UnknownMagic.creativeUMTab).setHardness (1.5F));
		mMineralDeposit = register (new BaseBlock (Material.ROCK, LibBlockNames.MINERAL_DEPOSIT).setCreativeTab (UnknownMagic.creativeUMTab).setHardness (1.5F));
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
