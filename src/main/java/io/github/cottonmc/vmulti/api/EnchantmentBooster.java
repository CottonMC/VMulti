package io.github.cottonmc.vmulti.api;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface EnchantmentBooster {
	int getEnchantmentBoost(World world, BlockPos pos, BlockState state);
}
