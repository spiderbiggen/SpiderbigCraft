package spiderbiggen.sbc;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabSBCraft extends CreativeTabs {

    public CreativeTabSBCraft(String par2Str){
        super(par2Str);
    }

    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex(){
        return SpiderbigCraft.eggSalad.itemID;
    }

    @Override
    public String getTranslatedTabLabel(){
        return "Spiderbig Craft";
    }
}
