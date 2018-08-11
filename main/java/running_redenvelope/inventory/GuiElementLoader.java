package running_redenvelope.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

import running_redenvelope.Running_RedEnvelope;
import running_redenvelope.client.gui.GuiContainerRedEnvelope;

public class GuiElementLoader implements IGuiHandler
{
	public static final int GUI_REDENVELOPE = 1;
	
	public GuiElementLoader()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Running_RedEnvelope.instance, this);
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch (ID)
		{
		case GUI_REDENVELOPE:
			return new ContainerRedEnvelope(player);
		default:
			return null;
		}
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch (ID)
		{
		case GUI_REDENVELOPE:
			return new GuiContainerRedEnvelope(new ContainerRedEnvelope(player));
		default:
			return null;
		}
	}
}