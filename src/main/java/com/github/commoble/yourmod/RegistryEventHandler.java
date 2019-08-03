package com.github.commoble.yourmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid=YourMod.MODID, bus=EventBusSubscriber.Bus.MOD)
public class RegistryEventHandler
{
	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
	{
		BlockRegistrar.registerBlocks(event.getRegistry());
	}
	
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event)
	{
		ItemRegistrar.registerItems(event.getRegistry());
	}
}
