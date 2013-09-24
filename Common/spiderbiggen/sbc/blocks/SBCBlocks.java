package spiderbiggen.sbc.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import spiderbiggen.sbc.SpiderbigCraft;
import spiderbiggen.sbc.lib.BlockIDs;
import spiderbiggen.sbc.lib.Reference;
import net.minecraft.block.Block;

public class SBCBlocks {

    public static Block tomatoCrop;
    public static Block grill;
    public static Block trap;

    public static void InitBlocks() {
	tomatoCrop = new TomatoCrop(BlockIDs.TOMATOCROPID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "tomatoCrop").setHardness(0.0F).setStepSound(Block.soundGrassFootstep);
	GameRegistry.registerBlock(tomatoCrop, "TomatoCrop");
	grill = new GrillBlock(BlockIDs.GRILLBLOCKID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "grillBlock").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(SpiderbigCraft.tabSBCraft);
	GameRegistry.registerBlock(grill, "Grill");
	trap = new TrapBlock(BlockIDs.TRAPBLOCKID).setUnlocalizedName(Reference.RESOURCE_PREFIX + "trapBlock").setHardness(2.0F).setStepSound(Block.soundMetalFootstep).setCreativeTab(SpiderbigCraft.tabSBCraft);
	GameRegistry.registerBlock(trap, "Trap");
    }
}
