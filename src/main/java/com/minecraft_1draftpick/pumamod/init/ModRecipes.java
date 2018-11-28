package com.minecraft_1draftpick.pumamod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.RAINBOW, new ItemStack(ModBlocks.NEW_BlOCK, 1), 1.5f);
		GameRegistry.addSmelting(ModBlocks.NEW_BlOCK, new ItemStack(Blocks.DIAMOND_BLOCK, 2), 3.0f);
		GameRegistry.addSmelting(ModBlocks.CRYPTIC_BlOCK, new ItemStack(ModItems.RAINBOW, 3), 2.0f);
		
	}

}
