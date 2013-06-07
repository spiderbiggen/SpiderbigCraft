package spiderbiggen.sbc;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSBCraft extends Item {

    public ItemSBCraft(int par1){
        super(par1);
        this.setCreativeTab(SpiderbigCraft.tabSBCraft);
    }


    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(Reference.MOD_NAME + ":" + this.getUnlocalizedName().substring(5));
    }

}
