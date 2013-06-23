package spiderbiggen.sbc.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.blocks.SBCBlocks;
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


    /**
     * @param args
     */
    public static void InitItems(){
        boiledEgg = new ItemFoodSBCraft(3400, 1, 0.7F, false).setUnlocalizedName("boiledEgg").setCreativeTab(SpiderbigCraft.tabSBCraft);
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(boiledEgg), 0.5F);

        eggSalad = new ItemSoupSBCraft(3401, 4, false).setUnlocalizedName("eggSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", Character.valueOf('e'), boiledEgg, Character.valueOf('p'), Item.bakedPotato, Character.valueOf('b'), Item.bowlEmpty);

        potatoSalad = new ItemSoupSBCraft(3402, 5, false).setUnlocalizedName("potatoSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        GameRegistry.addRecipe(new ItemStack(potatoSalad), " p ", "pgp", " b ", Character.valueOf('p'), Item.bakedPotato, Character.valueOf('b'), Item.bowlEmpty, Character.valueOf('g'), Block.tallGrass);

        salmonSalad = new ItemSoupSBCraft(3403, 4, false).setUnlocalizedName("salmonSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        GameRegistry.addShapelessRecipe(new ItemStack(salmonSalad, 1), new Object[] { new ItemStack(Item.fishRaw, 2), new ItemStack(Item.bowlEmpty, 1), new ItemStack(Item.bakedPotato, 1), new ItemStack(boiledEgg, 1) });

        cheese = new ItemFoodSBCraft(3405, 2, 1.1F, true).setUnlocalizedName("cheese").setCreativeTab(SpiderbigCraft.tabSBCraft);
        GameRegistry.addShapelessRecipe(new ItemStack(cheese, 2), new Object[] { new ItemStack(Item.bucketMilk, 0, 3) });

        tomato = new ItemSeedFoodSBCraft(3406, 3, 0.3F, SBCBlocks.tomatoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("tomato").setCreativeTab(SpiderbigCraft.tabSBCraft);
        
        chunkRedStonium = new ItemSBCraft(3407).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("chunkRedStonium");
        GameRegistry.addRecipe(new ItemStack(chunkRedStonium), "rrr", "rcr", "rrr", Character.valueOf('r'), Item.redstone, Character.valueOf('c'), Item.clay);
        
        ingotRedStonium = new ItemSBCraft(3408).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("ingotRedStonium");
        GameRegistry.addSmelting(chunkRedStonium.itemID, new ItemStack(ingotRedStonium), 1.0F);
        
        chunkGlowStonium = new ItemSBCraft(3414).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("chunkGlowStonium");
        GameRegistry.addRecipe(new ItemStack(chunkGlowStonium), "rrr", "rcr", "rrr", Character.valueOf('r'), Item.lightStoneDust, Character.valueOf('c'), Block.obsidian);
        
        ingotGlowStonium = new ItemSBCraft(3415).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("ingotGlowStonium");
        GameRegistry.addSmelting(chunkGlowStonium.itemID, new ItemStack(ingotGlowStonium), 1.0F);
        
        // Enums
        REDSTONE = EnumHelper.addToolMaterial("Redstonium", 2, 775, 10F, 2, 15);
        GLOWSTONE = EnumHelper.addToolMaterial("Glowstonium", 3, 2250, 15F, 2, 35);

        // tools
        swordRedStonium = new ItemSwordSBCraft(3409, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("swordRedStonium");
        GameRegistry.addRecipe(new ItemStack(swordRedStonium), "R", "R", "S",Character.valueOf('R'), ingotRedStonium, Character.valueOf('S'), Item.stick);
        pickaxeRedStonium = new ItemPickaxeSBCraft(3410, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("pickaxeRedStonium");
        GameRegistry.addRecipe(new ItemStack(pickaxeRedStonium), "RRR", " S ", " S ",Character.valueOf('R'), ingotRedStonium, Character.valueOf('S'), Item.stick);
        shovelRedStonium = new ItemShovelSBCraft(3411, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("shovelRedStonium");
        GameRegistry.addRecipe(new ItemStack(shovelRedStonium), "R", "S", "S",Character.valueOf('R'), ingotRedStonium, Character.valueOf('S'), Item.stick);
        axeRedStonium = new ItemAxeSBCraft(3412, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("axeRedStonium");
        GameRegistry.addRecipe(new ItemStack(axeRedStonium), "RR", "SR", "S ",Character.valueOf('R'), ingotRedStonium, Character.valueOf('S'), Item.stick);
        GameRegistry.addRecipe(new ItemStack(axeRedStonium), "RR", "RS", " S",Character.valueOf('R'), ingotRedStonium, Character.valueOf('S'), Item.stick);
        hoeRedStonium = new ItemHoeSBCraft(3413, REDSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("hoeRedStonium");
        GameRegistry.addRecipe(new ItemStack(hoeRedStonium), "RR", " S", " S",Character.valueOf('R'), ingotRedStonium, Character.valueOf('S'), Item.stick);
        GameRegistry.addRecipe(new ItemStack(hoeRedStonium), "RR", "S ", "S ",Character.valueOf('R'), ingotRedStonium, Character.valueOf('S'), Item.stick);
        
        swordGlowStonium = new ItemSwordSBCraft(3416, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("swordGlowStonium");
        GameRegistry.addRecipe(new ItemStack(swordGlowStonium), "R", "R", "S",Character.valueOf('R'), ingotGlowStonium, Character.valueOf('S'), Item.stick);
        pickaxeGlowStonium = new ItemPickaxeSBCraft(3417, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("pickaxeGlowStonium");
        GameRegistry.addRecipe(new ItemStack(pickaxeGlowStonium), "RRR", " S ", " S ",Character.valueOf('R'), ingotGlowStonium, Character.valueOf('S'), Item.stick);
        shovelGlowStonium = new ItemShovelSBCraft(3418, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("shovelGlowStonium");
        GameRegistry.addRecipe(new ItemStack(shovelGlowStonium), "R", "S", "S",Character.valueOf('R'), ingotGlowStonium, Character.valueOf('S'), Item.stick);
        axeGlowStonium = new ItemAxeSBCraft(3419, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("axeGlowStonium");
        GameRegistry.addRecipe(new ItemStack(axeGlowStonium), "RR", "SR", "S ",Character.valueOf('R'), ingotGlowStonium, Character.valueOf('S'), Item.stick);
        GameRegistry.addRecipe(new ItemStack(axeGlowStonium), "RR", "RS", " S",Character.valueOf('R'), ingotGlowStonium, Character.valueOf('S'), Item.stick);
        hoeGlowStonium = new ItemHoeSBCraft(3420, GLOWSTONE).setCreativeTab(SpiderbigCraft.tabSBCraft).setUnlocalizedName("hoeGlowStonium");
        GameRegistry.addRecipe(new ItemStack(hoeGlowStonium), "RR", " S", " S",Character.valueOf('R'), ingotGlowStonium, Character.valueOf('S'), Item.stick);
        GameRegistry.addRecipe(new ItemStack(hoeGlowStonium), "RR", "S ", "S ",Character.valueOf('R'), ingotGlowStonium, Character.valueOf('S'), Item.stick);

    }

}
