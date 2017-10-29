package kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class PeasantKit 
{
	public void givePeasantKit(Player player)
	{
		player.getInventory().clear();
		
		ItemStack chestArmor = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack weapon = new ItemStack(Material.DIAMOND_HOE);
		ItemStack ability1 = new ItemStack(Material.BUCKET);
		ItemStack ability2 = new ItemStack(Material.BOWL);
		ItemStack ability3 = new ItemStack(Material.LEASH);
		
		
		
		PlayerInventory inv = player.getInventory();
		
		inv.setChestplate(chestArmor);
		inv.setLeggings(leggings);
		inv.setItem(0, weapon);
		inv.setItem(1, ability1);
		inv.setItem(2, ability2);
		inv.setItem(3, ability3);
	}

}
