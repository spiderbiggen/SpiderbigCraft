package spiderbiggen.sbc.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import spiderbiggen.sbc.SpiderbigCraft;
//import spiderbiggen.sbc.client.particles.EntitySpiderOreParticle;
import spiderbiggen.sbc.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SpiderOre extends Block {
    
    @SideOnly(Side.CLIENT)
    private Icon blockIcon;
    
    public SpiderOre(int blockId) {
        super(blockId, Material.rock);
        setHardness(1.5F);
        setStepSound(Block.soundStoneFootstep);
        setCreativeTab(SpiderbigCraft.tabSBCraft);
    }
    
    /*
     * @SideOnly(Side.CLIENT) public static Icon particleIcon;
     */
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        blockIcon = register.registerIcon(Reference.RESOURCE_PREFIX + "spiderOre");
        // particleIcon = register.registerIcon(Reference.RESOURCE_PREFIX +
        // "poisonBubble");
    }
    
    /*
     * @Override
     * 
     * @SideOnly(Side.CLIENT) public void randomDisplayTick(World world, int x,
     * int y, int z, Random rand) { for (int i = 0; 1 < 4; i++) {
     * 
     * float particleX = x + rand.nextFloat(); float particleY = y +
     * rand.nextFloat(); float particleZ = z + rand.nextFloat();
     * 
     * float particleMotionX = -0.5F + rand.nextFloat(); float particleMotionY =
     * -0.5F + rand.nextFloat(); float particleMotionZ = -0.5F +
     * rand.nextFloat();
     * 
     * Minecraft.getMinecraft().effectRenderer.addEffect(new
     * EntitySpiderOreParticle(world, particleX, particleY, particleZ,
     * particleMotionX, particleMotionY, particleMotionZ)); } }
     */
    
}
