package com.minecraft_1draftpick.pumamod.init;

import java.util.ArrayList;
import java.util.List;

import com.minecraft_1draftpick.pumamod.items.ItemBase;
import com.minecraft_1draftpick.pumamod.items.armor.ArmorBase;
import com.minecraft_1draftpick.pumamod.items.tools.ToolAxe;
import com.minecraft_1draftpick.pumamod.items.tools.ToolHoe;
import com.minecraft_1draftpick.pumamod.items.tools.ToolPickaxe;
import com.minecraft_1draftpick.pumamod.items.tools.ToolSpade;
import com.minecraft_1draftpick.pumamod.items.tools.ToolSword;
import com.minecraft_1draftpick.pumamod.util.Reference;

import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial MATERIAL_RAINBOW = EnumHelper.addToolMaterial("material_rainbow", 3, 250, 8.0f, 3.0f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RAINBOW = EnumHelper.addArmorMaterial("armor_material_rainbow", Reference.MOD_ID + ":rainbow", 14, 
			new int[] {2, 7, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//items
	public static final Item RAINBOW = new ItemBase("rainbow", Material.IRON);
	public static final Item SOULGAZER = new ItemBase("soulgazer", Material.IRON);
	
	//tools
	public static final ItemSword RAINBOW_SWORD = new ToolSword("rainbow_sword", MATERIAL_RAINBOW);
	public static final ItemSpade RAINBOW_SHOVEL = new ToolSpade("rainbow_shovel", MATERIAL_RAINBOW);
	public static final ItemPickaxe RAINBOW_PICKAXE = new ToolPickaxe("rainbow_pickaxe", MATERIAL_RAINBOW);
	public static final ItemAxe RAINBOW_AXE = new ToolAxe("rainbow_axe", MATERIAL_RAINBOW);
	public static final ItemHoe RAINBOW_HOE = new ToolHoe("rainbow_hoe", MATERIAL_RAINBOW);
	
	//armor
	public static final Item RAINBOW_HELMET = new ArmorBase("rainbow_helmet", ARMOR_MATERIAL_RAINBOW,1,EntityEquipmentSlot.HEAD);
	public static final Item RAINBOW_CHESTPLATE = new ArmorBase("rainbow_chestplate", ARMOR_MATERIAL_RAINBOW,1,EntityEquipmentSlot.CHEST);
	public static final Item RAINBOW_LEGGINGS = new ArmorBase("rainbow_leggings", ARMOR_MATERIAL_RAINBOW,2,EntityEquipmentSlot.LEGS);
	public static final Item RAINBOW_BOOTS = new ArmorBase("rainbow_boots", ARMOR_MATERIAL_RAINBOW,1,EntityEquipmentSlot.FEET);

}
