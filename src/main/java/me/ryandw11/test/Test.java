package main.java.me.ryandw11.test;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
	@Override
	public void onEnable() { //test
		Bukkit.getLogger().warning("This is a test.");
	}
}
