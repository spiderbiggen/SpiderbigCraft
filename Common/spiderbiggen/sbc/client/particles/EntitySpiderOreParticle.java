package spiderbiggen.sbc.client.particles;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;
import spiderbiggen.sbc.blocks.SpiderOre;

public class EntitySpiderOreParticle extends EntityFX {
    
    public EntitySpiderOreParticle(World world, double x, double y, double z, double motionX, double motionY, double motionZ) {
        super(world, x, y, z, motionX, motionY, motionZ);
        setParticleIcon(SpiderOre.particleIcon);
    }
    
    @Override
    public int getFXLayer() {
        return 1;
    }
    
}
