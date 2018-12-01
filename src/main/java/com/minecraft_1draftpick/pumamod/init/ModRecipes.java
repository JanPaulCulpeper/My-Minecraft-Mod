package com.minecraft_1draftpick.pumamod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModItems.RAINBOW, new ItemStack(ModBlocks.NEW_BlOCK, 1), 1.5f);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.SOULGAZER, 1), 3.0f);
		GameRegistry.addSmelting(ModBlocks.CRYPTIC_BlOCK, new ItemStack(ModItems.RAINBOW, 3), 2.0f);
		
	}

}
