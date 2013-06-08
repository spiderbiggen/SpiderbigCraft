package spiderbiggen.sbc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTomatoCropSBCraft extends Block {

    public BlockTomatoCropSBCraft(int par1){
        super(par1, Material.plants);
        setTickRandomly(true);
        float f = 0.5F;
        setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
        this.disableStats();
    }

}
