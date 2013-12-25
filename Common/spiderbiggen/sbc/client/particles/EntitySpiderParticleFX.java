package spiderbiggen.sbc.client.particles;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;
import spiderbiggen.sbc.blocks.SBCBlocks;

public class EntitySpiderParticleFX extends EntityFX {
    
    public EntitySpiderParticleFX(World par1World, double par2, double par4, double par6, double par8, double par10, double par12) {
        super(par1World, par2, par4, par6, par8, par10, par12);
        setParticleIcon(SBCBlocks.spiderOre.particleIcon);
        
        particleScale = 3;
        particleAlpha = 0.2f + rand.nextFloat() * 0.8f;
        particleRed = rand.nextFloat() * 0.5f + 0.5f;
        particleGreen = rand.nextFloat() * 0.5f;
        particleBlue = rand.nextFloat() *0.5f + 0.5f;
        
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        particleScale = (1 - (float)particleAge/particleMaxAge)*3;
    }
    
    @Override
    public int getFXLayer() {
        return 1;
    }
}
