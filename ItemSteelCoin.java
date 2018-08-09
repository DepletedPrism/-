package running_redenvelope.item;

import net.minecraft.item.Item;
import running_redenvelope.creativetab.CreativeTabsLoader;
import running_redenvelope.Running_RedEnvelope;

public class ItemSteelCoin extends Item
{
	public ItemSteelCoin()
	{
		super();
        this.setUnlocalizedName("steelCoin");
		this.setCreativeTab(CreativeTabsLoader.tabRunning_RedEnvelope);
        this.setTextureName(Running_RedEnvelope.MODID + ":" + "steel_Coin");
	}
}
