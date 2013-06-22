package spiderbiggen.sbc;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.sbc.blocks.SBCBlocks;
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

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SpiderbigCraft {

    /**
     * CreativeTabs
     */
    public static CreativeTabs tabSBCraft = new CreativeTabSBCraft("tabSBCraft");

    @Init
    public void Init(FMLInitializationEvent event){
    }

    @PostInit
    public void preInit(FMLPostInitializationEvent event){
    }

    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        SBCBlocks.InitBlocks();
        SBCItems.InitItems();
    }

}
