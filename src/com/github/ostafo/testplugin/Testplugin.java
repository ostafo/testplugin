package com.github.ostafo.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Testplugin extends JavaPlugin{
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new TestPluginListener(), this);
	}
}
