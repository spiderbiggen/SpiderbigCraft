package spiderbiggen.sbc.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.client.particles.Particles;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpiderOre extends Block {
    
    @SideOnly(Side.CLIENT)
    private Icon blockIcon;
    @SideOnly(Side.CLIENT)
    public Icon particleIcon;
    
    public SpiderOre(int blockId) {
        super(blockId, Material.rock);
        setHardness(1.5F);
        setStepSound(Block.soundStoneFootstep);
        setCreativeTab(SpiderbigCraft.tabSBCraft);
        setUnlocalizedName(Reference.RESOURCE_PREFIX + "spiderOre");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        blockIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "spiderOre");
        particleIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "poisonBubble");
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return blockIcon;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        if (rand.nextInt(2) == 0) {
            float X = x + rand.nextFloat();
            float Y = y + rand.nextFloat();
            float Z = z + rand.nextFloat();
            
            float motX = -0.4f + rand.nextFloat() * 0.8f;
            float motY = -0.4f + rand.nextFloat() * 0.8f;
            float motZ = -0.4f + rand.nextFloat() * 0.8f;
            Particles.POISON.spawnParticle(world, X, Y, Z, motX, motY, motZ);
        }
    }
}
