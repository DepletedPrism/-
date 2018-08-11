package running_redenvelope.item;

import net.minecraft.item.Item;
import running_redenvelope.creativetab.CreativeTabsLoader;
import running_redenvelope.Running_RedEnvelope;

public class ItemSighFromSinger extends Item
{
	public ItemSighFromSinger()
	{
		super();
		this.setUnlocalizedName("sighFromSinger");
		this.setCreativeTab(CreativeTabsLoader.tabRunning_RedEnvelope);
		this.setTextureName(Running_RedEnvelope.MODID + ":" + "sigh_from_singer");
	}
}