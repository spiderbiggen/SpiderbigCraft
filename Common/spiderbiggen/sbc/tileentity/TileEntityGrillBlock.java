package spiderbiggen.sbc.tileentity;

import net.minecraft.tileentity.TileEntity;

public class TileEntityGrillBlock extends TileEntity {
    private String localizedName;

    public void setGuiDisplayName(String displayName) {
	this.localizedName = displayName;
    }

    public String getLocalizedName() {
	return localizedName;
    }

    public boolean isInvNameLocalized() {
	return true;
    }
}
