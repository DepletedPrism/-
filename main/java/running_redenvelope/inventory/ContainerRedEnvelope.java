package running_redenvelope.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import running_redenvelope.item.ItemLoader;

public class ContainerRedEnvelope extends Container
{
	//private ItemStackHandler items = new ItemStackHandler(4);
	
	public ContainerRedEnvelope(EntityPlayer player)
    {
        super();
        
        for (int i = 0; i < 4; ++i)
        {
            //this.addSlotToContainer(new SlotItemHandler(items, i, 38 + i * 32, 20));
        }
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 51 + i * 18));
            }
        }
        for (int i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 109));
        }
    }
	
    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return new ItemStack(ItemLoader.redEnvelope).isItemEqual(playerIn.getCurrentEquippedItem());
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        return null;
    }
}
