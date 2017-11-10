package ability;

import org.bukkit.entity.Entity;

public abstract class Metaphysical implements Ability
{
	/* 
	 * This class is for abilities that usually pertain to buffs and debuffs to the entity.
	 * 
	 * May also include abilities that actively affect players such as a heal ability or curse ability
	 * ex: increased damage dealt/taken, passively jump higher, absorption
	 */
	
	public abstract Entity getEntity();
	
	public abstract void setBuffDuration();
	
	// Allows the possiblity of effects that make the entity immune to certain metaphysical abilities
	public abstract boolean isHarmful();
}
