package running_redenvelope.entity;

import net.minecraft.entity.Entity;
import cpw.mods.fml.common.registry.EntityRegistry;

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
}
