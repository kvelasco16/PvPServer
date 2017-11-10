package ability;

import org.bukkit.entity.Entity;

/* This abstract class is just for abilities that are physical in-game
 *		ex: casting a fireball, leaping forward, throwing spears, etc*/

public abstract class Physical implements Ability
{
	public abstract Entity getEntity();
	
	public abstract boolean causeDamage();
}