package spiderbiggen.sbc.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAxeSBCraft extends ItemAxe {
    
    public ItemAxeSBCraft(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
}
