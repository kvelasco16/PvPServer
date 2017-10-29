package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import kits.ArcherKit;
import kits.MageKit;
import kits.PaladinKit;
import kits.PeasantKit;
import kits.RogueKit;
import kits.WarriorKit;

public class PvPMain extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		System.out.println("\n \n \n Successful \n \n");
	}
	
	@Override
	public void onDisable()
	{
		
	}
	
	public boolean onCommand(CommandSender theSender, Command cmd, String commandLabel, String [] args)
	{
		Player player = (Player) theSender;
		if(commandLabel.equalsIgnoreCase("Paladin"))
		{
			PaladinKit pk = new PaladinKit();
			pk.givePaladinKit(player);
			
		}
		else if (commandLabel.equalsIgnoreCase("Rogue"))
		{
			RogueKit rk = new RogueKit();
			rk.giveRogueKit(player);
		}
		else if (commandLabel.equalsIgnoreCase("Warrior"))
		{
			WarriorKit wk = new WarriorKit();
			wk.giveWarriorKit(player);
		}
		else if (commandLabel.equalsIgnoreCase("Mage"))
		{
			MageKit mk = new MageKit();
			mk.giveMageKit(player);
		}
		else if (commandLabel.equalsIgnoreCase("Archer"))
		{
			ArcherKit ak = new ArcherKit();
			ak.giveArcherKit(player);
		}
		else if (commandLabel.equalsIgnoreCase("Peasant"))
		{
			PeasantKit pst = new PeasantKit();
			pst.givePeasantKit(player);
		}
		return false;
	}
}
