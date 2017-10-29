package kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class PaladinKit 
{
	public void givePaladinKit(Player player)
	{
		player.getInventory().clear();
		
		ItemStack chestArmor = new ItemStack(Material.GOLD_CHESTPLATE);
		ItemStack leggings = new ItemStack(Material.GOLD_LEGGINGS);
		ItemStack helmet = new ItemStack(Material.GOLD_HELMET);
		ItemStack boots = new ItemStack(Material.GOLD_BOOTS);
		ItemStack weapon = new ItemStack(Material.GOLD_AXE);
		ItemStack shield = new ItemStack(Material.SHIELD);
		ItemStack ability1 = new ItemStack(Material.SPLASH_POTION);
		ItemStack ability2 = new ItemStack(Material.EMERALD);
		ItemStack ability3 = new ItemStack(Material.IRON_INGOT);
		
		
		
		PlayerInventory inv = player.getInventory();
		
		inv.setChestplate(chestArmor);
		inv.setLeggings(leggings);
		inv.setHelmet(helmet);
		inv.setBoots(boots);
		inv.setItem(0, weapon);
		inv.setItemInOffHand(shield);
		inv.setItem(1, ability1);
		inv.setItem(2, ability2);
		inv.setItem(3, ability3);
	}

}
