package spiderbiggen.sbc;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.sbc.blocks.SBCBlocks;
import spiderbiggen.sbc.config.ConfigurationHandler;
import spiderbiggen.sbc.items.SBCItems;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SpiderbigCraft {

    @Instance(Reference.MOD_ID)
    public static SpiderbigCraft instance;

    public static CreativeTabs tabSBCraft = new CreativeTabSBCraft("tabSBCraft");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	SBCBlocks.InitBlocks();
	SBCItems.InitItems();
	SBCItems.addRecipes();
    }

    @EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
