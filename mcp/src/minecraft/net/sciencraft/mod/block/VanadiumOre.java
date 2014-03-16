package net.sciencraft.mod.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.sciencraft.mod.Sciencraft;

public class VanadiumOre extends Block{

	public VanadiumOre(int id, Material material) {
		super(id, material);
				
		this.setHardness(5f);
		this.setResistance(5f);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(Sciencraft.Sciencraft);
	}

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Sciencraft.itemShardVanadite.itemID;
    }

    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        return this.quantityDropped(par2Random) + par2Random.nextInt(par1 + 1);
    }

    public int quantityDropped(Random par1Random)
    {
        return 4 + par1Random.nextInt(2);
    }

	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Sciencraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}

