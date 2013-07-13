package spiderbiggen.sbc;


import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.sbc.blocks.SBCBlocks;
import spiderbiggen.sbc.config.ConfigurationHandler;
import spiderbiggen.sbc.items.SBCItems;
import spiderbiggen.sbc.lib.Reference;
import spiderbiggen.sbc.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

//import cpw.mods.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false)
public class SpiderbigCraft {

    @SidedProxy(clientSide = "spiderbiggen.sbc.proxy.ClientProxy", serverSide = "spiderbiggen.sbc.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static CreativeTabs tabSBCraft = new CreativeTabSBCraft("tabSBCraft");

    @Instance(Reference.MOD_ID)
    public static SpiderbigCraft instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.initSounds();
        proxy.initRenders();
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        SBCBlocks.InitBlocks();
        SBCItems.InitItems();
        SBCItems.addRecipes();
        SBCItems.addNames();
        SBCBlocks.addNames();
        
    }
     
    @EventHandler
    public void Init(FMLInitializationEvent event){
        
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }



}
