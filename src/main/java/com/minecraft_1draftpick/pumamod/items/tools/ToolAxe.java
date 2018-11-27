package com.minecraft_1draftpick.pumamod.items.tools;

import com.minecraft_1draftpick.pumamod.Main;
import com.minecraft_1draftpick.pumamod.init.ModItems;
import com.minecraft_1draftpick.pumamod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel {
	
	public ToolAxe(String name, ToolMaterial material){
		super(material, 6.0f, -3.2f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels(){
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
