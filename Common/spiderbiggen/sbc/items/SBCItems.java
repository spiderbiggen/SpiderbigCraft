package spiderbiggen.sbc.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.blocks.SBCBlocks;
import spiderbiggen.sbc.lib.ItemIDs;
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

    public static void InitItems(){
        boiledEgg = new ItemFoodSBCraft(ItemIDs.BOILEDEGGID - 256, 1, 0.7F, false).setUnlocalizedName("boiledEgg").setCreativeTab(SpiderbigCraft.tabSBCraft);
        eggSalad = new ItemSoupSBCraft(ItemIDs.EGGSALADID - 256, 4, false).setUnlocalizedName("eggSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        potatoSalad = new ItemSoupSBCraft(ItemIDs.POTATOSALADID - 256, 5, false).setUnlocalizedName("potatoSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        salmonSalad = new ItemSoupSBCraft(ItemIDs.SALMONSALADID - 256, 4, false).setUnlocalizedName("salmonSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        cheese = new ItemFoodSBCraft(ItemIDs.CHEESEID - 256, 2, 1.1F, true).setUnlocalizedName("cheese").setCreativeTab(SpiderbigCraft.tabSBCraft);
        tomato = new ItemSeedFoodSBCraft(ItemIDs.TOMATOID - 256, 3, 0.3F, SBCBlocks.tomatoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("tomato").setCreativeTab(SpiderbigCraft.tabSBCraft);

        chunkRedStonium = new ItemSBCraft(ItemIDs.CHUNKREDSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("chunkRedStonium");
        ingotRedStonium = new ItemSBCraft(ItemIDs.INGOTREDSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("ingotRedStonium");
        chunkGlowStonium = new ItemSBCraft(ItemIDs.CHUNKGLOWSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("chunkGlowStonium");
        ingotGlowStonium = new ItemSBCraft(ItemIDs.INGOTGLOWSTONIUMID - 256).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("ingotGlowStonium");
        
        // Enums
        REDSTONE = EnumHelper.addToolMaterial("Redstonium", 2, 775, 10F, 2, 15);
        GLOWSTONE = EnumHelper.addToolMaterial("Glowstonium", 3, 2250, 15F, 2, 35);

        // tools
        swordRedStonium = new ItemSwordSBCraft(ItemIDs.REDSTONIUMSWORDID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("swordRedStonium");
        pickaxeRedStonium = new ItemPickaxeSBCraft(ItemIDs.REDSTONIUMPICKID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("pickaxeRedStonium");
        shovelRedStonium = new ItemShovelSBCraft(ItemIDs.REDSTONIUMSHOVELID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("shovelRedStonium");
        axeRedStonium = new ItemAxeSBCraft(ItemIDs.REDSTONIUMAXEID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("axeRedStonium");
        hoeRedStonium = new ItemHoeSBCraft(ItemIDs.REDSTONIUMHOEID - 256, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("hoeRedStonium");
        
        swordGlowStonium = new ItemSwordSBCraft(ItemIDs.GLOWSTONIUMSWORDID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("swordGlowStonium");
        pickaxeGlowStonium = new ItemPickaxeSBCraft(ItemIDs.GLOWSTONIUMPICKID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("pickaxeGlowStonium");
        shovelGlowStonium = new ItemShovelSBCraft(ItemIDs.GLOWSTONIUMSHOVELID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("shovelGlowStonium");
        axeGlowStonium = new ItemAxeSBCraft(ItemIDs.GLOWSTONIUMAXEID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("axeGlowStonium");
        hoeGlowStonium = new ItemHoeSBCraft(ItemIDs.GLOWSTONIUMHOEID - 256, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("hoeGlowStonium");

        ironWand = new ItemWandSBCraft(ItemIDs.IRONWAND - 256, 0.75f, 20).setUnlocalizedName("ironWand");
        diamondWand = new ItemWandSBCraft(ItemIDs.DIAMONDWAND - 256, 1.5f, 30).setUnlocalizedName("diamondWand");
        goldWand = new ItemWandSBCraft(ItemIDs.GOLDWAND - 256, 0.85f, 5).setUnlocalizedName("goldWand");
        lapisWand = new ItemWandSBCraft(ItemIDs.LAPISWAND - 256, 0.95f, 10).setUnlocalizedName("lapisWand");
        redstoneWand = new ItemWandSBCraft(ItemIDs.REDSTONEWAND - 256, 1.25f, 15).setUnlocalizedName("redstoneWand");
        glowstoneWand = new ItemWandSBCraft(ItemIDs.GLOWSTONEWAND - 256, 1.75f, 20).setUnlocalizedName("glowstoneWand");
        
        
        addRecipes();
    }

    public static void addRecipes(){
        GameRegistry.addSmelting(chunkGlowStonium.itemID, new ItemStack(ingotGlowStonium), 1.0F);
        GameRegistry.addRecipe(new ItemStack(chunkGlowStonium), "rrr", "rcr", "rrr", 'r', Item.redstone, 'c', Block.obsidian);
        GameRegistry.addSmelting(chunkRedStonium.itemID, new ItemStack(ingotRedStonium), 1.0F);
        GameRegistry.addRecipe(new ItemStack(chunkRedStonium), "rrr", "rcr", "rrr", 'r', Item.redstone, 'c', Item.clay);
        GameRegistry.addShapelessRecipe(new ItemStack(cheese, 2), new Object[] { new ItemStack(Item.bucketMilk, 0, 3) });
        GameRegistry.addShapelessRecipe(new ItemStack(salmonSalad, 1), new Object[] { new ItemStack(Item.fishRaw, 2), new ItemStack(Item.bowlEmpty, 1), new ItemStack(Item.bakedPotato, 1), new ItemStack(boiledEgg, 1) });
        GameRegistry.addRecipe(new ItemStack(potatoSalad), " p ", "pgp", " b ", 'p', Item.bakedPotato, 'b', Item.bowlEmpty, 'g', Block.tallGrass);
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", 'e', boiledEgg, 'p', Item.bakedPotato, 'b', Item.bowlEmpty);
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(boiledEgg), 0.5F);

        String[][] recipePatterns = new String[][] { { "XXX", " # ", " # " }, { "X", "#", "#" }, { "XX", "X#", " #" }, { "XX", " #", " #" } };
        Object[][] recipeSBCItems = new Object[][] { { SBCItems.ingotRedStonium, SBCItems.ingotGlowStonium }, { SBCItems.pickaxeRedStonium, SBCItems.pickaxeGlowStonium }, { SBCItems.shovelRedStonium, SBCItems.shovelGlowStonium }, { SBCItems.axeRedStonium, SBCItems.axeGlowStonium }, { SBCItems.hoeRedStonium, SBCItems.hoeGlowStonium } };
        for (int i = 0; i < recipeSBCItems[0].length; ++i) {
            Object object = recipeSBCItems[0][i];

            for (int j = 0; j < recipeSBCItems.length - 1; ++j) {
                Item item = (Item) recipeSBCItems[j + 1][i];
                GameRegistry.addRecipe(new ItemStack(item), new Object[] { recipePatterns[j], '#', Item.stick, 'X', object });
            }
        }
    }
    
}
