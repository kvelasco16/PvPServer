package ability;

import org.bukkit.Sound;
import org.bukkit.entity.Entity;

/* This abstract class is just for abilities that are physical in-game
 *		ex: casting a fireball, leaping forward, throwing spears, etc*/

public abstract class Physical implements Ability
{
	private boolean harmful;
	private int damage;
	private Sound sound;
	
	// This variable will control how powerful the ability will be for balancing purposes.
	private int effectMultiplier;
	
	public abstract Entity getEntity();
	
	
	
	public int getDamage()
	{
		return damage;
	}
	
	public void setDamage(int damage)
	{
		this.damage = damage;
	}
	
	public boolean isHarmful()
	{
		return harmful;
	}
	
	public void setHarmful(boolean bool)
	{
		this.harmful = bool;
	}
	
	public void setSound(Sound sound)
	{
		this.sound = sound;
	}
	
	public Sound getSound()
	{
		return sound;
	}
}