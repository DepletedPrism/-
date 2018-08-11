package running_redenvelope.common;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import running_redenvelope.block.BlockLoader;
import running_redenvelope.crafting.CraftingLoader;
import running_redenvelope.creativetab.CreativeTabsLoader;
import running_redenvelope.entity.EntityLoader;
import running_redenvelope.inventory.GuiElementLoader;
import running_redenvelope.item.ItemLoader;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event)
	{
		new ConfigLoader(event);
		new CreativeTabsLoader(event);
		new ItemLoader(event);
		new BlockLoader(event);
		new GuiElementLoader();
		new EntityLoader();
    	}
	
	public void init(FMLInitializationEvent event)
	{
		new CraftingLoader();
	}
	
	public void postInit(FMLPostInitializationEvent event)
	{
		//TODO
	}
}
