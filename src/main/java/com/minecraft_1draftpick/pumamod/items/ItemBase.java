package com.minecraft_1draftpick.pumamod.items;

import com.minecraft_1draftpick.pumamod.Main;
import com.minecraft_1draftpick.pumamod.init.ModItems;
import com.minecraft_1draftpick.pumamod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase  extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModel() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
