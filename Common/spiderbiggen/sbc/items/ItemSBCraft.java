package spiderbiggen.sbc.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSBCraft extends Item {

    public ItemSBCraft(int par1){
        super(par1);
        this.setCreativeTab(SpiderbigCraft.tabSBCraft);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister){
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

}
