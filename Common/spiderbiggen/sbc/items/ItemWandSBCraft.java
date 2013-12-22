package spiderbiggen.sbc.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import spiderbiggen.sbc.SpiderbigCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWandSBCraft extends Item {
    private float pwr;
    private int chrg;
    
    public ItemWandSBCraft(int id, float power, int chrgspd) {
        super(id);
        setCreativeTab(SpiderbigCraft.tabSBCraft);
        setMaxStackSize(1);
        this.pwr = power;
        this.chrg = chrgspd;
    }
    
    @Override
    public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLivingBase target) {
        if (!target.worldObj.isRemote) {
            if (isCharged(itemStack.getItemDamage())) {
                target.setFire((int) (pwr * 5.0f));
                target.motionY = pwr * 2;
                itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            } else {
                target.setFire((int) (pwr * 2.5f));
                target.motionY = pwr;
                itemStack.setItemDamage(itemStack.getItemDamage() + 1);
            }
        }
        return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation) {
        info.add("This Wand has been used " + itemstack.getItemDamage() + " times.");
        if (isCharged(itemstack.getItemDamage())) {
            info.add("This item is now charged!");
        } else {
            info.add("this item has been charged " + itemstack.getItemDamage() % chrg + " out of " + chrg + " times");
        }
    }
    
    private boolean isCharged(int dmg) {
        return dmg % chrg == 0 && dmg != 0;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
    
}
