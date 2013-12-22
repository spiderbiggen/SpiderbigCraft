package spiderbiggen.sbc.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import spiderbiggen.sbc.container.ContainerGrillBlock;
import spiderbiggen.sbc.lib.Reference;
import spiderbiggen.sbc.tileentity.TileEntityGrillBlock;

public class GuiGrillBlock extends GuiContainer {

    public static final ResourceLocation gui = new ResourceLocation(Reference.MOD_ID, "textures/gui/grill.png");
        
    public TileEntityGrillBlock grillBlock;

    public GuiGrillBlock(InventoryPlayer inventoryPlayer, TileEntityGrillBlock tileEntity) {
	super(new ContainerGrillBlock(inventoryPlayer, tileEntity));

	this.grillBlock = tileEntity;
	this.xSize = 176;
	this.ySize = 166;
    }

    public void drawGuiContainerForegrounLayer(int i, int j) {
	String name = this.grillBlock.isInvNameLocalized() ? this.grillBlock.getLocalizedName() : I18n.getString(this.grillBlock.getLocalizedName());
	this.fontRenderer.drawString(name, 8, 6, 4210752);
	this.fontRenderer.drawString(I18n.getString("container.inventory"), 8, this.ySize -  94, 4210752);
    }

    public void drawGuiContainerBackgroundLayer(float f, int i, int j) {

    }

}
