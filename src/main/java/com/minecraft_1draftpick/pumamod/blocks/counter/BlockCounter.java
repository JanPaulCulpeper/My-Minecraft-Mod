package com.minecraft_1draftpick.pumamod.blocks.counter;

import java.util.ArrayList;

import javax.annotation.Nullable;

import com.minecraft_1draftpick.pumamod.blocks.BlockTileEntity;
import com.minecraft_1draftpick.pumamod.commands.Util.Teleport;
import com.minecraft_1draftpick.pumamod.util.IHasModel;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityCommandBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;



public class BlockCounter extends BlockTileEntity<TileEntityCounter> implements IHasModel{

	public BlockCounter() {
		super(Material.DRAGON_EGG, "counter"); 
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote) {
			TileEntityCounter tile = getTileEntity(world, pos);
			if (side == EnumFacing.DOWN) {
				tile.decrementCount();}
			else if (side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.EAST|| side == EnumFacing.WEST) {
				BlockPos closest = closestblock(world,pos,32);
				Teleport.teleportToDemension(player, closest.getX(), closest.getY(),closest.getZ());
			
			} else if (side == EnumFacing.UP) {
				tile.incrementCount();
			}
			player.sendMessage(new TextComponentString("ID: " + tile.getCount()));
		}
		return true;
	}
	
	
	static BlockPos closestblock(World world, BlockPos start, int radius){
		int quantity = 1;
		ArrayList<BlockPos> InRadiusAndSameId = new ArrayList<BlockPos>();
		BlockPos result = new BlockPos(start.getX(),start.getY(),start.getZ());
	while(quantity != radius) {
		for(int x = start.getX() - quantity; x <= start.getX() + quantity; x++)
			for(int y = start.getY() - quantity; y <= start.getY() + quantity; y++)
				for(int z = start.getZ() - quantity; z <= start.getZ() + quantity;z++) {
					BlockPos position = new BlockPos(x,y,z);
					if((position.getX() - start.getX() < 1 && position.getY() - start.getY() < 1 && position.getZ() - start.getZ()<1)) { 
						continue;
					}
					if (world.getTileEntity(position) instanceof TileEntityCounter){
						TileEntityCounter secondBlock = (TileEntityCounter) world.getTileEntity(position);
						TileEntityCounter firstBlock = (TileEntityCounter) world.getTileEntity(start);
						if( firstBlock.getCount() == secondBlock.getCount()) {
							InRadiusAndSameId.add(position);
						}
						
					}	
				}
		quantity++;
	}
	
	int xds = (InRadiusAndSameId.get(0).getX() - start.getX()) * (InRadiusAndSameId.get(0).getX() - start.getX());
	int yds = (InRadiusAndSameId.get(0).getY() - start.getY()) * (InRadiusAndSameId.get(0).getY() - start.getY());
	int zds = (InRadiusAndSameId.get(0).getZ() - start.getZ()) * (InRadiusAndSameId.get(0).getZ() - start.getZ());
	int min = (int) Math.sqrt(xds+yds+zds);
	int vec;
	for(BlockPos i : InRadiusAndSameId) {
		xds = (i.getX() - start.getX()) * (i.getX() - start.getX());
		yds = (i.getY() - start.getY()) * (i.getY() - start.getY());
		zds = (i.getZ() - start.getZ()) * (i.getZ() - start.getZ());
		vec = (int) Math.sqrt(xds+yds+zds);
		if(vec<=min) {
			min = vec;
			result = new BlockPos(i.getX(),i.getY(),i.getZ());
		}
	}
	
	return result;
		
	}
	
	@Override
	public Class<TileEntityCounter> getTileEntityClass() {
		return TileEntityCounter.class;
	}
	
	@Nullable
	@Override
	public TileEntityCounter createTileEntity(World world, IBlockState state) {
		return new TileEntityCounter();
	}

}