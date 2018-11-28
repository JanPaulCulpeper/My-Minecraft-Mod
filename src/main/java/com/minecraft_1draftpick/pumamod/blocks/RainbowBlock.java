package com.minecraft_1draftpick.pumamod.blocks;

import com.minecraft_1draftpick.pumamod.Main;
import com.minecraft_1draftpick.pumamod.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RainbowBlock extends BlockBase implements IHasModel {

	public RainbowBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);

	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");		
	}

}
