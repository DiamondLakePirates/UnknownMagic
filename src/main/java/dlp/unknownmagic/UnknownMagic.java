package dlp.unknownmagic;

import dlp.unknownmagic.client.UnknownMagicTab;
import dlp.unknownmagic.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod (modid = UnknownMagic.MODID, name = UnknownMagic.MODNAME,
    version = UnknownMagic.VERSION, acceptedMinecraftVersions = "1.11")
public class UnknownMagic
{
  // These constants are Descriptors of the MainMod Class
  public static final String MODID = "unknownmagic";
  public static final String MODNAME = "Unknown Magic";
  public static final String VERSION = "1.11-0.0.1.0";

  // These constants will be for the CreativeTabs Menus on
  // Initialization of the Mod
  public static final UnknownMagicTab creativeUMTab = new UnknownMagicTab ();

  @Instance
  public static UnknownMagic instance = new UnknownMagic ();

  @SidedProxy (clientSide = "dlp.unknownmagic.proxy.ClientProxy",
               serverSide = "dlp.unknownmagic.proxy.ServerProxy")
  public static CommonProxy proxy;

  @EventHandler
  public void fmlLifeCycleEvent (FMLPreInitializationEvent event)
  {

    System.out.println ("Called method: [UnknownMagic] Pre-Init Phase");
    proxy.fmlLifeCycleEvent (event);

  }

  @EventHandler
  public void fmlLifeCycleEvent (FMLInitializationEvent event)
  {

    System.out.println ("Called method: [UnknownMagic] Init Phase");
    proxy.fmlLifeCycleEvent (event);

  }

  @EventHandler
  public void fmlLifeCycleEvent (FMLPostInitializationEvent event)
  {

    System.out.println ("Called method: [UnknownMagic] Post-Init Phase");
    proxy.fmlLifeCycleEvent (event);

  }
}
