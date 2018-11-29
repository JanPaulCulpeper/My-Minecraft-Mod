package com.minecraft_1draftpick.pumamod.init;

import java.util.ArrayList;
import java.util.List;

import com.minecraft_1draftpick.pumamod.blocks.BlockBase;
import com.minecraft_1draftpick.pumamod.blocks.RainbowBlock;
import com.minecraft_1draftpick.pumamod.blocks.RainbowOre;
import com.minecraft_1draftpick.pumamod.blocks.counter.BlockCounter;
import com.minecraft_1draftpick.pumamod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks implements IHasModel
{
   public static final List<Block> BLOCKS = new ArrayList<Block>();
   
   public static final Block NEW_BlOCK = new RainbowBlock("new_block", Material.IRON);
   public static final Block CRYPTIC_BlOCK = new RainbowOre("cryptic_block", Material.IRON);
   
   public static BlockCounter counter = new BlockCounter();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				// ...
				counter
		);
	
		GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
	}
	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
		counter.registerModels();
	}
}
