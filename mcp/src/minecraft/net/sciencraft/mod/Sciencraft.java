package net.sciencraft.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.sciencraft.mod.block.BasicOre;
import net.sciencraft.mod.block.PhosphateRock;
import net.sciencraft.mod.block.StorageBlock;
import net.sciencraft.mod.block.SulphurOre;
import net.sciencraft.mod.block.VanadiumOre;
import net.sciencraft.mod.item.ItemBasic;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Sciencraft.modid, name = "Sciencraft", version = "Pre-Alpha v0.0001")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class Sciencraft {
	
	public static final String modid = "sciencraft";
	public static Block blockOreMagnesite;
	public static Block blockOreBauxite;
	public static Block blockOreSuplphur;
	public static Block blockChalk;
	public static Block blockRockPhosphate;
	public static Block blockOreStrontianite;
	public static Block blockOreYttrium;
	public static Block blockOreScandium;
	public static Block blockScandium;
	public static Block blockOreTitanium;
	public static Block blockTitanium;
	public static Block blockOreVanadium;
	public static Block blockVanadium;
	public static Block blockOreChromium;	
	public static Block blockChromium;
	public static Block blockOreMagnese;
	public static Block blockMagnese;
	public static Block blockOreCobalt;
	public static Block blockCobalt;
	public static Block blockOreNickel;
	public static Block blockNickel;
	public static Block blockOreCopper;
	public static Block blockCopper;
	public static Block blockOreZinc;
	public static Block blockZinc;
	public static Block blockSteel;
	public static Block blockConicalFlask;
	
	public static Item itemIngotMagnesium;
	public static Item itemIngotAluminum;
	public static Item itemSulphur;
	public static Item itemChalk;
	public static Item itemPhosphorus;
	public static Item itemIngotStrontium;
	public static Item itemIngotYttrium;
	public static Item itemIngotScandium;
	public static Item itemIngotTitanium;
	public static Item itemIngotVanadium;
	public static Item itemShardVanadite;
	public static Item itemIngotChromium;
	public static Item itemIngotMagnese;
	public static Item itemIngotCobalt;
	public static Item itemIngotNickel;
	public static Item itemIngotCopper;
	public static Item itemIngotZinc;
	public static Item itemIngotSteel;
	
	public static CreativeTabs Sciencraft;
	
	@EventHandler
	public void load(FMLInitializationEvent e){
		Sciencraft = new CreativeTabs("Sciencraft"){
			@SideOnly(Side.CLIENT)
			public int getTabIconItemIndex(){
				return itemIngotSteel.itemID;
			}
			
		};
		
		LanguageRegistry.instance().addStringLocalization(Sciencraft.getTranslatedTabLabel(), "Sciencraft");
		
		blockOreMagnesite = new BasicOre(3519, Material.rock).setUnlocalizedName("MagnesiteOre");
		registerBlock(blockOreMagnesite, "Magnesite Ore");
		blockOreBauxite = new BasicOre(3520, Material.rock).setUnlocalizedName("BauxiteOre");
		registerBlock(blockOreBauxite, "Bauxite Ore");
		blockOreSuplphur = new SulphurOre(3521, Material.rock).setUnlocalizedName("SulphurOre");
		registerBlock(blockOreSuplphur, "Sulphur Ore");
		blockChalk = new BasicOre(3522, Material.rock).setUnlocalizedName("BlockChalk");
		registerBlock(blockChalk, "Chalk");
		blockRockPhosphate = new PhosphateRock(3523, Material.rock).setUnlocalizedName("PhosphateRock");
		registerBlock(blockRockPhosphate, "Phosphate Rock");
		blockOreStrontianite = new BasicOre(3524, Material.rock).setUnlocalizedName("StrontianiteOre");
		registerBlock(blockOreStrontianite, "Strontianite Ore");
		blockOreYttrium = new BasicOre(3525, Material.rock).setUnlocalizedName("YttriumOre");
		registerBlock(blockOreYttrium, "Yttrium Ore");
		blockOreScandium = new BasicOre(3500, Material.rock).setUnlocalizedName("ScandiumOre");
		registerBlock(blockOreScandium, "Scandium Ore");
		blockScandium = new StorageBlock(3501, Material.iron).setUnlocalizedName("ScandiumBlock");
		registerBlock(blockScandium, "Scandium Block");
		blockOreTitanium = new BasicOre(3502, Material.rock).setUnlocalizedName("TitaniumOre");
		registerBlock(blockOreTitanium, "Titanium Ore");
		blockTitanium = new StorageBlock(3503, Material.iron).setUnlocalizedName("TitaniumBlock");
		registerBlock(blockTitanium, "Titanium Block");
		blockOreVanadium = new VanadiumOre(3504, Material.rock).setUnlocalizedName("Vanadite");
		registerBlock(blockOreVanadium, "Vanadite");
		blockVanadium = new StorageBlock(3505, Material.iron).setUnlocalizedName("VanadiumBlock");
		registerBlock(blockVanadium, "Vanadium Block");
		blockOreChromium = new BasicOre(3506, Material.rock).setUnlocalizedName("ChromiteOre");
		registerBlock(blockOreChromium, "Chromite Ore");
		blockChromium = new StorageBlock(3507, Material.iron).setUnlocalizedName("ChromiumBlock");
		registerBlock(blockChromium, "Chromium Block");
		blockOreMagnese = new BasicOre(3508, Material.rock).setUnlocalizedName("MagneseOre");
		registerBlock(blockOreMagnese, "Magnese Ore");
		blockMagnese = new StorageBlock(3509, Material.iron).setUnlocalizedName("MagneseBlock");
		registerBlock(blockMagnese, "Magnese Block");
		blockOreCobalt = new BasicOre(3510, Material.rock).setUnlocalizedName("CobaltOre");
		registerBlock(blockOreCobalt, "Cobalt Ore");
		blockCobalt = new StorageBlock(3511, Material.iron).setUnlocalizedName("CobaltBlock");
		registerBlock(blockCobalt, "Cobalt Block");
		blockOreNickel = new BasicOre(3512, Material.rock).setUnlocalizedName("NickelOre");
		registerBlock(blockOreNickel, "Nickel Ore");
		blockNickel = new StorageBlock(3513, Material.iron).setUnlocalizedName("NickelBlock");
		registerBlock(blockNickel, "Nickel Block");
		blockOreCopper = new BasicOre(3514, Material.rock).setUnlocalizedName("CopperOre");
		registerBlock(blockOreCopper, "Copper Ore");
		blockCopper = new StorageBlock(3515, Material.iron).setUnlocalizedName("CopperBlock");
		registerBlock(blockCopper, "Copper Block");
		blockOreZinc = new BasicOre(3516, Material.rock).setUnlocalizedName("ZincOre");
		registerBlock(blockOreZinc, "Zinc Ore");
		blockZinc = new StorageBlock(3517, Material.iron).setUnlocalizedName("ZincBlock");
		registerBlock(blockZinc, "Zinc Block");
		blockSteel = new StorageBlock(3518, Material.iron).setUnlocalizedName("SteelBlock");
		registerBlock(blockSteel, "Steel Block");
		
		itemIngotMagnesium  = new ItemBasic(6411).setUnlocalizedName("MagnesiumIngot");
	    registerItem(itemIngotMagnesium, "Magnesium Ingot");
		itemIngotAluminum  = new ItemBasic(6412).setUnlocalizedName("AluminumIngot");
	    registerItem(itemIngotAluminum, "Aluminum Ingot");
	    itemSulphur  = new ItemBasic(6413).setUnlocalizedName("Sulphur");
	    registerItem(itemSulphur, "Sulphur");
		itemChalk  = new ItemBasic(6414).setUnlocalizedName("Chalk");
	    registerItem(itemChalk, "Chalk");
	    itemPhosphorus  = new ItemBasic(6415).setUnlocalizedName("Phosphorus");
	    registerItem(itemPhosphorus, "Phosphorus");
		itemIngotStrontium  = new ItemBasic(6416).setUnlocalizedName("StrontiumIngot");
	    registerItem(itemIngotStrontium, "Strontium Ingot");
	    itemIngotYttrium  = new ItemBasic(6417).setUnlocalizedName("YttriumIngot");
	    registerItem(itemIngotYttrium, "Yttrium Ingot");
		itemIngotScandium  = new ItemBasic(6400).setUnlocalizedName("ScandiumIngot");
	    registerItem(itemIngotScandium, "Scandium Ingot");
		itemIngotTitanium  = new ItemBasic(6401).setUnlocalizedName("TitaniumIngot");
	    registerItem(itemIngotTitanium, "Titanium Ingot");
	    itemIngotVanadium  = new ItemBasic(6402).setUnlocalizedName("VanadiumIngot");
	    registerItem(itemIngotVanadium, "Vanadium Ingot");
	    itemShardVanadite  = new ItemBasic(6403).setUnlocalizedName("VanaditeShard");
	    registerItem(itemShardVanadite, "Vanadite Shard");
	    itemIngotChromium  = new ItemBasic(6404).setUnlocalizedName("ChromiumIngot");
	    registerItem(itemIngotChromium, "Chromium Ingot");
	    itemIngotMagnese  = new ItemBasic(6405).setUnlocalizedName("MagneseIngot");
	    registerItem(itemIngotMagnese, "Magnese Ingot");
	    itemIngotCobalt  = new ItemBasic(6406).setUnlocalizedName("CobaltIngot");
	    registerItem(itemIngotCobalt, "Cobalt Ingot");
	    itemIngotNickel  = new ItemBasic(6407).setUnlocalizedName("NickelIngot");
	    registerItem(itemIngotNickel, "Nickel Ingot");
	    itemIngotCopper  = new ItemBasic(6408).setUnlocalizedName("CopperIngot");
	    registerItem(itemIngotCopper, "Copper Ingot");
	    itemIngotZinc  = new ItemBasic(6409).setUnlocalizedName("ZincIngot");
	    registerItem(itemIngotZinc, "Zinc Ingot");
	    itemIngotSteel  = new ItemBasic(6410).setUnlocalizedName("SteelIngot");
	    registerItem(itemIngotSteel, "Steel Ingot");
	    
	    GameRegistry.addRecipe(new ItemStack(itemIngotScandium, 9), new Object[]{"X", 'X', blockScandium});
	    GameRegistry.addRecipe(new ItemStack(blockScandium), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotScandium});
	    GameRegistry.addRecipe(new ItemStack(itemIngotTitanium, 9), new Object[]{"X", 'X', blockTitanium});
	    GameRegistry.addRecipe(new ItemStack(blockTitanium), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotTitanium});
	    GameRegistry.addRecipe(new ItemStack(itemIngotVanadium, 9), new Object[]{"X", 'X', blockVanadium});
	    GameRegistry.addRecipe(new ItemStack(blockVanadium), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotVanadium});
	    GameRegistry.addRecipe(new ItemStack(itemIngotChromium, 9), new Object[]{"X", 'X', blockChromium});
	    GameRegistry.addRecipe(new ItemStack(blockChromium), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotChromium});
	    GameRegistry.addRecipe(new ItemStack(itemIngotMagnese, 9), new Object[]{"X", 'X', blockMagnese});
	    GameRegistry.addRecipe(new ItemStack(blockMagnese), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotMagnese});
	    GameRegistry.addRecipe(new ItemStack(itemIngotCobalt, 9), new Object[]{"X", 'X', blockCobalt});
	    GameRegistry.addRecipe(new ItemStack(blockCobalt), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotCobalt});
	    GameRegistry.addRecipe(new ItemStack(itemIngotNickel, 9), new Object[]{"X", 'X', blockNickel});
	    GameRegistry.addRecipe(new ItemStack(blockNickel), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotNickel});
	    GameRegistry.addRecipe(new ItemStack(itemIngotCopper, 9), new Object[]{"X", 'X', blockCopper});
	    GameRegistry.addRecipe(new ItemStack(blockCopper), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotCopper});
	    GameRegistry.addRecipe(new ItemStack(itemIngotZinc, 9), new Object[]{"X", 'X', blockZinc});
	    GameRegistry.addRecipe(new ItemStack(blockZinc), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotZinc});
	    GameRegistry.addRecipe(new ItemStack(itemIngotSteel, 9), new Object[]{"X", 'X', blockSteel});
	    GameRegistry.addRecipe(new ItemStack(blockSteel), new Object[]{"XXX", "XXX", "XXX", 'X', itemIngotSteel});
	    
	    GameRegistry.addSmelting(blockOreScandium.blockID, new ItemStack(itemIngotScandium), 0.5F);
	    GameRegistry.addSmelting(blockOreTitanium.blockID, new ItemStack(itemIngotTitanium), 0.5F);
	    GameRegistry.addSmelting(itemShardVanadite.itemID, new ItemStack(itemIngotVanadium), 0.5F);
	    GameRegistry.addSmelting(blockOreChromium.blockID, new ItemStack(itemIngotChromium), 0.5F);
	    GameRegistry.addSmelting(blockOreMagnese.blockID, new ItemStack(itemIngotMagnese), 0.5F);
	    GameRegistry.addSmelting(blockOreCobalt.blockID, new ItemStack(itemIngotCobalt), 0.5F);
	    GameRegistry.addSmelting(blockOreNickel.blockID, new ItemStack(itemIngotNickel), 0.5F);
	    GameRegistry.addSmelting(blockOreCopper.blockID, new ItemStack(itemIngotCopper), 0.5F);
	    GameRegistry.addSmelting(blockOreZinc.blockID, new ItemStack(itemIngotZinc), 0.5F);
	    GameRegistry.addSmelting(Item.ingotIron.itemID, new ItemStack(itemIngotSteel), 0.5F);
	}
	
	public void registerBlock(Block block, String name){
		GameRegistry.registerBlock(block, block.getItemIconName());
		LanguageRegistry.addName(block, name);
		
	}
	
	public void registerItem(Item item, String name){
		GameRegistry.registerItem(item, item.getUnlocalizedName());
		LanguageRegistry.addName(item, name);
	}

}
