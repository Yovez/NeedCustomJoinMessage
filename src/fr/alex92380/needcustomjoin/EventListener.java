package fr.alex92380.needcustomjoin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventListener implements Listener {

	private Main main;

	public EventListener(Main main) {
		this.main = main;

	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		event.setJoinMessage(ChatColor.translateAlternateColorCodes('&',
				main.getConfig().getString("NeedCustomJoin.Join").replaceAll("%player%", player.getName())));
	}

	@EventHandler
	public void onLeave(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		event.setQuitMessage(ChatColor.translateAlternateColorCodes('&',
				main.getConfig().getString("NeedCustomJoin.Leave").replaceAll("%player%", player.getName())));
	}
}
