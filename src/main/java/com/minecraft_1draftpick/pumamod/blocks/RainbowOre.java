package com.minecraft_1draftpick.pumamod.blocks;

import java.util.Random;

import com.minecraft_1draftpick.pumamod.Main;
import com.minecraft_1draftpick.pumamod.init.ModItems;
import com.minecraft_1draftpick.pumamod.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RainbowOre extends BlockBase implements IHasModel {

	public RainbowOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RAINBOW;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 4;
		int min = 1;
		return rand.nextInt(max) + min;
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");		
	}

}
