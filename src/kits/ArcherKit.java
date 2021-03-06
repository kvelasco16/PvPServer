package kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class ArcherKit 
{
	public void giveArcherKit(Player player)
	{
		player.getInventory().clear();
		
		ItemStack chestArmor = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
		ItemStack weapon = new ItemStack(Material.BOW);
		ItemStack arrow = new ItemStack(Material.ARROW);
		ItemStack ability1 = new ItemStack(Material.BLAZE_POWDER);
		ItemStack ability2 = new ItemStack(Material.TIPPED_ARROW);
		ItemStack ability3 = new ItemStack(Material.NETHER_STAR);
		
		
		
		PlayerInventory inv = player.getInventory();
		
		inv.setChestplate(chestArmor);
		inv.setLeggings(leggings);
		inv.setHelmet(helmet);
		inv.setBoots(boots);
		inv.setItem(0, weapon);
		inv.setItem(1, ability1);
		inv.setItem(2, ability2);
		inv.setItem(3, ability3);
		inv.setItem(8, arrow);
	}

}
