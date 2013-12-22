package spiderbiggen.sbc.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSeedFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSeedFoodSBCraft extends ItemSeedFood {
    
    public ItemSeedFoodSBCraft(int par1, int par2, float par3, int par4, int par5) {
        super(par1, par2, par3, par4, par5);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
