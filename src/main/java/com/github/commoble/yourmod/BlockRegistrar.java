package com.github.commoble.yourmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockRegistrar
{
	// this method is called by our event handler
	public static void registerBlocks(IForgeRegistry<Block> registry)
	{
		registerBlock(
				registry,
				new ExplodiumBlock(Block.Properties.create(Material.EARTH).hardnessAndResistance(1F).harvestTool(ToolType.PICKAXE)),
				YourMod.EXPLODIUM_NAME);
	}
	
	// this is a helper method we have made to make registration slightly simpler
	private static <T extends Block> void registerBlock(IForgeRegistry<Block> registry, T newBlock, String name)
	{
		String prefixedName = YourMod.MODID + ":" + name;
		newBlock.setRegistryName(prefixedName);
		registry.register(newBlock);
	}
}
