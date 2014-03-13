package net.sciencraft.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Sciencraft.modid, name = "Sciencraft", version = "v1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class Sciencraft {
	
	public static final String modid = "sciencraft";
	
	@EventHandler
	public void load(FMLInitializationEvent e){
		
	}
	
	public void registerBlock(Block block, String string, String name){
		GameRegistry.registerBlock(block, string);
		LanguageRegistry.addName(block, name);
		
	}
	
	public void registerItem(Item item, String string, String name){
		GameRegistry.registerItem(item, string);
		LanguageRegistry.addName(item, name);
	}

}
