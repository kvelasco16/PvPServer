package kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class MageKit 
{
	public void giveMageKit(Player player)
	{
		player.getInventory().clear();
		
		ItemStack chestArmor = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
		ItemStack weapon = new ItemStack(Material.BLAZE_ROD);
		ItemStack ability1 = new ItemStack(Material.SNOW_BALL);
		ItemStack ability2 = new ItemStack(Material.MAGMA_CREAM);
		ItemStack ability3 = new ItemStack(Material.ENDER_PEARL);
		
		
		
		PlayerInventory inv = player.getInventory();
		
		inv.setChestplate(chestArmor);
		inv.setLeggings(leggings);
		inv.setHelmet(helmet);
		inv.setBoots(boots);
		inv.setItem(0, weapon);
		inv.setItem(1, ability1);
		inv.setItem(2, ability2);
		inv.setItem(3, ability3);
	}

}
