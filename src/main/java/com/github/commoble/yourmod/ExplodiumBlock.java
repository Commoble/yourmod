package com.github.commoble.yourmod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion.Mode;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class ExplodiumBlock extends Block
{
	public ExplodiumBlock(Properties properties)
	{
		super(properties);
	}

	/**
	 * Called after a player destroys this Block - the posiiton pos may no longer
	 * hold the state indicated.
	 */
	public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state)
	{
		if (worldIn instanceof World)
		{
			((World)worldIn).createExplosion(null,
					pos.getX(),
					pos.getY(),
					pos.getZ(),
					10F,
					Mode.DESTROY);
		}
	}
}
