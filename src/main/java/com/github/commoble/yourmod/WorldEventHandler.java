package com.github.commoble.yourmod;

import net.minecraft.world.Explosion.Mode;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid=YourMod.MODID, bus=EventBusSubscriber.Bus.FORGE)
public class WorldEventHandler
{
	@SubscribeEvent
	public static void onBlockBreakEvent(BreakEvent event)
	{
		IWorld world= event.getWorld();
		if (world instanceof World)
		{
			((World) world).createExplosion(
					null,
					event.getPos().getX(),
					event.getPos().getY(),
					event.getPos().getZ(),
					10F,
					Mode.DESTROY);
		}
	}
}
