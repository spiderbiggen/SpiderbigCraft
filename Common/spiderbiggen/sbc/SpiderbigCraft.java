package spiderbiggen.sbc;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.sbc.blocks.SBCBlocks;
import spiderbiggen.sbc.config.ConfigurationHandler;
import spiderbiggen.sbc.core.LocalizationHandler;
import spiderbiggen.sbc.items.SBCItems;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

//import cpw.mods.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = {Reference.CHANNEL_NAME}, clientSideRequired = true, serverSideRequired = false)
public class SpiderbigCraft {

    /**
     * CreativeTabs
     */
    public static CreativeTabs tabSBCraft = new CreativeTabSBCraft("tabSBCraft");

    @Init
    public void Init(FMLInitializationEvent event){
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event){
    }

    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        LocalizationHandler.loadLanguages();
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        SBCBlocks.InitBlocks();
        SBCItems.InitItems();
    }

}
