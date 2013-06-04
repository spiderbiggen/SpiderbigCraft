package spiderbiggen.sbc;

import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemFoodSBCraft extends ItemFood {

    public ItemFoodSBCraft(int id, int healAmount, float saturationmodifier, boolean isWolfsFav){
        super(id, healAmount, saturationmodifier, isWolfsFav);
        this.setCreativeTab(SpiderbigCraft.tabSBCraft);
    }
    public ItemFoodSBCraft(int id, int healAmount, boolean isWolfsFav){
        super(id, healAmount, isWolfsFav);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
        this.itemIcon= par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }

}
