package spiderbiggen.sbc.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.lib.IDs;
import spiderbiggen.sbc.lib.Reference;
import spiderbiggen.sbc.tileentity.TileEntityGrillBlock;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GrillBlock extends BlockContainer {
    
    @SideOnly(Side.CLIENT)
    private Icon topIcon;
    @SideOnly(Side.CLIENT)
    private Icon topIconActive;
    @SideOnly(Side.CLIENT)
    private Icon sideIcon;
    @SideOnly(Side.CLIENT)
    private Icon botIcon;
    @SideOnly(Side.CLIENT)
    private Icon frontIcon;
    private final boolean isActive;
    
    public GrillBlock(int par1, boolean isActive) {
        super(par1, Material.iron);
        this.isActive = isActive;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        topIcon = register.registerIcon(isActive ? Reference.RESOURCE_PREFIX + "Grill_Top_Active" : Reference.RESOURCE_PREFIX + "Grill_Top");
        botIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "Grill_Bottom");
        sideIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "Grill_Side");
        frontIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "Grill_Front");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if (meta == 0 && side == 3) return frontIcon;
        if (side == meta && side > 1) return frontIcon;
        switch (side) {
            case 0:
                return botIcon;
            case 1:
                return topIcon;
            default:
                return sideIcon;
        }
    }
    
    public int idDropped(int par1, Random rand, int par3) {
        return SBCBlocks.grillIdle.blockID;
    }
    
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemstack) {
        int l = MathHelper.floor_double((player.rotationYaw / 90F) + 0.5D) & 3;
        
        switch (l) {
            case 0:
                world.setBlockMetadataWithNotify(x, y, z, 2, 2);
                break;
            case 1:
                world.setBlockMetadataWithNotify(x, y, z, 5, 2);
                break;
            case 2:
                world.setBlockMetadataWithNotify(x, y, z, 3, 2);
                break;
            case 3:
                world.setBlockMetadataWithNotify(x, y, z, 4, 2);
                break;
        }
        
        if (itemstack.hasDisplayName()) {
            ((TileEntityGrillBlock) world.getBlockTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
            ;
        }
    }
    
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote) {
            FMLNetworkHandler.openGui(player, SpiderbigCraft.instance, IDs.GUIIDGRILL, world, x, y, z);
        }
        return true;
    }
    
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityGrillBlock();
    }
}