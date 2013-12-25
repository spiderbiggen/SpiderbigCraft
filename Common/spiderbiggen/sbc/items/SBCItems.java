package spiderbiggen.sbc.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.blocks.SBCBlocks;
import spiderbiggen.sbc.lib.IDs;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class SBCItems {
    
    public static Item eggSalad;
    public static Item potatoSalad;
    public static Item salmonSalad;
    public static Item boiledEgg;
    public static Item cheese;
    public static Item tomato;
    public static Item chunkRedStonium;
    public static Item ingotRedStonium;
    public static Item chunkGlowStonium;
    public static Item ingotGlowStonium;
    
    public static EnumToolMaterial REDSTONE;
    public static EnumToolMaterial GLOWSTONE;
    
    public static Item pickaxeRedStonium;
    public static Item shovelRedStonium;
    public static Item swordRedStonium;
    public static Item hoeRedStonium;
    public static Item axeRedStonium;
    
    public static Item pickaxeGlowStonium;
    public static Item shovelGlowStonium;
    public static Item swordGlowStonium;
    public static Item hoeGlowStonium;
    public static Item axeGlowStonium;
    
    public static Item ironWand;
    public static Item diamondWand;
    public static Item goldWand;
    public static Item lapisWand;
    public static Item redstoneWand;
    public static Item glowstoneWand;
    
    public static void InitItems() {
        boiledEgg = new ItemFoodSBCraft(IDs.BOILEDEGGID - 256, 1, 0.7F, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "boiledEgg").setCreativeTab(SpiderbigCraft.tabSBCraft);
        eggSalad = new ItemSoupSBCraft(IDs.EGGSALADID - 256, 4, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "eggSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        potatoSalad = new ItemSoupSBCraft(IDs.POTATOSALADID - 256, 5, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "potatoSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        salmonSalad = new ItemSoupSBCraft(IDs.SALMONSALADID - 256, 4, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "salmonSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        cheese = new ItemFoodSBCraft(IDs.CHEESEID - 256, 2, 1.1F, true).setUnlocalizedName(Reference.RESOURCE_PREFIX + "cheese").setCreativeTab(SpiderbigCraft.tabSBCraft);
        tomato = new ItemSeedFoodSBCraft(IDs.TOMATOID - 256, 3, 0.3F, SBCBlocks.tomatoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "tomato").setCreativeTab(SpiderbigCraft.tabSBCraft);
        
        chunkRedStonium = new ItemSBCraft(IDs.CHUNKREDSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "chunkRedStonium");
        ingotRedStonium = new ItemSBCraft(IDs.INGOTREDSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "ingotRedStonium");
        chunkGlowStonium = new ItemSBCraft(IDs.CHUNKGLOWSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "chunkGlowStonium");
        ingotGlowStonium = new ItemSBCraft(IDs.INGOTGLOWSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "ingotGlowStonium");
        
        // Enums
        REDSTONE = EnumHelper.addToolMaterial("Redstonium", 2, 775, 10F, 2, 15);
        GLOWSTONE = EnumHelper.addToolMaterial("Glowstonium", 4, 2250, 17.5F, 4, 35);
        
        // tools
        swordRedStonium = new ItemSwordSBCraft(IDs.REDSTONIUMSWORDID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "swordRedStonium");
        pickaxeRedStonium = new ItemPickaxeSBCraft(IDs.REDSTONIUMPICKID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "pickaxeRedStonium");
        shovelRedStonium = new ItemShovelSBCraft(IDs.REDSTONIUMSHOVELID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "shovelRedStonium");
        axeRedStonium = new ItemAxeSBCraft(IDs.REDSTONIUMAXEID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "axeRedStonium");
        hoeRedStonium = new ItemHoeSBCraft(IDs.REDSTONIUMHOEID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "hoeRedStonium");
        
        swordGlowStonium = new ItemSwordSBCraft(IDs.GLOWSTONIUMSWORDID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "swordGlowStonium");
        pickaxeGlowStonium = new ItemPickaxeSBCraft(IDs.GLOWSTONIUMPICKID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "pickaxeGlowStonium");
        shovelGlowStonium = new ItemShovelSBCraft(IDs.GLOWSTONIUMSHOVELID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "shovelGlowStonium");
        axeGlowStonium = new ItemAxeSBCraft(IDs.GLOWSTONIUMAXEID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "axeGlowStonium");
        hoeGlowStonium = new ItemHoeSBCraft(IDs.GLOWSTONIUMHOEID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName(Reference.RESOURCE_PREFIX + "hoeGlowStonium");
        
        ironWand = new ItemWandSBCraft(IDs.IRONWAND - 256, 0.75f, 20).setUnlocalizedName(Reference.RESOURCE_PREFIX + "ironWand");
        diamondWand = new ItemWandSBCraft(IDs.DIAMONDWAND - 256, 1.5f, 30).setUnlocalizedName(Reference.RESOURCE_PREFIX + "diamondWand");
        goldWand = new ItemWandSBCraft(IDs.GOLDWAND - 256, 0.85f, 5).setUnlocalizedName(Reference.RESOURCE_PREFIX + "goldWand");
        lapisWand = new ItemWandSBCraft(IDs.LAPISWAND - 256, 0.95f, 10).setUnlocalizedName(Reference.RESOURCE_PREFIX + "lapisWand");
        redstoneWand = new ItemWandSBCraft(IDs.REDSTONEWAND - 256, 1.25f, 15).setUnlocalizedName(Reference.RESOURCE_PREFIX + "redstoneWand");
        glowstoneWand = new ItemWandSBCraft(IDs.GLOWSTONEWAND - 256, 1.75f, 20).setUnlocalizedName(Reference.RESOURCE_PREFIX + "glowstoneWand");
        
    }
    
    public static void addRecipes() {
        GameRegistry.addSmelting(chunkGlowStonium.itemID, new ItemStack(ingotGlowStonium), 1.0F);
        GameRegistry.addRecipe(new ItemStack(chunkGlowStonium), "ror", "oco", "ror", 'r', Item.glowstone, 'o', Block.obsidian, 'c', Item.clay);
        GameRegistry.addSmelting(chunkRedStonium.itemID, new ItemStack(ingotRedStonium), 1.0F);
        GameRegistry.addRecipe(new ItemStack(chunkRedStonium), "rir", "ici", "rir", 'r', Item.redstone, 'c', Item.clay, 'i', Item.ingotIron);
        GameRegistry.addShapelessRecipe(new ItemStack(cheese, 2), new Object[] { new ItemStack(Item.bucketMilk, 0, 3) });
        GameRegistry.addShapelessRecipe(new ItemStack(salmonSalad, 1), new Object[] { new ItemStack(Item.fishRaw, 2), new ItemStack(Item.bowlEmpty, 1), new ItemStack(Item.bakedPotato, 1), new ItemStack(boiledEgg, 1) });
        GameRegistry.addRecipe(new ItemStack(potatoSalad), " p ", "pgp", " b ", 'p', Item.bakedPotato, 'b', Item.bowlEmpty, 'g', Block.tallGrass);
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", 'e', boiledEgg, 'p', Item.bakedPotato, 'b', Item.bowlEmpty);
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(boiledEgg), 0.5F);
        
        String[][] recipePatterns = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
        Object[][] recipeSBCItems = new Object[][] { { ingotRedStonium, ingotGlowStonium }, { pickaxeRedStonium, pickaxeGlowStonium }, { shovelRedStonium, shovelGlowStonium }, { axeRedStonium, axeGlowStonium }, { hoeRedStonium, hoeGlowStonium } };
        for (int i = 0; i < recipeSBCItems[0].length; ++i) {
            Object object = recipeSBCItems[0][i];
            
            for (int j = 0; j < recipeSBCItems.length - 1; ++j) {
                Item item = (Item) recipeSBCItems[j + 1][i];
                GameRegistry.addRecipe(new ItemStack(item), new Object[] { recipePatterns[j], '#', Item.stick, 'X', object });
            }
        }
    }
}
