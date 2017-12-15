package events;

import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventListener 
{
	public void onPlayerInteract(PlayerInteractEvent event)
	{
		switch(event.getPlayer().getInventory().getItemInMainHand().getType())
		{
		case WOOD_SWORD:
			break;
			
		case ACACIA_DOOR:
			break;
		
		default:
			break;
		}
	}
}
