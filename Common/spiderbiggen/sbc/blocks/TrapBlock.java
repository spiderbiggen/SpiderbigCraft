package spiderbiggen.sbc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TrapBlock extends Block {
    
    @SideOnly(Side.CLIENT)
    private Icon topIcon;
    @SideOnly(Side.CLIENT)
    private Icon topIconActive;
    @SideOnly(Side.CLIENT)
    private Icon sideIcon;
    @SideOnly(Side.CLIENT)
    private Icon botIcon;
    
    public TrapBlock(int par1) {
        super(par1, Material.iron);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        topIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "Grill_Top");
        topIconActive = register.registerIcon(Reference.RESOURCE_PREFIX + "Grill_Top_Active");
        botIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "Grill_Bottom");
        sideIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "Grill_Side");
    }
    
    private boolean isEnabled(int meta) {
        return meta == 1;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        if (side == 0) {
            return botIcon;
        } else if (side == 1) {
            return isEnabled(meta) ? topIconActive : topIcon;
        } else {
            return sideIcon;
        }
    }
    
    @Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
        if (!world.isRemote) {
            spawnLava(world, x, y + 2, z);
        }
    }
    
    private void spawnLava(World world, int x, int y, int z) {
        if (world.isAirBlock(x, y, z)) {
            world.setBlock(x, y, z, Block.lavaStill.blockID);
        }
    }
    
}
