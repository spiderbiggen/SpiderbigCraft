package spiderbiggen.sbc.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import spiderbiggen.sbc.container.ContainerGrillBlock;
import spiderbiggen.sbc.lib.IDs;
import spiderbiggen.sbc.tileentity.TileEntityGrillBlock;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
    
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if (tileEntity != null) {
            switch (ID) {
                case IDs.GUIIDGRILL:
                    if (tileEntity instanceof TileEntityGrillBlock) {
                        return new ContainerGrillBlock(player.inventory, (TileEntityGrillBlock) tileEntity);
                    }
                default:
            }
        }
        return null;
    }
    
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if (tileEntity != null) {
            switch (ID) {
                case IDs.GUIIDGRILL:
                    if (tileEntity instanceof TileEntityGrillBlock) {
                        return new GuiGrillBlock(player.inventory, (TileEntityGrillBlock) tileEntity);
                    }
                default:
            }
        }
        return null;
    }
    
}
