package com.minecraft_1draftpick.pumamod.items.tools;

import com.minecraft_1draftpick.pumamod.Main;
import com.minecraft_1draftpick.pumamod.init.ModItems;
import com.minecraft_1draftpick.pumamod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{
	
	public ToolPickaxe(String name, ToolMaterial material){
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
