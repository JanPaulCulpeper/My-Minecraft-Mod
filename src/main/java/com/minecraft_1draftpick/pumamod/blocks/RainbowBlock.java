package com.minecraft_1draftpick.pumamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RainbowBlock extends BlockBase {

	public RainbowBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);

	}

}
