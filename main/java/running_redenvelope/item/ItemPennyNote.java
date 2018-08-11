package running_redenvelope.item;

import net.minecraft.item.Item;
import running_redenvelope.creativetab.CreativeTabsLoader;
import running_redenvelope.Running_RedEnvelope;

public class ItemPennyNote extends Item
{
	public ItemPennyNote()
	{
		super();
		this.setUnlocalizedName("pennyNote");
		this.setCreativeTab(CreativeTabsLoader.tabRunning_RedEnvelope);
		this.setTextureName(Running_RedEnvelope.MODID + ":" + "penny_note");
	}
}