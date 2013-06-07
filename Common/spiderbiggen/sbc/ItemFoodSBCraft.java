package spiderbiggen.sbc;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodSBCraft extends ItemFood {

    public ItemFoodSBCraft(int id, int healAmount, float saturationmodifier, boolean isWolfsFav){
        super(id, healAmount, saturationmodifier, isWolfsFav);
        this.setCreativeTab(SpiderbigCraft.tabSBCraft);
    }

    public ItemFoodSBCraft(int id, int healAmount, boolean isWolfsFav){
        super(id, healAmount, isWolfsFav);
    }

    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName().substring(5));
    }

}
