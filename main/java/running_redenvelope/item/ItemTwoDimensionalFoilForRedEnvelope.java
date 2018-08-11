package running_redenvelope.item;

import net.minecraft.item.Item;
import running_redenvelope.creativetab.CreativeTabsLoader;
import running_redenvelope.Running_RedEnvelope;

public class ItemTwoDimensionalFoilForRedEnvelope extends Item
{
	public ItemTwoDimensionalFoilForRedEnvelope()
	{
		super();
		this.setUnlocalizedName("twoDimensionalFoilForRedEnvelope");
		this.setCreativeTab(CreativeTabsLoader.tabRunning_RedEnvelope);
		this.setTextureName(Running_RedEnvelope.MODID + ":" + "two-dimensional_foil_for_red_envelope");
	}
}