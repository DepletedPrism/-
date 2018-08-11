package running_redenvelope.block;

import net.minecraft.block.Block;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockLoader
{
	public static Block castingStation = new BlockCastingStation();
	
	public BlockLoader(FMLPreInitializationEvent event)
	{
		register(castingStation, "casting_station");
	}
	private static void register(Block block, String name)
	{
		GameRegistry.registerBlock(block, name);
	}
}
