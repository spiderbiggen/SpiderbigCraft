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

    /**
     * Items
     */
    public static Item eggSalad = new ItemSoupSBCraft(3401, 3, false).setUnlocalizedName("eggSalad");
    public static Item potatoSalad;
    public static Item salmonSalad;
    public static Item boiledEgg;
    public static Item cheese;

    /**
     * CreativeTabs
     */
    public static CreativeTabs tabSBCraft = new CreativeTabs("tabSBCraft"){
        public ItemStack getIconItemStack() {
            return new ItemStack(eggSalad, 1, 0);
       }
    };

    @PreInit
    public void preInit(FMLPreInitializationEvent event){

    }

    public void Load(FMLInitializationEvent event){
        // items with their recipes
        boiledEgg = new ItemFoodSBCraft(3400, 1, 0.7F, false).setUnlocalizedName("boiledEgg");
        LanguageRegistry.addName(boiledEgg, "Boiled Egg");
        GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(boiledEgg), 0.5F);
        
        LanguageRegistry.addName(eggSalad, "Egg Salad");
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", "e", boiledEgg, "p", Item.bakedPotato, "b", Item.bowlEmpty);
        
        potatoSalad = new ItemSoupSBCraft(3402, 5, false).setUnlocalizedName("potatoSalad");
        LanguageRegistry.addName(potatoSalad, "Potato Salad");
        GameRegistry.addRecipe(new ItemStack(potatoSalad), " p ", "pgp", " b ", "p", Item.bakedPotato, "b", Item.bowlEmpty, "g", Block.tallGrass);
        
        salmonSalad = new ItemSoupSBCraft(3403, 4, false).setUnlocalizedName("salmonSalad");
        LanguageRegistry.addName(salmonSalad, "Salmon Salad");
        GameRegistry.addShapelessRecipe(new ItemStack(salmonSalad, 1), new Object[] { new ItemStack(Item.fishRaw, 2), new ItemStack(Item.bowlEmpty, 1), new ItemStack(Item.bakedPotato, 1), new ItemStack(boiledEgg, 1) });
        
        cheese = new ItemFoodSBCraft(3404, 2, 1.1F, true).setUnlocalizedName("cheese");
        LanguageRegistry.addName(cheese, "Cheese");
        GameRegistry.addShapelessRecipe(new ItemStack(cheese, 2), new Object[]{ new ItemStack(Item.bucketMilk, 3)});
    }

    @Init
    public void Init(FMLInitializationEvent event){
        System.out.println("Initializing " + Reference.MOD_NAME + " Version: " + Reference.VERSION);

    }

    @PostInit
    public void preInit(FMLPostInitializationEvent event){
        System.out.println("Done Loading " + Reference.MOD_NAME + " Version: " + Reference.VERSION);
    }

}
