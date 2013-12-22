package spiderbiggen.sbc.config;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import spiderbiggen.sbc.lib.IDs;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
    public static void init(File file) {
	Configuration config = new Configuration(file);

	try {
	    config.load();

	    // Blocks
	    IDs.TOMATOCROPID = config.getBlock("crops", "tomatoCrop", IDs.BLOCKDEFAULT).getInt();
	    IDs.GRILLBLOCKID = config.getBlock("machines", "grillBlock", IDs.BLOCKDEFAULT + 1).getInt();
	    IDs.GRILLBLOCKACTIVEID = config.getBlock("machines", "grillBlockActive", IDs.BLOCKDEFAULT + 2).getInt();
	    IDs.TRAPBLOCKID = config.getBlock("machines", "trap", IDs.BLOCKDEFAULT + 3).getInt();

	    // Items
	    IDs.BOILEDEGGID = config.getItem("foods/crops", "boiledEgg", IDs.ITEMDEFAULT).getInt();
	    IDs.CHEESEID = config.getItem("foods/crops", "cheese", IDs.ITEMDEFAULT + 1).getInt();
	    IDs.CHUNKGLOWSTONIUMID = config.getItem("foods/crops", "chunkGlowStonium", IDs.ITEMDEFAULT + 2).getInt();
	    IDs.CHUNKREDSTONIUMID = config.getItem("foods/crops", "chunkRedStonium", IDs.ITEMDEFAULT + 3).getInt();
	    IDs.EGGSALADID = config.getItem("foods/crops", "eggSalad", IDs.ITEMDEFAULT + 4).getInt();
	    IDs.INGOTGLOWSTONIUMID = config.getItem("foods/crops", "ingotGlowStonium", IDs.ITEMDEFAULT + 5).getInt();
	    IDs.INGOTREDSTONIUMID = config.getItem("foods/crops", "ingotRedStonium", IDs.ITEMDEFAULT + 6).getInt();
	    IDs.POTATOSALADID = config.getItem("foods/crops", "potatoSalad", IDs.ITEMDEFAULT + 7).getInt();
	    IDs.SALMONSALADID = config.getItem("foods/crops", "salmonSalad", IDs.ITEMDEFAULT + 8).getInt();
	    IDs.TOMATOID = config.getItem("foods/crops", "tomato", IDs.ITEMDEFAULT + 9).getInt();

	    IDs.GLOWSTONIUMPICKID = config.getItem("tools", "glowstoniumpickaxe", IDs.ITEMDEFAULT + 10).getInt();
	    IDs.GLOWSTONIUMSHOVELID = config.getItem("tools", "glowstoniumshovel", IDs.ITEMDEFAULT + 11).getInt();
	    IDs.GLOWSTONIUMSWORDID = config.getItem("tools", "glowstoniumsword", IDs.ITEMDEFAULT + 12).getInt();
	    IDs.GLOWSTONIUMAXEID = config.getItem("tools", "glowstoniumaxe", IDs.ITEMDEFAULT + 13).getInt();
	    IDs.GLOWSTONIUMHOEID = config.getItem("tools", "glowstoniumhoe", IDs.ITEMDEFAULT + 14).getInt();

	    IDs.REDSTONIUMPICKID = config.getItem("tools", "redstoniumpickaxe", IDs.ITEMDEFAULT + 15).getInt();
	    IDs.REDSTONIUMSHOVELID = config.getItem("tools", "redstoniumshovel", IDs.ITEMDEFAULT + 16).getInt();
	    IDs.REDSTONIUMSWORDID = config.getItem("tools", "redstoniumsword", IDs.ITEMDEFAULT + 17).getInt();
	    IDs.REDSTONIUMAXEID = config.getItem("tools", "redstoniumaxe", IDs.ITEMDEFAULT + 18).getInt();
	    IDs.REDSTONIUMHOEID = config.getItem("tools", "redstoniumhoe", IDs.ITEMDEFAULT + 19).getInt();

	    IDs.IRONWAND = config.getItem("wands", "ironwand", IDs.ITEMDEFAULT + 20).getInt();
	    IDs.DIAMONDWAND = config.getItem("wands", "diamondwand", IDs.ITEMDEFAULT + 21).getInt();
	    IDs.GOLDWAND = config.getItem("wands", "goldwand", IDs.ITEMDEFAULT + 22).getInt();
	    IDs.LAPISWAND = config.getItem("wands", "lapiswand", IDs.ITEMDEFAULT + 23).getInt();
	    IDs.REDSTONEWAND = config.getItem("wands", "redstonewand", IDs.ITEMDEFAULT + 24).getInt();
	    IDs.GLOWSTONEWAND = config.getItem("wands", "glowstonewand", IDs.ITEMDEFAULT + 25).getInt();
	} catch (Exception e) {
	    FMLLog.log(Level.SEVERE, e, Reference.MOD_ID.toLowerCase() + " has a problem loading the config file");
	} finally {
	    config.save();
	}
    }
}
