package running_redenvelope.entity;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import running_redenvelope.Running_RedEnvelope;

public class EntityLoader
{
	private static int nextID = 0;
	
	public EntityLoader()
	{
		registerEntity(EntityRedEnvelope.class, "RedEnvelope", 64, 3, true);
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
	{
		EntityRegistry.registerModEntity(entityClass, name, nextID++, Running_RedEnvelope.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		//TODO
	}
	
	/*
	@SideOnly(Side.CLIENT)
	private static <T extends Entity> void registerEntityRender(Class<T> entityClass, Class<? extends Render<T>> render)
	{
		//RenderingRegistry.registerEntityRenderingHandler(entityClass, new EntityRenderer<T>(render));
	}
	*/
}