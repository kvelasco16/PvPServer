package ability;

import org.bukkit.entity.Player;

public interface Ability
{
	// Method for performing the ability itself
	abstract void use(Player player);
}
