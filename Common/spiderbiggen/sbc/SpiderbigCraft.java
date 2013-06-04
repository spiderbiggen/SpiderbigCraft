package spiderbiggen.sbc;

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
    public static Item eggSalad;
    public static Item potatoSalad;

    /**
     * CreativeTabs
     */
    public static CreativeTabs tabSBCraft = new CreativeTabs("tabSBCraft"){
        public ItemStack getIconItemStack(){
            return new ItemStack(eggSalad, 1, 0);
        }
    };

    @PreInit
    public void preInit(FMLPreInitializationEvent event){

    }

    public void Load(FMLInitializationEvent event){
        // items with their recipes
        eggSalad = new ItemSoupSBCraft(3400, 4, false).setUnlocalizedName("eggSalad");
        LanguageRegistry.addName(eggSalad, "Egg Salad");
        GameRegistry.addRecipe(new ItemStack(eggSalad), " e ", "epe", " b ", "e", Item.egg, "p", Item.potato, "b", Item.bowlEmpty);
        potatoSalad = new ItemSoupSBCraft(3400, 4, false).setUnlocalizedName("potatoSalad");
        LanguageRegistry.addName(potatoSalad, "Potato Salad");
    }

    @Init
    public void Init(FMLInitializationEvent event){
        System.out.println("Initializing " + Reference.MOD_NAME + " Version: " + Reference.VERSION);

    }

    @PostInit
    public void preInit(FMLPostInitializationEvent event){

    }

}
