package spiderbiggen.sbc.blocks;

import net.minecraft.block.Block;

public class SBCBlocks {

    public static Block tomatoCrop;

    public static void InitBlocks(){
        tomatoCrop = new TomatoCrop(3399).setUnlocalizedName("tomatoCrop").setHardness(0.0F).setStepSound(Block.soundGrassFootstep);

    }

}