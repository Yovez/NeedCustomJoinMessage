package fr.alex92380.needcustomjoin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
	saveDefaultConfig();
		getServer().getPluginManager().registerEvents(new EventListener(this), this);
	}

}
