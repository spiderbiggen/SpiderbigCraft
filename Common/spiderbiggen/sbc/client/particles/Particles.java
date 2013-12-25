package spiderbiggen.sbc.client.particles;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;

public enum Particles {
    POISON;
    
    public void spawnParticle(World world, double x, double y, double z, double motX, double motY, double motZ){
        Minecraft mc = Minecraft.getMinecraft();
        if(mc.renderViewEntity !=null && mc.effectRenderer != null){
            int particleSetting = mc.gameSettings.particleSetting;
            if(particleSetting == 2 || particleSetting == 1 && world.rand.nextInt(2) == 0){
                return;
            }
            
            double distX = mc.renderViewEntity.posX - x;
            double distY = mc.renderViewEntity.posY - y;
            double distZ = mc.renderViewEntity.posZ - z;
            double dist = Math.pow(distX, 2) + Math.pow(distY, 2) + Math.pow(distZ, 2);
            if(dist > 256){
                return;
            }
            
            EntityFX particleEffect = null;
            switch(this){
                case POISON:
                    particleEffect = new EntitySpiderParticleFX(world, x, y, z, motX, motY, motZ);
                    break;
            }
            
            if(particleEffect != null){
                FMLClientHandler.instance().getClient().effectRenderer.addEffect(particleEffect);
            }
        }
        
    }
}
