package pixelmon.entities.pixelmon.interactions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import pixelmon.entities.pixelmon.Entity8HoldsItems;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class MiltankInteraction extends PixelmonInteraction {

	public MiltankInteraction() {
		super("Miltank", 2);
	}

	public boolean interact(EntityPlayer par1EntityPlayer) {
		if (numInteractions == 0)
			return false;

		ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();

		if (var2 != null && var2.itemID == Item.bucketEmpty.itemID) {
			if (--var2.stackSize <= 0) {
				par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(Item.bucketMilk));
			} else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.bucketMilk))) {
				par1EntityPlayer.dropPlayerItem(new ItemStack(Item.bucketMilk.itemID, 1, 0));
			}

			numInteractions--;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public PixelmonInteraction getInstance() {
		return new MiltankInteraction();
	}

}
