package net.sciencraft.mod.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.sciencraft.mod.Sciencraft;

public class BasicOre extends Block{

	public BasicOre(int id, Material material) {
		super(id, material);
				
		this.setHardness(5f);
		this.setResistance(5f);
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(Sciencraft.Sciencraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Sciencraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}

