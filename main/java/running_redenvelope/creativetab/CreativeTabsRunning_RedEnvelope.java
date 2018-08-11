package running_redenvelope.creativetab;

import running_redenvelope.item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsRunning_RedEnvelope extends CreativeTabs
{
	public CreativeTabsRunning_RedEnvelope()
    {
        super("running_redenvelope");
    }

    @Override
    public Item getTabIconItem()
    {
        return ItemLoader.redEnvelope;
    }
}
