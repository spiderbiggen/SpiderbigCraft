package spiderbiggen.sbc.blocks;

import net.minecraft.tileentity.TileEntity;

public class TileEntityGrillBlock extends TileEntity {
    private String localizedName;
    
    public void setGuiDisplayName(String displayName){
	this.localizedName = displayName;
    }

    public String getLocalizedName() {
	return localizedName;
    }
}
