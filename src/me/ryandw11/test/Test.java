package me.ryandw11.test;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
	@Override
	public void onEnable() {
		Bukkit.getLogger().warning("This is a test.");
	}
}
