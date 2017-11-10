package ability;

import org.bukkit.Sound;

public interface Ability
{
	// Method for performing the ability itself
	abstract void use();
	abstract void playSound(Sound sound);
}
