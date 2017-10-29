package kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class WarriorKit 
{
	public void giveWarriorKit(Player player)
	{
		player.getInventory().clear();
		
		ItemStack chestArmor = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack leggings = new ItemStack(Material.IRON_LEGGINGS);
		ItemStack boots = new ItemStack(Material.IRON_BOOTS);
		ItemStack weapon = new ItemStack(Material.STONE_SWORD);
		ItemStack ability1 = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemStack ability2 = new ItemStack(Material.FIREWORK);
		ItemStack ability3 = new ItemStack(Material.IRON_INGOT);
		
		
		
		PlayerInventory inv = player.getInventory();
		
		inv.setChestplate(chestArmor);
		inv.setLeggings(leggings);
		inv.setBoots(boots);
		inv.setItem(0, weapon);
		inv.setItem(1, ability1);
		inv.setItem(2, ability2);
		inv.setItem(3, ability3);
	}

}
