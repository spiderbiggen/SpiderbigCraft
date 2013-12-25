package spiderbiggen.sbc.world;

import java.util.Random;

import spiderbiggen.sbc.blocks.SBCBlocks;
import spiderbiggen.sbc.lib.IDs;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHandler implements IWorldGenerator {
    
    private WorldGenerator poisonGen;
    
    public WorldGenHandler() {
        GameRegistry.registerWorldGenerator(this);
        poisonGen = new WorldGenMinable(IDs.SPIDEROREID, 16);
    }
    
    public void generateStandardOre(Random rand, int chunkX, int chunkZ, World world, int iterations, WorldGenerator gen, int minY, int maxY) {
        for (int i = 0; i < iterations; i++) {
            
            int x = chunkX * 16 + rand.nextInt(16);
            int y = rand.nextInt(maxY - minY) + minY;
            int z = chunkZ * 16 + rand.nextInt(16);
            
            gen.generate(world, rand, x, y, z);
        }
    }
    
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        generateStandardOre(random, chunkX, chunkZ, world, 20, poisonGen, 20, 128);
    }
}
