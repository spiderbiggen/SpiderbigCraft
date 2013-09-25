package spiderbiggen.sbc.container;

import spiderbiggen.sbc.tileentity.TileEntityGrillBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerGrillBlock extends Container {

    public ContainerGrillBlock(InventoryPlayer inventoryPlayer, TileEntityGrillBlock tileEntity) {
	// TODO Auto-generated constructor stub
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityplayer) {
	// TODO Auto-generated method stub
	return false;
    }

}
