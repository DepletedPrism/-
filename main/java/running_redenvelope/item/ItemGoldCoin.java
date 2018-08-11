package running_redenvelope.item;

import net.minecraft.item.Item;
import running_redenvelope.creativetab.CreativeTabsLoader;
import running_redenvelope.Running_RedEnvelope;

public class ItemGoldCoin extends Item
{
	public ItemGoldCoin()
	{
		super();
		this.setUnlocalizedName("goldCoin");
		this.setCreativeTab(CreativeTabsLoader.tabRunning_RedEnvelope);
		this.setTextureName(Running_RedEnvelope.MODID + ":" + "gold_coin");
	}
}
