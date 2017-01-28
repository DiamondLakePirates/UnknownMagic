package dlp.unknownmagic.blocks;

import dlp.unknownmagic.UnknownMagic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

/**
 * This class is used to easily instantiate the Basic Blocks of the
 * UnknownMagic mod. These blocks are either building blocks or used
 * in recipes or both. In no way should these blocks be used for other
 * things such as machinery or storage blocks.
 *
 * @author CreedTheFreak
 */
public class BaseBlock extends Block
{
  private String mName;

  /**
   * This is the default constructor for the BaseBlock class which
   * will setup the basic block requirements in order to instantiate
   * a block.
   *
   * @param material The block Material
   *
   * @param unlocalizedName The Name of the Block
   */
  public BaseBlock (Material material, String unlocalizedName)
  {
    super (material);

    this.mName = unlocalizedName;

    setUnlocalizedName (mName);
    setRegistryName (mName);
  }

  /**
   * This method will register the item variant of the Block Item.
   *
   * @param itemBlock The item version of the Block to register.
   */
  public void registerItemModel (ItemBlock itemBlock)
  {
    UnknownMagic.proxy.registerItemRenderer (itemBlock, 0, mName);
  }

  /**
   * This method will set the Tab in which to display the BaseBlock item
   * that this method was called on.
   *
   * @param tab The tab to display the ItemBlock in.
   *
   * @return The BaseBlock called on.
   */
  @Override
  public BaseBlock setCreativeTab (CreativeTabs tab)
  {
    super.setCreativeTab (tab);
    return this;
  }

}
