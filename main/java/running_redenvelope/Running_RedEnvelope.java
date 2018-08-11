package running_redenvelope;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Running_RedEnvelope.MODID, name = Running_RedEnvelope.NAME, version = Running_RedEnvelope.VERSION)
public class Running_RedEnvelope 
{
	public static final String MODID = "running_redenvelope";
	public static final String NAME = "Running Red Envelope";
	public static final String VERSION = "0.1.0";
	
	@Instance(Running_RedEnvelope.MODID)
	public static Running_RedEnvelope instance;
	
	@SidedProxy(clientSide = "running_redenvelope.client.ClientProxy", serverSide = "running_redenvelope.common.CommonProxy")
	public static running_redenvelope.common.CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
    	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
    		proxy.postInit(event);
	}
}