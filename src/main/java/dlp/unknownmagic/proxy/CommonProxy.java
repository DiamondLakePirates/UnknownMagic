package dlp.unknownmagic.proxy;

import dlp.unknownmagic.UnknownMagic;
import dlp.unknownmagic.blocks.UMBlocks;
import dlp.unknownmagic.items.UMItems;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import network.UMGuiHandler;

public class CommonProxy
{

  /**
   * This method is called during the pre-init phase and is used
   * to register and do various tasks during the pre-init phase.
   * This is used to do those tasks both for the client and server
   * side of the mod since we are in the common proxy.
   *
   * @param event The event which is passed into the method.
   */
  public void fmlLifeCycleEvent (FMLPreInitializationEvent event)
  {
    UMItems.createUMItems ();
    UMBlocks.createUMBlocks ();
  }

  public void fmlLifeCycleEvent (FMLInitializationEvent event)
  {
    // Register the GuiHandler with the server and Client.
    NetworkRegistry.INSTANCE.registerGuiHandler
        (UnknownMagic.instance, new UMGuiHandler ());
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
   *
   * @param meta The meta data the Item may have
   *
   * @param id   The identification of the item.
   */
  public void registerItemRenderer (Item item, int meta, String id)
  {
    // Note: This method is Overridden inside of the Client Proxy
  }

}

