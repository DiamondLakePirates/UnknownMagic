package dlp.unknownmagic.proxy;

import dlp.unknownmagic.UnknownMagic;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit (FMLPreInitializationEvent event)
	{
		super.preInit (event);

	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init (event);
	}
	
	@Override
	public void postInit (FMLPostInitializationEvent event)
	{
		super.postInit (event);
	}

	/**
	 * This method is used to register an item that has been
	 * instantiated and passed into this method.
	 *
	 * Note: This method has been Overridden from the CommonProxy.
	 *
	 * @param item The item to register
	 *
	 * @param meta The meta data the Item may have
	 *
	 * @param id The identification of the item.
	 */
	@Override
	public void registerItemRenderer (Item item, int meta, String id)
	{
		ModelLoader.setCustomModelResourceLocation (item, meta,
				new ModelResourceLocation (UnknownMagic.MODID + ":" + id,
						"inventory"));
	}
}
