package spiderbiggen.sbc;

import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoupSBCraft extends ItemFoodSBCraft {

    public ItemSoupSBCraft(int id, int healAmount, boolean isWolfsFav){
        super(id, healAmount, isWolfsFav);
        this.setCreativeTab(SpiderbigCraft.tabSBCraft);
    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
        super.onEaten(par1ItemStack, par2World, par3EntityPlayer);
        return new ItemStack(Item.bowlEmpty);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }
}
