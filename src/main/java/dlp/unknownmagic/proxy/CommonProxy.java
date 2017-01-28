package dlp.unknownmagic.proxy;

import dlp.unknownmagic.blocks.UMBlocks;
import dlp.unknownmagic.items.UMItems;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{

  public void fmlLifeCycleEvent (FMLPreInitializationEvent event)
  {
    UMItems.createUMItems ();
    UMBlocks.createUMBlocks ();
  }

  public void fmlLifeCycleEvent (FMLInitializationEvent event)
  {

  }

  public void fmlLifeCycleEvent (FMLPostInitializationEvent event)
  {

  }

  /**
   * This method is used through the inheritance hierarchy to be
   * Overridden on the Client sided proxy in order to register
   * an item that has been instantiated.
   *
   * @param item The item to register
   * @param meta The meta data the Item may have
   * @param id   The identification of the item.
   */
  public void registerItemRenderer (Item item, int meta, String id)
  {
    // Note: This method is Overridden inside of the Client Proxy
  }

}

