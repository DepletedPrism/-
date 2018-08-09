package running_redenvelope.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import running_redenvelope.creativetab.CreativeTabsLoader;
import running_redenvelope.entity.EntityRedEnvelope;
import running_redenvelope.inventory.GuiElementLoader;
import running_redenvelope.Running_RedEnvelope;

public class ItemRedEnvelope extends Item
{
	public ItemRedEnvelope()
	{
		super();
        this.setUnlocalizedName("redEnvelope");
		this.setCreativeTab(CreativeTabsLoader.tabRunning_RedEnvelope);
        this.setTextureName(Running_RedEnvelope.MODID + ":" + "red_envelope");
	}
	@Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (!playerIn.capabilities.isCreativeMode)
        {
            --itemStackIn.stackSize;
        }
        if (!worldIn.isRemote)
        {
            if (playerIn.isSneaking())
            {
            	float var4 = 1.0F;
    			int i = (int) (playerIn.prevPosX + (playerIn.posX - playerIn.prevPosX) * (double) var4);
    			int j = (int) (playerIn.prevPosY + (playerIn.posY - playerIn.prevPosY) * (double) var4 + 1.62D - (double) playerIn.yOffset);
    			int k = (int) (playerIn.prevPosZ + (playerIn.posZ - playerIn.prevPosZ) * (double) var4);
                int id = GuiElementLoader.GUI_REDENVELOPE;
                playerIn.openGui(Running_RedEnvelope.instance, id, worldIn, i, j, k);
            }
        }
        return itemStackIn;
    }
}
