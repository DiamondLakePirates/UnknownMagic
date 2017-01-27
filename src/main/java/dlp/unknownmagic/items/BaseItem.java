package dlp.unknownmagic.items;

import dlp.unknownmagic.UnknownMagic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * This is the BaseItem class used to setup the basic
 * properties of a regular non-special item for the
 * UnknownMagic mod. This is used to create the base
 * Items for the UnknownMagic mod without any functionality
 * whatsoever.
 *
 * @author CreedTheFreak
 */
public class BaseItem extends Item
{

  private String mName;

  /**
   * The base constructor for the Basic Item Class.
   *
   * @param unlocalizedName The name of the Item that is
   *                        to be instantiated.
   */
  public BaseItem (String unlocalizedName)
  {
    super ();

    this.mName = unlocalizedName;
    this.setUnlocalizedName (mName);
    this.setRegistryName (mName);
  }

  /**
   * This method will grab the name of the Item
   *
   * @return The name of the Item.
   */
  public String getItemName ()
  {
    return this.mName;
  }

  /**
   * This method will register the Items Model for rendering inside
   * of the game.
   */
  public void registerItemModel ()
  {
    UnknownMagic.proxy.registerItemRenderer (this, 0, mName);
  }

  /**
   * This method is used to set the Creative Tab to Display the
   * Item that the method is called on, into the Creative Tab
   * that is passed in.
   *
   * @param tab The location in the Creative Menu to place this
   *            specific item.
   * @return The Item that the method was called on.
   */
  @Override
  public BaseItem setCreativeTab (CreativeTabs tab)
  {
    super.setCreativeTab (tab);
    return this;
  }

}
