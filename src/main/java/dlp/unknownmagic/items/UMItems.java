package dlp.unknownmagic.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * This class is used to instantiate the Items of the
 * UnknownMagic mod.
 *
 * @author CreedTheFreak
 */

public class UMItems
{

  /**
   * Item white_stone - A General Item used for Crafting
   * Note: Before deleting this put in the Docs
   */
  public static Item whiteStone;
  /**
   * Item minerals - A Item used to create Crystals
   * Note: Before deleting this put in the Docs
   */
  public static Item minerals;

  /**
   * This Method creates the given Item, By declaring a new BaseItem
   * then passing in the unlocalized name into an Item constructor.
   * This method is also ran during the Pre-Inti phase in Forge in
   * order to initialize and register all of the Item we have
   * instantiated.
   */
  public static void createUMItems ()
  {
    // Registers an Item and sets it in the CreativeTab
    whiteStone = register(new BaseItem ("white_stone").setCreativeTab (CreativeTabs.MATERIALS));
    minerals = register (new BaseItem ("minerals").setCreativeTab (CreativeTabs.MATERIALS));
  }

  public static <T extends Item> T register (T item)
  {
    GameRegistry.register (item);

    if (item instanceof BaseItem)
    {
      ((BaseItem) item).registerItemModel ();
    }

    return item;
  }
}
