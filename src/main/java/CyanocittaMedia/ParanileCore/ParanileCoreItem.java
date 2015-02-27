package CyanocittaMedia.ParanileCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ParanileCoreItem extends Item
{
	public ParanileCoreItem()
	{
		// Constructor Configuration
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("ParanileCoreItem");
	}
}
