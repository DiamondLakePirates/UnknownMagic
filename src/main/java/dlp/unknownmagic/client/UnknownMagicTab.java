package dlp.unknownmagic.client;

import dlp.unknownmagic.UnknownMagic;
import dlp.unknownmagic.blocks.UMBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * This class is used to define a Creative Tab in the Creative Menu that
 * will display all of out Mod Items for now. In later versions of the
 * Mod I plan on having multiple tabs when we have more items.
 */
public class UnknownMagicTab extends CreativeTabs
{
  public UnknownMagicTab ()
  {
    super (UnknownMagic.MODID);
    setBackgroundImageName ("item_search.png");
  }

  /**
   * This method will set the Tab icon to the new ItemStack of the
   * item that is returned from the method. In this case I would like
   * the tab to have an image of an Ancient Brick so that is what is
   * being returned.
   *
   * @return ItemStack of the UMBlocks ancientBrick type.
   */
  @Override
  public ItemStack getTabIconItem ()
  {
    return new ItemStack (UMBlocks.mAncientBrick);
  }

  /**
   * This method sets the UnknownMagicTab to have a search Bar, May not be
   * too necessary at the moment. but when more Items are added then this
   * can prove to be quite useful.
   *
   * @return True - Because we want our creative Tab to have a search bar.
   */
  @Override
  public boolean hasSearchBar ()
  {
    return true;
  }
}
