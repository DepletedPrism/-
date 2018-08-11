package running_redenvelope.client.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import running_redenvelope.Running_RedEnvelope;
import running_redenvelope.inventory.ContainerRedEnvelope;;

@SideOnly(Side.CLIENT)
public class GuiContainerRedEnvelope extends GuiContainer
{
	private static final String TEXTURE_PATH = Running_RedEnvelope.MODID + ":" + "textures/gui/gui_redenvelope.png";
	private static final ResourceLocation TEXTURE = new ResourceLocation(TEXTURE_PATH);
	
	public GuiContainerRedEnvelope(ContainerRedEnvelope inventorySlotsIn)
	{
		super(inventorySlotsIn);
		this.xSize = 176;
		this.ySize = 127;
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		
		this.mc.getTextureManager().bindTexture(TEXTURE);
		int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
		
		this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		// TODO
	}
}