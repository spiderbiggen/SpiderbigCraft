package spiderbiggen.sbc.config;

import java.io.File;
import java.util.logging.Level;

import spiderbiggen.sbc.lib.BlockIDs;
import spiderbiggen.sbc.lib.ItemIDs;
import spiderbiggen.sbc.lib.Reference;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler {
    public static void init(File file) {
	Configuration config = new Configuration(file);

	try {
	    config.load();

	    // Blocks
	    BlockIDs.TOMATOCROPID = config.getBlock("crops", "tomatoCrop", BlockIDs.DEFAULT).getInt();
	    BlockIDs.GRILLBLOCKID = config.getBlock("machines", "grillBlock", BlockIDs.DEFAULT + 1).getInt();
	    BlockIDs.GRILLBLOCKACTIVEID = config.getBlock("machines", "grillBlockActive", BlockIDs.DEFAULT + 2).getInt();
	    BlockIDs.TRAPBLOCKID = config.getBlock("machines", "trap", BlockIDs.DEFAULT + 3).getInt();
	    
	    // Items
	    ItemIDs.BOILEDEGGID = config.getItem("foods/crops", "boiledEgg", ItemIDs.DEFAULT).getInt();
	    ItemIDs.CHEESEID = config.getItem("foods/crops", "cheese", ItemIDs.DEFAULT + 1).getInt();
	    ItemIDs.CHUNKGLOWSTONIUMID = config.getItem("foods/crops", "chunkGlowStonium", ItemIDs.DEFAULT + 2).getInt();
	    ItemIDs.CHUNKREDSTONIUMID = config.getItem("foods/crops", "chunkRedStonium", ItemIDs.DEFAULT + 3).getInt();
	    ItemIDs.EGGSALADID = config.getItem("foods/crops", "eggSalad", ItemIDs.DEFAULT + 4).getInt();
	    ItemIDs.INGOTGLOWSTONIUMID = config.getItem("foods/crops", "ingotGlowStonium", ItemIDs.DEFAULT + 5).getInt();
	    ItemIDs.INGOTREDSTONIUMID = config.getItem("foods/crops", "ingotRedStonium", ItemIDs.DEFAULT + 6).getInt();
	    ItemIDs.POTATOSALADID = config.getItem("foods/crops", "potatoSalad", ItemIDs.DEFAULT + 7).getInt();
	    ItemIDs.SALMONSALADID = config.getItem("foods/crops", "salmonSalad", ItemIDs.DEFAULT + 8).getInt();
	    ItemIDs.TOMATOID = config.getItem("foods/crops", "tomato", ItemIDs.DEFAULT + 9).getInt();

	    ItemIDs.GLOWSTONIUMPICKID = config.getItem("tools", "glowstoniumpickaxe", ItemIDs.DEFAULT + 10).getInt();
	    ItemIDs.GLOWSTONIUMSHOVELID = config.getItem("tools", "glowstoniumshovel", ItemIDs.DEFAULT + 11).getInt();
	    ItemIDs.GLOWSTONIUMSWORDID = config.getItem("tools", "glowstoniumsword", ItemIDs.DEFAULT + 12).getInt();
	    ItemIDs.GLOWSTONIUMAXEID = config.getItem("tools", "glowstoniumaxe", ItemIDs.DEFAULT + 13).getInt();
	    ItemIDs.GLOWSTONIUMHOEID = config.getItem("tools", "glowstoniumhoe", ItemIDs.DEFAULT + 14).getInt();

	    ItemIDs.REDSTONIUMPICKID = config.getItem("tools", "redstoniumpickaxe", ItemIDs.DEFAULT + 15).getInt();
	    ItemIDs.REDSTONIUMSHOVELID = config.getItem("tools", "redstoniumshovel", ItemIDs.DEFAULT + 16).getInt();
	    ItemIDs.REDSTONIUMSWORDID = config.getItem("tools", "redstoniumsword", ItemIDs.DEFAULT + 17).getInt();
	    ItemIDs.REDSTONIUMAXEID = config.getItem("tools", "redstoniumaxe", ItemIDs.DEFAULT + 18).getInt();
	    ItemIDs.REDSTONIUMHOEID = config.getItem("tools", "redstoniumhoe", ItemIDs.DEFAULT + 19).getInt();

	    ItemIDs.IRONWAND = config.getItem("wands", "ironwand", ItemIDs.DEFAULT + 20).getInt();
	    ItemIDs.DIAMONDWAND = config.getItem("wands", "diamondwand", ItemIDs.DEFAULT + 21).getInt();
	    ItemIDs.GOLDWAND = config.getItem("wands", "goldwand", ItemIDs.DEFAULT + 22).getInt();
	    ItemIDs.LAPISWAND = config.getItem("wands", "lapiswand", ItemIDs.DEFAULT + 23).getInt();
	    ItemIDs.REDSTONEWAND = config.getItem("wands", "redstonewand", ItemIDs.DEFAULT + 24).getInt();
	    ItemIDs.GLOWSTONEWAND = config.getItem("wands", "glowstonewand", ItemIDs.DEFAULT + 25).getInt();
	} catch (Exception e) {
	    FMLLog.log(Level.SEVERE, e, Reference.MOD_ID.toLowerCase() + " has a problem loading the config file");
	} finally {
	    config.save();
	}
    }
}
