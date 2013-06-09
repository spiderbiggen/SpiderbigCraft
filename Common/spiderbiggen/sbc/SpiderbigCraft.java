package spiderbiggen.sbc;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SpiderbigCraft {

    /**
     * Blocks
     */
    public static Block tomatoCrop;

    /**
     * Items
     */
    public static Item eggSalad;
    public static Item potatoSalad;
    public static Item salmonSalad;
    public static Item boiledEgg;
    public static Item cheese;
    public static Item tomato;

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
        // blocks
        tomatoCrop = new TomatoCrop(3399).setUnlocalizedName("tomatoCrop").setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
        LanguageRegistry.addName(tomatoCrop, "Tomato");

        // items
        boiledEgg = new ItemFoodSBCraft(3400, 1, 0.7F, false).setUnlocalizedName("boiledEgg").setCreativeTab(tabSBCraft);
        LanguageRegistry.addName(boiledEgg, "Boiled Egg");
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(boiledEgg), 0.5F);

        eggSalad = new ItemSoupSBCraft(3401, 4, false).setUnlocalizedName("eggSalad");
        LanguageRegistry.addName(eggSalad, "Egg Salad");
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", Character.valueOf('e'), boiledEgg, Character.valueOf('p'), Item.bakedPotato, Character.valueOf('b'), Item.bowlEmpty);

        potatoSalad = new ItemSoupSBCraft(3402, 5, false).setUnlocalizedName("potatoSalad").setCreativeTab(tabSBCraft);
        LanguageRegistry.addName(potatoSalad, "Potato Salad");
        GameRegistry.addRecipe(new ItemStack(potatoSalad), " p ", "pgp", " b ", Character.valueOf('p'), Item.bakedPotato, Character.valueOf('b'), Item.bowlEmpty, Character.valueOf('g'), Block.tallGrass);

        salmonSalad = new ItemSoupSBCraft(3403, 4, false).setUnlocalizedName("salmonSalad").setCreativeTab(tabSBCraft);
        LanguageRegistry.addName(salmonSalad, "Salmon Salad");
        GameRegistry.addShapelessRecipe(new ItemStack(salmonSalad, 1), new Object[] { new ItemStack(Item.fishRaw, 2), new ItemStack(Item.bowlEmpty, 1), new ItemStack(Item.bakedPotato, 1), new ItemStack(boiledEgg, 1) });

        cheese = new ItemFoodSBCraft(3405, 2, 1.1F, true).setUnlocalizedName("cheese").setCreativeTab(tabSBCraft);
        LanguageRegistry.addName(cheese, "Cheese");
        GameRegistry.addShapelessRecipe(new ItemStack(cheese, 2), new Object[] { new ItemStack(Item.bucketMilk, 0, 3) });

        tomato = new ItemSeedFoodSBCraft(3406, 3, 0.3F, tomatoCrop.blockID, Block.tilledField.blockID).setUnlocalizedName("tomato").setCreativeTab(tabSBCraft);
        LanguageRegistry.addName(tomato, "Tomato");
    }

}
