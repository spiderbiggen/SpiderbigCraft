package spiderbiggen.sbc.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.blocks.SBCBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SBCItems {

    public static Item eggSalad;
    public static Item potatoSalad;
    public static Item salmonSalad;
    public static Item boiledEgg;
    public static Item cheese;
    public static Item tomato;

    /**
     * @param args
     */
    public static void InitItems(){
        boiledEgg = new ItemFoodSBCraft(3400, 1, 0.7F, false).setUnlocalizedName("boiledEgg").setCreativeTab(SpiderbigCraft.tabSBCraft);
        LanguageRegistry.addName(boiledEgg, "Boiled Egg");
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(boiledEgg), 0.5F);

        eggSalad = new ItemSoupSBCraft(3401, 4, false).setUnlocalizedName("eggSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        LanguageRegistry.addName(eggSalad, "Egg Salad");
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", Character.valueOf('e'), boiledEgg, Character.valueOf('p'), Item.bakedPotato, Character.valueOf('b'), Item.bowlEmpty);

        potatoSalad = new ItemSoupSBCraft(3402, 5, false).setUnlocalizedName("potatoSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        LanguageRegistry.addName(potatoSalad, "Potato Salad");
        GameRegistry.addRecipe(new ItemStack(potatoSalad), " p ", "pgp", " b ", Character.valueOf('p'), Item.bakedPotato, Character.valueOf('b'), Item.bowlEmpty, Character.valueOf('g'), Block.tallGrass);

        salmonSalad = new ItemSoupSBCraft(3403, 4, false).setUnlocalizedName("salmonSalad").setCreativeTab(SpiderbigCraft.tabSBCraft);
        LanguageRegistry.addName(salmonSalad, "Salmon Salad");
        GameRegistry.addShapelessRecipe(new ItemStack(salmonSalad, 1), new Object[] { new ItemStack(Item.fishRaw, 2), new ItemStack(Item.bowlEmpty, 1), new ItemStack(Item.bakedPotato, 1), new ItemStack(boiledEgg, 1) });

        cheese = new ItemFoodSBCraft(3405, 2, 1.1F, true).setUnlocalizedName("cheese").setCreativeTab(SpiderbigCraft.tabSBCraft);
        LanguageRegistry.addName(cheese, "Cheese");
        GameRegistry.addShapelessRecipe(new ItemStack(cheese, 2), new Object[] { new ItemStack(Item.bucketMilk, 0, 3) });

        tomato = new ItemSeedFoodSBCraft(3406, 3, 0.3F, SBCBlocks.tomatoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("tomato").setCreativeTab(SpiderbigCraft.tabSBCraft);
        LanguageRegistry.addName(tomato, "Tomato");
    }

}
