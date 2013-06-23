package spiderbiggen.sbc.config;

import java.io.File;
import java.util.logging.Level;

import spiderbiggen.sbc.lib.ItemIDs;
import spiderbiggen.sbc.lib.Reference;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
    public static Configuration config;
    
    public static void init(File file){
        config = new Configuration(file);
        
        try{
            config.load();
            ItemIDs.BOILEDEGGID = config.getItem("boiledEgg", ItemIDs.BOILEDEGGID_DEFAULT).getInt(ItemIDs.BOILEDEGGID_DEFAULT);
            ItemIDs.CHEESEID = config.getItem("cheese", ItemIDs.CHEESEID_DEFAULT).getInt(ItemIDs.CHEESEID_DEFAULT);
            ItemIDs.CHUNKGLOWSTONIUMID = config.getItem("chunkGlowStonium", ItemIDs.CHUNKGLOWSTONIUMID_DEFAULT).getInt(ItemIDs.CHUNKGLOWSTONIUMID_DEFAULT);
            ItemIDs.CHUNKREDSTONIUMID  = config.getItem("chunkRedStonium", ItemIDs.CHUNKREDSTONIUMID_DEFAULT).getInt(ItemIDs.CHUNKREDSTONIUMID_DEFAULT);
            ItemIDs.EGGSALADID  = config.getItem("eggSalad", ItemIDs.EGGSALADID_DEFAULT).getInt(ItemIDs.EGGSALADID_DEFAULT);
            ItemIDs.INGOTGLOWSTONIUMID  = config.getItem("ingotGlowStonium", ItemIDs.INGOTGLOWSTONIUMID_DEFAULT).getInt(ItemIDs.INGOTGLOWSTONIUMID_DEFAULT);
            ItemIDs.INGOTREDSTONIUMID  = config.getItem("ingotRedStonium", ItemIDs.INGOTREDSTONIUMID_DEFAULT).getInt(ItemIDs.INGOTREDSTONIUMID_DEFAULT);
            ItemIDs.POTATOSALADID  = config.getItem("potatoSalad", ItemIDs.POTATOSALADID_DEFAULT).getInt(ItemIDs.POTATOSALADID_DEFAULT);
            ItemIDs.SALMONSALADID  = config.getItem("salmonSalad", ItemIDs.SALMONSALADID_DEFAULT).getInt(ItemIDs.SALMONSALADID_DEFAULT);
            ItemIDs.TOMATOID  = config.getItem("tomato", ItemIDs.TOMATOID_DEFAULT).getInt(ItemIDs.TOMATOID_DEFAULT);
            ItemIDs.TOOLSGLOWSTONIUMID = config.getItem("glowstoniumtools", ItemIDs.TOOLSGLOWSTONIUMID_DEFAULT).getInt(ItemIDs.TOOLSGLOWSTONIUMID_DEFAULT);
            ItemIDs.TOOLSREDSTONIUMID = config.getItem("redstoniumtools", ItemIDs.TOOLSREDSTONIUMID_DEFAULT).getInt(ItemIDs.TOOLSREDSTONIUMID_DEFAULT);
            
        }catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "has a problem loading the config file");
        }finally{
            config.save();
        }
    }
}
