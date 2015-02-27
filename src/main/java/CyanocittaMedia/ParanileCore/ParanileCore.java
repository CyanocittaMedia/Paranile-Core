package CyanocittaMedia.ParanileCore;


import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid="ParanileCore",name="Paranile-Core",version="00.000.0001",dependencies="required-after:Forge")

public class ParanileCore
{
    public static final String MODID = "ParanileCore";
    public static final String VERSION = "00.000.0001";
    
	public static Item CeruleanSteelNugget;
	public static Item CeruleanSteelIngot;
	
	public static Block CeruleanSteelBlock;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
    	CeruleanSteelNugget = new ParanileCoreItem().setUnlocalizedName("CeruleanSteelNugget");
    	CeruleanSteelIngot = new ParanileCoreItem().setUnlocalizedName("CeruleanSteelIngot");
            // The second parameter is an unique registry identifier (not the displayed name)
            // Please don't use item1.getUnlocalizedName(), or you will make Lex sad
        GameRegistry.registerItem(CeruleanSteelNugget, "CeruleanSteelNugget");
        GameRegistry.registerItem(CeruleanSteelIngot, "CeruleanSteelIngot");
        
    	CeruleanSteelBlock = new ParanileCoreBlock(Material.iron).setBlockName("CeruleanSteelBlock").setCreativeTab(CreativeTabs.tabBlock);
    	
        GameRegistry.registerBlock(CeruleanSteelBlock, "CeruleanSteelBlock");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
    	// System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    }
}