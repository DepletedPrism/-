package running_redenvelope.item;

import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemLoader 
{
	public static Item goldCoin = new ItemGoldCoin();
	public static Item pennyNote = new ItemPennyNote();
	public static Item steelCoin = new ItemSteelCoin();
	public static Item redEnvelope = new ItemRedEnvelope();
	public static Item singerFormSinger = new ItemSighFromSinger();
	public static Item twoDimensionalFoilForRedEnvelope = new ItemTwoDimensionalFoilForRedEnvelope();
	
	public ItemLoader(FMLPreInitializationEvent event)
	{
        	register(goldCoin, "gold_coin");
        	register(pennyNote, "penny_note");
        	register(steelCoin, "steel_coin");
        	register(redEnvelope, "red_nvelope");
        	register(singerFormSinger, "sigh_from_singer");
        	register(twoDimensionalFoilForRedEnvelope, "two-dimensional_foil_for_red_envelope");
	}
	
	private static void register(Item item, String name)
    	{
        	GameRegistry.registerItem(item, name);
    	}
}
