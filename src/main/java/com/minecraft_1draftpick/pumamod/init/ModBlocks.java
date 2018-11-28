package com.minecraft_1draftpick.pumamod.init;

import java.util.ArrayList;
import java.util.List;

import com.minecraft_1draftpick.pumamod.blocks.BlockBase;
import com.minecraft_1draftpick.pumamod.blocks.RainbowBlock;
import com.minecraft_1draftpick.pumamod.blocks.RainbowOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
   public static final List<Block> BLOCKS = new ArrayList<Block>();
   
   public static final Block NEW_BlOCK = new RainbowBlock("new_block", Material.IRON);
   public static final Block CRYPTIC_BlOCK = new RainbowOre("cryptic_block", Material.IRON);
}
