package com.github.commoble.yourmod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

public class ItemRegistrar
{
	// this is our custom Creative tab that our items will go in
	// if you'd rather use an existing tab, you can use one from ItemGroup instead
	public static final ItemGroup YOUR_TAB = new ItemGroup(YourMod.MODID)
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(Blocks.TNT);
		}
	};

	// this is an Object Holder
	// the field will automagically be filled with our block when
	// the block is registered, so we can use it here
	@ObjectHolder(YourMod.MODID + ":" + YourMod.EXPLODIUM_NAME)
	public static final Block EXPLODIUM_BLOCK = null;

	// this method is called by our event handler
	public static void registerItems(IForgeRegistry<Item> registry)
	{
		registerItem(registry, new BlockItem(EXPLODIUM_BLOCK, new Item.Properties().group(YOUR_TAB)), YourMod.EXPLODIUM_NAME);
	}

	// this is a helper method we have made to make registration slightly simpler
	private static <T extends Item> void registerItem(IForgeRegistry<Item> registry, T newItem, String name)
	{
		String prefixedName = YourMod.MODID + ":" + name;
		newItem.setRegistryName(prefixedName);
		registry.register(newItem);
	}
}
