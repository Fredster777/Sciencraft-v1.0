package net.sciencraft.mod.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.sciencraft.mod.Sciencraft;

public class ItemBasic extends Item {

	public ItemBasic(int id) {
		super(id);
		
		this.setCreativeTab(Sciencraft.Sciencraft);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Sciencraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
