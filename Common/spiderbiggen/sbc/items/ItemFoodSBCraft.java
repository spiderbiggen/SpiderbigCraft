package spiderbiggen.sbc.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import spiderbiggen.sbc.SpiderbigCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodSBCraft extends ItemFood {
    
    public ItemFoodSBCraft(int id, int healAmount, boolean isWolfsFav) {
        super(id, healAmount, isWolfsFav);
    }
    
    public ItemFoodSBCraft(int id, int healAmount, float saturationmodifier, boolean isWolfsFav) {
        super(id, healAmount, saturationmodifier, isWolfsFav);
        this.setCreativeTab(SpiderbigCraft.tabSBCraft);
    }
    
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(Item.bowlEmpty);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
}
