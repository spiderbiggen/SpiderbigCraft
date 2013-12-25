package spiderbiggen.sbc.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.lib.IDs;
import spiderbiggen.sbc.lib.Reference;

public class SBCBlocks {
    
    public static Block tomatoCrop;
    public static Block grillIdle;
    public static Block grillActive;
    public static Block trap;
    public static Block spiderOre;
    
    public static void InitBlocks() {
        tomatoCrop = new TomatoCrop(IDs.TOMATOCROPID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "tomatoCrop").setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
        grillIdle = new GrillBlock(IDs.GRILLBLOCKID, false).setUnlocalizedName(Reference.RESOURCE_PREFIX + "grillBlock").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(SpiderbigCraft.tabSBCraft);
        grillActive = new GrillBlock(IDs.GRILLBLOCKACTIVEID, true).setUnlocalizedName(Reference.RESOURCE_PREFIX + "grillBlock").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setLightValue(0.8F);
        trap = new TrapBlock(IDs.TRAPBLOCKID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "trapBlock").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(SpiderbigCraft.tabSBCraft);
        spiderOre = new SpiderOre(IDs.SPIDEROREID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "spiderOre");
    }
}
