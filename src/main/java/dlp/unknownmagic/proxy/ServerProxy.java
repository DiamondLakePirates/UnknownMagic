package dlp.unknownmagic.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy
{

	@Override
	public void fmlLifeCycleEvent(FMLPreInitializationEvent e) {
		super.fmlLifeCycleEvent(e);
	}
	
	@Override
	public void fmlLifeCycleEvent(FMLInitializationEvent e) {
		super.fmlLifeCycleEvent(e);
	}
	
	@Override
	public void fmlLifeCycleEvent(FMLPostInitializationEvent e) {
		super.fmlLifeCycleEvent(e);
	}
}
