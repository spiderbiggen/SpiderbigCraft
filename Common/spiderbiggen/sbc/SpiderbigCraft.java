package spiderbiggen.sbc;

import net.minecraft.creativetab.CreativeTabs;
import spiderbiggen.sbc.blocks.SBCBlocks;
import spiderbiggen.sbc.client.gui.GuiHandler;
import spiderbiggen.sbc.config.ConfigurationHandler;
import spiderbiggen.sbc.items.SBCItems;
import spiderbiggen.sbc.lib.Reference;
import spiderbiggen.sbc.network.PacketHandler;
import spiderbiggen.sbc.tileentity.TileEntityGrillBlock;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class SpiderbigCraft {
    
    @Instance(Reference.MOD_ID)
    public static SpiderbigCraft instance;
    
    @SidedProxy(clientSide = "spiderbiggen.sbc.client.ClientProxy", serverSide = "spiderbiggen.sbc.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs tabSBCraft = new CreativeTabSBCraft("tabSBCraft");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        proxy.initSounds();
        proxy.initRenderers();
        SBCBlocks.InitBlocks();
        SBCItems.InitItems();
        SBCItems.addRecipes();
        GameRegistry();
        
    }
    
    @EventHandler
    public void Init(FMLInitializationEvent event) {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
    private void GameRegistry() {
        // blocks
        GameRegistry.registerBlock(SBCBlocks.tomatoCrop, "TomatoCrop");
        GameRegistry.registerBlock(SBCBlocks.grillIdle, "Grill");
        GameRegistry.registerBlock(SBCBlocks.grillActive, "GrillActive");
        GameRegistry.registerBlock(SBCBlocks.trap, "Trap");
        GameRegistry.registerBlock(SBCBlocks.spiderOre, "SpiderOre");
        // gui
        GameRegistry.registerTileEntity(TileEntityGrillBlock.class, "grill");
        // network
        NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
    }
}
